package sample.Model;


import java.sql.Date;

public class PjeseKembimi {

    private  final String emerMarke;
    private  final String numerSerial;
    private String numerShasie;
    private  final String kodIdentifikimi;
    private  final Date dateInstalimi;
    private final long kilometrat;

    public PjeseKembimi(String emerMarke, String numerSerial, String numerShasie, String kodIdentifikimi, Date dateInstalimi, long kilometrat) {
        this.emerMarke = emerMarke;
        this.numerSerial = numerSerial;
        this.numerShasie = numerShasie;
        this.kodIdentifikimi = kodIdentifikimi;
        this.dateInstalimi = dateInstalimi;
        this.kilometrat = kilometrat;
    }


}
