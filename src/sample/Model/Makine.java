package sample.Model;


import java.sql.Date;

public class Makine {
        private  final String marka;
        private final String lloji;
        private final String emertimteknik;
        private final String targa;
        private final String numerShasie;
        private final String numerMotorri;
        private final String ngjyre;
        private final String karburanti;
        private final String kubike;
        private final Date dateRegjistrimi;


        public Makine(String marka, String lloji, String emertimteknik, String targa, String numer_shasie, String numer_motorri, String ngjyre, String karburanti, String kubike, Date dateRegjistrimi) {
            this.marka = marka;
            this.lloji = lloji;
            this.emertimteknik = emertimteknik;
            this.targa = targa;
            this.numerShasie = numer_shasie;
            this.numerMotorri = numer_motorri;
            this.ngjyre = ngjyre;
            this.karburanti = karburanti;
            this.kubike = kubike;
            this.dateRegjistrimi = dateRegjistrimi;
        }

    }
