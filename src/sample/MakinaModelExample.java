package sample;

import java.util.Date;

public class MakinaModelExample {
    private final String ownerName;
    private  final String marka;
    private final String lloji;
    private final String tipi;
    private final String targa;
    private final String ngjyre;



    public MakinaModelExample(String ownerName1, String marka, String lloji, String tipi, String targa,  String ngjyre) {
        this.ownerName = ownerName1;
        this.marka = marka;
        this.lloji = lloji;
        this.tipi = tipi;
        this.targa = targa;
        this.ngjyre = ngjyre;
    }

    public String getTarga() {
        return targa;
    }

    public String getTipi() {
        return tipi;
    }

    public String getLloji() {
        return lloji;
    }

    public String getMarka() {
        return marka;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getNgjyre() {
        return ngjyre;
    }
}

