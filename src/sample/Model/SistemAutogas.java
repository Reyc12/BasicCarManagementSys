package sample.Model;


import java.sql.Date;

public class SistemAutogas {

    private final String emerMarke;
    private  final String numerSerial;
    private  final Date dateInstalimi;
    private final long kilometra;

    public SistemAutogas(String emerMarke, String numerSerial, Date dateInstalimi, long kilometra) {
        this.emerMarke = emerMarke;
        this.numerSerial = numerSerial;
        this.dateInstalimi = dateInstalimi;
        this.kilometra = kilometra;
    }
}
