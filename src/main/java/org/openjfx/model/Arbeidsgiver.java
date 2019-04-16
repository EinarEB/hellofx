package org.openjfx.model;

import org.openjfx.model.vo.Adresse;
import org.openjfx.model.vo.Bransje;
import org.openjfx.model.vo.KontaktInformasjon;
import org.openjfx.model.vo.Sektor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Arbeidsgiver implements Serializable {



    private Sektor sektor;

    private Adresse adresse;

    private Bransje bransje;

    private KontaktInformasjon kontaktInformasjon;

    private List<LedigVikarit> ledigVikarit = new ArrayList<>();

    public Arbeidsgiver(Sektor sektor, Adresse adresse, Bransje bransje, KontaktInformasjon kontaktInformasjon) {
        this.sektor = sektor;
        this.adresse = adresse;
        this.bransje = bransje;
        this.kontaktInformasjon = kontaktInformasjon;
    }

    public void addLedigeVikariter(LedigVikarit nyLedigVikarit){

        ledigVikarit.add(nyLedigVikarit);
    }

    public Sektor getSektor() {
        return sektor;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public Bransje getBransje() {
        return bransje;
    }

    public KontaktInformasjon getKontaktInformasjon() {
        return kontaktInformasjon;
    }

    @Override
    public String toString() {
        return "Arbeidsgiver{" +
                "sektor=" + sektor +
                ", adresse=" + adresse +
                ", bransje=" + bransje +
                ", kontaktInformasjon=" + kontaktInformasjon +
                ", ledigVikarit=" + ledigVikarit +
                '}';
    }
}
