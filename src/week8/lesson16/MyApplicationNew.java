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

public class MyApplicationNew extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My First application");
        primaryStage.setScene(createScene1());
        primaryStage.show();

    }
    Button btn1;
    Button btn2;
    TextField text1;
    TextField text2;

    public Scene createScene() {
        HBox box = new HBox();

        Button btn1 = new Button("Кнопка 1");
        TextField text = new TextField();

        box.getChildren().add(btn1);
        box.getChildren().add(text);
  /*
   * btn1.setOnAction(new EventHandler<ActionEvent>() {
   *
   * @Override public void handle(ActionEvent event) {
   * text.setText("privet"); } });
   */
        btn1.setOnAction(new MyEvent());

        Scene scene = new Scene(box, 400, 600);
        return scene;
    }
    public Scene createScene1() {
        HBox mainBox = new HBox();

        btn1 = new Button("Кнопка 1");
        btn2 = new Button("Кнопка 2");
        text1 = new TextField();
        text2 = new TextField();

        btn1.setOnAction(new MyEvent());
        btn2.setOnAction(new MyEvent());

        mainBox.getChildren().add(createOneBox(btn1,text1));
        mainBox.getChildren().add(createOneBox(btn2,text2));

        Scene scene = new Scene(mainBox, 400, 600);
        return scene;
    }
    public VBox createOneBox(Button btn, TextField text) {
        VBox box = new VBox();

        box.getChildren().add(btn);
        box.getChildren().add(text);
        return box;
    }

    class MyEvent implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            if(event.getSource() == btn1){
                text2.setText(text1.getText());
                text1.setText("");
            } else {
                text1.setText(text2.getText());
                text2.setText("");
            }
        }
    }
}