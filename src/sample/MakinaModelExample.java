package sample;

import javafx.beans.property.SimpleStringProperty;

import java.util.Date;

public class MakinaModelExample {
    private final SimpleStringProperty ownerName;
    private  final SimpleStringProperty marka;
    private final SimpleStringProperty lloji;



    public MakinaModelExample(String ownerName1, String marka, String lloji) {
        this.ownerName = new SimpleStringProperty (ownerName1);
        this.marka = new SimpleStringProperty(marka);
        this.lloji = new SimpleStringProperty(lloji);
    }

    public String getLloji() {
        return lloji.get();
    }

    public String getMarka() {
        return marka.get();
    }

    public String getOwnerName() {
        return ownerName.get();
    }


}

