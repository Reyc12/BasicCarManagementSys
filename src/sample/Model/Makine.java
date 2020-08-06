package sample.Model;

import java.util.Date;

public class Car {
        private  final String marka;
        private final String lloji;
        private final String tipi;
        private final String targa;
        private final String numer_shasie;
        private final String numer_motorri;
        private final String ngjyre;
        private final String karburanti;
        private final String kubike;
        private final Date registrationDate;


        public Car(int carID, String marka, String lloji, String tipi, String targa, String numer_shasie, String numer_motorri, String ngjyre, String karburanti, String kubike, Date registrationDate) {
            this.marka = marka;
            this.lloji = lloji;
            this.tipi = tipi;
            this.targa = targa;
            this.numer_shasie = numer_shasie;
            this.numer_motorri = numer_motorri;
            this.ngjyre = ngjyre;
            this.karburanti = karburanti;
            this.kubike = kubike;
            this.registrationDate = registrationDate;
        }

    }
