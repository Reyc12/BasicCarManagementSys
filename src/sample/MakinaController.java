package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import sample.DatabaseManager.DbManager;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class MakinaController implements Initializable {

    // Makina Tab.........................................................................................
    public AnchorPane searchCarForm;
    public AnchorPane registerCarForm;
    public TextField carRegisterTarga;
    public TextField carRegisterShasia;
    public TextField carRegisterMarka;
    public TextField carRegisterEmertimiTeknik;
    public TextField carRegisterNgjyra;

    public void regjistroMakineClicked(){
        searchCarForm.setVisible(false);
        registerCarForm.setVisible(true);
    }
    public void gjejMakineClicked(){
        searchCarForm.setVisible(true);
        registerCarForm.setVisible(false);
    }
    public void searchForACar(){
        printDetails(carRegisterTarga.getText(),carRegisterShasia.getText(),carRegisterMarka.getText(),carRegisterEmertimiTeknik.getText(),carRegisterNgjyra.getText());
    }
    public void printDetails(String a,String b,String c, String d, String  e){


        /*String query = "Select car_marka FROM cars WHERE car_marka="+a;
        try{
            Connection connection = DbManager.getConnection();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()){
                System.out.println(rs.getInt("car_id") + rs.getString("car_marka")+ rs.getDate("car_registration_date"));
            }
        }catch (SQLException err){
            System.err.println(err);
        }*/

    }
    // Sherbime Tab.........................................................................................
    // Garanci Tab.........................................................................................
    // Info Tab.........................................................................................









    // .....Makina Tab

    public Text firstTextDisplay;
    @FXML
    public TableView<MakinaModelExample> tabela;
    @FXML public TableColumn<MakinaModelExample,String> pronari;
    @FXML public TableColumn<MakinaModelExample,String> marka;
    @FXML public TableColumn<MakinaModelExample,String> lloji;


    final ObservableList<MakinaModelExample> data = FXCollections.observableArrayList(
            new MakinaModelExample("Etnor Duka1","Porsche","Cayenne"),
            new MakinaModelExample("Etnor Duka2","Borsche","Cayenne"),
            new MakinaModelExample("Etnor Duka3","Porsche","Cayenne"),
            new MakinaModelExample("Etnor Duka4","Porsche","Cayenne"),
            new MakinaModelExample("Etnor Duka5","Porsche","Cayenne")
    );

    final ObservableList<String> servicesList = FXCollections.observableArrayList("Impjant Autogas", "Pjese Kembimi","Sherbim i Pergjithshem");

    //Sherbime Tab.................
    @FXML public ChoiceBox servicesBox;
    public AnchorPane autogasSystemServices;
    public AnchorPane partsExchangeServices;
    public Pane servicesRegButtonPane;
    public Pane sherbimIPergjithshem;
    public Pane warrantyPane;
    public Pane warrantyPane2;


    public void warrantyButtonClicked (){
        if(!warrantyPane.isVisible()){
            warrantyPane.setVisible(true);
        }else{
            warrantyPane.setVisible(false);
        }
    }
    public void warranty2ButtonClicked (){
        if(!warrantyPane2.isVisible()){
            warrantyPane2.setVisible(true);
        }else{
            warrantyPane2.setVisible(false);
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        pronari.setCellValueFactory(new PropertyValueFactory<MakinaModelExample,String>("ownerName"));
        marka.setCellValueFactory(new PropertyValueFactory<MakinaModelExample,String>("marka"));
        lloji.setCellValueFactory(new PropertyValueFactory<MakinaModelExample,String>("lloji"));

        tabela.setItems(data);
        servicesBox.setItems(servicesList);


        servicesBox.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>(){

            public void changed (ObservableValue ov, Number value, Number new_value){
                if(new_value.intValue()==0){
                    autogasSystemServices.setVisible(true);
                    partsExchangeServices.setVisible(false);
                    sherbimIPergjithshem.setVisible(false);
                }else if(new_value.intValue()==1) {
                    autogasSystemServices.setVisible(false);
                    partsExchangeServices.setVisible(true);
                    sherbimIPergjithshem.setVisible(false);
                }else{
                    autogasSystemServices.setVisible(false);
                    partsExchangeServices.setVisible(false);
                    sherbimIPergjithshem.setVisible(true);
                }
            }
        }
        );
    }



    public void tableCellClicked(){
        System.out.println("keep on going...");

                System.out.println(tabela.getSelectionModel().getSelectedItem().getOwnerName());
                String a = tabela.getSelectionModel().getSelectedItem().getMarka();
                String b = tabela.getSelectionModel().getSelectedItem().getLloji();
                String c = tabela.getSelectionModel().getSelectedItem().getOwnerName();

        firstTextDisplay.setText("Pronari: "+c+"    Marka: "+a+"   Lloji: "+b+"   Targa: AA234AA\n" +
                        "\n" +
                        "Tipi:    2.7           Numri Shasise:                  Numri Motorrit:     \n" +
                        "\n" +
                        "Ngjyra:             Karburanti:            Kubike:\n" +
                        "\n" +
                        "Data e Regjistrimit:\n" +
                        "\n" +
                        "A ka Garanci Aktive ? \n" +
                        "Garanci Pjesesh\n" +
                        "Garanci Autogazi");

    }

   // .................All the other Functions....................







}
