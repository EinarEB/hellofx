package org.openjfx.model;

import org.openjfx.model.vo.Adresse;
import org.openjfx.model.vo.JobbKategori;
import org.openjfx.model.vo.KontaktInformasjon;
import org.openjfx.model.vo.Sektor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LedigVikarit implements Serializable {

    private String sektor;
    private String arbeidSted;
    private String arbeidsgiver;
    private String jobbKatagori;
    private String engasjementetsVarighet;
    private Date date;
    private String stillingsType;
    private String kravTilKvalifikasjioner;
    private String lønnsBetingelser;
    private String arbeidsvilkår;
    private String stillingBeskrivelse;
    private List<JobbSøker> søkere = new ArrayList<>();


    public LedigVikarit(String sektor, String arbeidSted, String arbeidsgiver, String jobbKatagori,
                        String engasjementetsVarighet, Date date, String stillingsType, String kravTilKvalifikasjioner, String lønnsBetingelser,
                        String arbeidsvilkår, String stillingBeskrivelse, List<JobbSøker> søkere) {
        this.sektor = sektor;
        this.arbeidSted = arbeidSted;
        this.arbeidsgiver = arbeidsgiver;
        this.jobbKatagori = jobbKatagori;
        this.engasjementetsVarighet = engasjementetsVarighet;
        this.date = date;
        this.stillingsType = stillingsType;
        this.kravTilKvalifikasjioner = kravTilKvalifikasjioner;
        this.lønnsBetingelser = lønnsBetingelser;
        this.arbeidsvilkår = arbeidsvilkår;
        this.stillingBeskrivelse = stillingBeskrivelse;
        this.søkere = søkere;
    }

    public String getSektor() {
        return sektor;
    }

    public void setSektor(String sektor) {
        this.sektor = sektor;
    }

    public String getArbeidSted() {
        return arbeidSted;
    }

    public void setArbeidSted(String arbeidSted) {
        this.arbeidSted = arbeidSted;
    }

    public String getArbeidsgiver() {
        return arbeidsgiver;
    }

    public void setArbeidsgiver(String arbeidsgiver) {
        this.arbeidsgiver = arbeidsgiver;
    }

    public String getJobbKatagori() {
        return jobbKatagori;
    }

    public void setJobbKatagori(String jobbKatagori) {
        this.jobbKatagori = jobbKatagori;
    }

    public String getEngasjementetsVarighet() {
        return engasjementetsVarighet;
    }

    public void setEngasjementetsVarighet(String engasjementetsVarighet) {
        this.engasjementetsVarighet = engasjementetsVarighet;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStillingsType() {
        return stillingsType;
    }

    public void setStillingsType(String stillingsType) {
        this.stillingsType = stillingsType;
    }

    public String getKravTilKvalifikasjioner() {
        return kravTilKvalifikasjioner;
    }

    public void setKravTilKvalifikasjioner(String kravTilKvalifikasjioner) {
        this.kravTilKvalifikasjioner = kravTilKvalifikasjioner;
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

    public String getStillingBeskrivelse() {
        return stillingBeskrivelse;
    }

    public void setStillingBeskrivelse(String stillingBeskrivelse) {
        this.stillingBeskrivelse = stillingBeskrivelse;
    }

    public List<JobbSøker> getSøkere() {
        return søkere;
    }

    public void setSøkere(List<JobbSøker> søkere) {
        this.søkere = søkere;
    }

    @Override
    public String toString() {
        return "LedigVikarit{" +
                "sektor='" + sektor + '\'' +
                ", arbeidSted='" + arbeidSted + '\'' +
                ", arbeidsgiver='" + arbeidsgiver + '\'' +
                ", jobbKatagori='" + jobbKatagori + '\'' +
                ", engasjementetsVarighet='" + engasjementetsVarighet + '\'' +
                ", date=" + date +
                ", stillingsType='" + stillingsType + '\'' +
                ", kravTilKvalifikasjioner='" + kravTilKvalifikasjioner + '\'' +
                ", lønnsBetingelser='" + lønnsBetingelser + '\'' +
                ", arbeidsvilkår='" + arbeidsvilkår + '\'' +
                ", stillingBeskrivelse='" + stillingBeskrivelse + '\'' +
                ", søkere=" + søkere +
                '}';
    }
}