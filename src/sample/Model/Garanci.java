package sample.Model;


import java.sql.Date;

public class Garanci {
    private final String numerShasie;
    private final String numerProdukti;
    private final Date dateFillimi;
    private final Date dateSkadimi;
    private final long kilometrat;
    private Boolean aktive;

    public Garanci(String numerShasie, String numerProdukti, Date dateFillimi, Date dateSkadimi, long kilometrat, Boolean aktive) {
        this.numerShasie = numerShasie;
        this.numerProdukti = numerProdukti;
        this.dateFillimi = dateFillimi;
        this.dateSkadimi = dateSkadimi;
        this.kilometrat = kilometrat;
        this.aktive = aktive;
    }
}
