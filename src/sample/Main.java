package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.DatabaseManager.DbManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


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
        String query = "SELECT * FROM cars";
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Autogas NG");


        primaryStage.setScene(new Scene(root, 1300, 900));
        primaryStage.show();

        try{
            Connection connection = DbManager.getConnection();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()){
                System.out.println(rs.getInt("car_id") + rs.getString("car_marka")+ rs.getDate("car_registration_date"));
            }
        }catch (SQLException e){
            System.err.println(e);
        }/*finally {
            if(connection != null){
                connection.close();
            }
        }*/

    }


    public static void main(String[] args) {
        launch(args);
    }
}
