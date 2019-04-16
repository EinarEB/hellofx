package org.openjfx.model;

import org.openjfx.model.vo.*;

import java.util.ArrayList;
import java.util.List;

public class JobbSøker {

    private String id;
    private KontaktInformasjon kontaktInformasjon;
    private PersonligInformasjon personligInformasjon;
    private List<JobbKategori> ønsketKategori = new ArrayList<>();
    private List<Utdannelse> utdannelse;
    private List<Jobberfaring> jobberfaring;
    private Lønnskrav lønnskrav;
    private List<Referanse> referanser = new ArrayList<>();
    private static long JOBB_SØKER_NR = 1000;


    public JobbSøker(KontaktInformasjon kontaktInformasjon, PersonligInformasjon personligInformasjon) {
        this.kontaktInformasjon = kontaktInformasjon;
        this.personligInformasjon = personligInformasjon;
        id = JOBB_SØKER_NR++ + "JS";


    }

    public String getId() {
        return id;
    }

    public void addØnsketKategori(JobbKategori nyJobbKategori) {

        ønsketKategori.add(nyJobbKategori);

    }
    public void addReferanse(Referanse nyReferanse){

        referanser.add(nyReferanse);
    }

    public void setKontaktInformasjon(KontaktInformasjon kontaktInformasjon) {
        this.kontaktInformasjon = kontaktInformasjon;
    }

    public void setPersonligInformasjon(PersonligInformasjon personligInformasjon) {
        this.personligInformasjon = personligInformasjon;
    }

    public void addUtdannelse(Utdannelse nyUtdannelse){

        utdannelse.add(nyUtdannelse);
    }
    public void addJobbErfaring(Jobberfaring nyJobbErfaring){

        jobberfaring.add(nyJobbErfaring);
    }

    public void setLønnskrav(Lønnskrav lønnskrav) {
        this.lønnskrav = lønnskrav;
    }

    @Override
    public String toString() {
        return "JobbSøker{" +
                "kontaktInformasjon=" + kontaktInformasjon +
                ", personligInformasjon=" + personligInformasjon +
                ", ønsketKategori=" + ønsketKategori +
                ", utdannelse=" + utdannelse +
                ", jobberfaring=" + jobberfaring +
                ", lønnskrav=" + lønnskrav +
                ", referanser=" + referanser +
                '}';
    }
}
