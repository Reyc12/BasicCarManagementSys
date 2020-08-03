package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class MakinaController implements Initializable {

    public AnchorPane searchCarForm;
    public AnchorPane registerCarForm;
    @FXML
    public TableView<MakinaModelExample> tabela;
    @FXML public TableColumn<MakinaModelExample,String> pronari;
    @FXML public TableColumn<MakinaModelExample,String> marka;
    @FXML public TableColumn<MakinaModelExample,String> lloji;



    final ObservableList<MakinaModelExample> data = FXCollections.observableArrayList(
            new MakinaModelExample("Etnor Duka","Porsche","Cayenne","2.7","AA123BB","E kuqe"),
            new MakinaModelExample("Etnor Duka","Porsche","Cayenne","2.7","AA123BB","E kuqe"),
            new MakinaModelExample("Etnor Duka","Porsche","Cayenne","2.7","AA123BB","E kuqe"),
            new MakinaModelExample("Etnor Duka","Porsche","Cayenne","2.7","AA123BB","E kuqe"),
            new MakinaModelExample("Etnor Duka","Porsche","Cayenne","2.7","AA123BB","E kuqe")
    );


    public void searchButtonClicked(){
        System.out.println("fucking made it");
        searchCarForm.setVisible(true);
        registerCarForm.setVisible(false);

    }
    public void registerButtonClicked(){
        System.out.println("fucking maaade it");
        searchCarForm.setVisible(false);
        registerCarForm.setVisible(true);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        pronari.setCellFactory();
    }
}
