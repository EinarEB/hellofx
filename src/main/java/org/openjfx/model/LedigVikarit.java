package org.openjfx.model;

import org.openjfx.model.vo.Adresse;
import org.openjfx.model.vo.JobbKategori;
import org.openjfx.model.vo.KontaktInformasjon;
import org.openjfx.model.vo.Sektor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LedigVikarit {

     private Sektor sektor;
     private Adresse arbeidSted;
     private Arbeidsgiver arbeidsgiver;
     private JobbKategori jobbKatagori;
     private String engasjementetsVarighet;
     private LocalDate arbeidStid;
     private String stillingsType;
     private List<String> kravTilKvalifikasjioner = new ArrayList<>();
     private String lønnsBetingelser;
     private String arbeidsvilkår;
     private KontaktInformasjon kontaktInformasjon;
     private String stillingBeskrivelse;
     private List<JobbSøker> søkere = new ArrayList<>();


    public LedigVikarit(Sektor sektor, Adresse arbeidSted, Arbeidsgiver arbeidsgiver,
                        JobbKategori jobbKatagori, String engasjementetsVarighet, LocalDate arbeidStid, String stillingsType, String lønnsBetingelser,
                        KontaktInformasjon kontaktInformasjon, String stillingBeskrivelse) {
        this.sektor = sektor;
        this.arbeidSted = arbeidSted;
        this.arbeidsgiver = arbeidsgiver;
        this.jobbKatagori = jobbKatagori;
        this.engasjementetsVarighet = engasjementetsVarighet;
        this.arbeidStid = arbeidStid;
        this.stillingsType = stillingsType;
        this.lønnsBetingelser = lønnsBetingelser;
        this.kontaktInformasjon = kontaktInformasjon;
        this.stillingBeskrivelse = stillingBeskrivelse;
    }

    public void addKravTilKvalifikasjioner(String nykravTilKvalifikasjion){

        kravTilKvalifikasjioner.add(nykravTilKvalifikasjion);
    }

    public void slettKravTilKvalifikasjioner(String kravTilKvalifikasjion){

        kravTilKvalifikasjioner.remove(kravTilKvalifikasjion);
    }

    public void addJobbSøkere(JobbSøker nyJobbSøker){

        søkere.add(nyJobbSøker);
    }

    public Sektor getSektor() {
        return sektor;
    }

    public void setSektor(Sektor sektor) {
        this.sektor = sektor;
    }

    public Adresse getArbeidSted() {
        return arbeidSted;
    }

    public void setArbeidSted(Adresse arbeidSted) {
        this.arbeidSted = arbeidSted;
    }

    public Arbeidsgiver getArbeidsgiver() {
        return arbeidsgiver;
    }

    public void setArbeidsgiver(Arbeidsgiver arbeidsgiver) {
        this.arbeidsgiver = arbeidsgiver;
    }

    public JobbKategori getJobbKatagori() {
        return jobbKatagori;
    }

    public void setJobbKatagori(JobbKategori jobbKatagori) {
        this.jobbKatagori = jobbKatagori;
    }

    public String getEngasjementetsVarighet() {
        return engasjementetsVarighet;
    }

    public void setEngasjementetsVarighet(String engasjementetsVarighet) {
        this.engasjementetsVarighet = engasjementetsVarighet;
    }

    public LocalDate getArbeidStid() {
        return arbeidStid;
    }

    public void setArbeidStid(LocalDate arbeidStid) {
        this.arbeidStid = arbeidStid;
    }

    public String getStillingsType() {
        return stillingsType;
    }

    public void setStillingsType(String stillingsType) {
        this.stillingsType = stillingsType;
    }

    public String getLønnsBetingelser() {
        return lønnsBetingelser;
    }

    public void setLønnsBetingelser(String lønnsBetingelser) {
        this.lønnsBetingelser = lønnsBetingelser;
    }

    public String getArbeidsvilkår() {
        return arbeidsvilkår;
    }

    public void setArbeidsvilkår(String arbeidsvilkår) {
        this.arbeidsvilkår = arbeidsvilkår;
    }

    public KontaktInformasjon getKontaktInformasjon() {
        return kontaktInformasjon;
    }

    public void setKontaktInformasjon(KontaktInformasjon kontaktInformasjon) {
        this.kontaktInformasjon = kontaktInformasjon;
    }

    public String getStillingBeskrivelse() {
        return stillingBeskrivelse;
    }

    public void setStillingBeskrivelse(String stillingBeskrivelse) {
        this.stillingBeskrivelse = stillingBeskrivelse;
    }

    @Override
    public String toString() {
        return "LedigVikarit{" +
                "sektor=" + sektor +
                ", arbeidSted=" + arbeidSted +
                ", arbeidsgiver=" + arbeidsgiver +
                ", jobbKatagori=" + jobbKatagori +
                ", engasjementetsVarighet='" + engasjementetsVarighet + '\'' +
                ", arbeidStid=" + arbeidStid +
                ", stillingsType='" + stillingsType + '\'' +
                ", kravTilKvalifikasjioner=" + kravTilKvalifikasjioner +
                ", lønnsBetingelser='" + lønnsBetingelser + '\'' +
                ", arbeidsvilkår='" + arbeidsvilkår + '\'' +
                ", kontaktInformasjon=" + kontaktInformasjon +
                ", stillingBeskrivelse='" + stillingBeskrivelse + '\'' +
                ", søkere=" + søkere +
                '}';
    }
}

