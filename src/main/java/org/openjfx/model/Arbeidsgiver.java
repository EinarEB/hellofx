package org.openjfx.model;

import org.openjfx.model.vo.Adresse;
import org.openjfx.model.vo.Bransje;
import org.openjfx.model.vo.KontaktInformasjon;
import org.openjfx.model.vo.Sektor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Arbeidsgiver implements Serializable {


    private String sektor;
    private String adresse;
    private String bransje;
    private int telfone;
    private String epost;
    private String Ledigevikariater;

    public Arbeidsgiver(String sektor, String adresse, String bransje, int telfone, String epost, String ledigevikariater) {
        this.sektor = sektor;
        this.adresse = adresse;
        this.bransje = bransje;
        this.telfone = telfone;
        this.epost = epost;
        Ledigevikariater = ledigevikariater;
    }

    public String getSektor() {
        return sektor;
    }

    public void setSektor(String sektor) {
        this.sektor = sektor;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getBransje() {
        return bransje;
    }

    public void setBransje(String bransje) {
        this.bransje = bransje;
    }

    public int getTelfone() {
        return telfone;
    }

    public void setTelfone(int telfone) {
        this.telfone = telfone;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    public String getLedigevikariater() {
        return Ledigevikariater;
    }

    public void setLedigevikariater(String ledigevikariater) {
        Ledigevikariater = ledigevikariater;
    }

    @Override
    public String toString() {
        return "Arbeidsgiver{" +
                "sektor='" + sektor + '\'' +
                ", adresse='" + adresse + '\'' +
                ", bransje='" + bransje + '\'' +
                ", telfone=" + telfone +
                ", epost='" + epost + '\'' +
                ", Ledigevikariater='" + Ledigevikariater + '\'' +
                '}';
    }
}