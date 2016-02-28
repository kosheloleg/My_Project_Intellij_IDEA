package week8.lesson16;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CatMyApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My First application");
        primaryStage.setScene(createScene());
        primaryStage.show();

    }

    TextField text;
    TextField text1;
    Button btn1;
    Button btn2;

    public Scene createScene() {

        HBox mainBox = new HBox();

        VBox box = new VBox();
        VBox vbox = new VBox();

        mainBox.getChildren().add(box);
        mainBox.getChildren().add(vbox);

        btn1 = new Button("Кнопка 1");
        btn2 = new Button("Кнопка 2");

        text = new TextField();
        text1 = new TextField();

        box.getChildren().add(btn1);
        box.getChildren().add(text);


        vbox.getChildren().add(btn2);
        vbox.getChildren().add(text1);

  /*
   * btn1.setOnAction(new EventHandler<ActionEvent>() {
   *
   * @Override public void handle(ActionEvent event) {
   * text.setText("privet"); } });
   */
        btn1.setOnAction(new MyEvent());
        btn2.setOnAction(new MyEvent());

        Scene scene = new Scene(mainBox, 400, 600);
        return scene;
    }

    class MyEvent implements EventHandler<ActionEvent> {
        private String name;

        @Override
        public void handle(ActionEvent event) {

            if (event.getSource() == btn1){

                text1.setText(text.getText());
                text.setText("");


            }

            if (event.getSource() == btn2){

                text.setText(text1.getText());
                text1.setText("");

            }

        }
    }
}