package week8.lesson16;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MyApplicationOleg extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("My First application");
        primaryStage.setScene(createScene());
        primaryStage.show();
    }

    public Scene createScene(){

        HBox box  = new HBox();

        Button btn1 = new Button("Кнопка 1");
        TextField text = new TextField();

        box.getChildren().add(btn1);
        box.getChildren().add(text);

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                text.setText("privet");
            }
        });

        Scene scene = new Scene(box,400,600);

        return scene;

    }
}
