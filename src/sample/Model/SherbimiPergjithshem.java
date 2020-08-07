package sample.Model;

import java.sql.Date;

public class SherbimiPergjithshem {
    private  final String emerMarke;
    private String numerShasie;
    private String pershkrimi;
    private  final Date dateInstalimi;
    private final long kilometrat;


    public SherbimiPergjithshem(String emerMarke, String numerShasie, String pershkrimi, Date dateInstalimi, long kilometrat) {
        this.emerMarke = emerMarke;
        this.numerShasie = numerShasie;
        this.pershkrimi = pershkrimi;
        this.dateInstalimi = dateInstalimi;
        this.kilometrat = kilometrat;
    }
}
