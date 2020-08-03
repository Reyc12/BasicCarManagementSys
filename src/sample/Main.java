package sample;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;




public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        /*Button btn = new Button();
        btn.setText("Say Hello World");
        btn.setOnAction(event -> System.out.println("Hello World"));
        primaryStage.setTitle("Autogas NG");
        StackPane layout = new StackPane();
        layout.getChildren().add(btn);
        primaryStage.setScene(new Scene(layout, 300, 275));
        primaryStage.show();*/


        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Autogas NG");




        primaryStage.setScene(new Scene(root, 900, 700));
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
