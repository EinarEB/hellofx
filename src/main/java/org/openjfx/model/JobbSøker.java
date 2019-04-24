package org.openjfx.model;

import org.openjfx.model.vo.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobbSøker {
    private String fornavn;
    private String Etternavn;
    private LocalDate  fødelsdato;
    private String epost;
    private String telefoneNr;
    private String Erfaring;
    private String utdannelse;
    private String Referanser;

    public JobbSøker(String fornavn, String etternavn,LocalDate fødelsdato,String epost,
                     String telefoneNr, String referanser, String erfaring, String utdannelse) {
        this.fornavn = fornavn;
        Etternavn = etternavn;
        this.epost = epost;
        this.fødelsdato = fødelsdato;
        this.telefoneNr = telefoneNr;
        Erfaring = erfaring;
        this.utdannelse = utdannelse;
        Referanser = referanser;


    }

    public JobbSøker(String fornavn, String etterNavn, LocalDate d, String epost, String erfaring, String utdannelse, String referanser) {

    }


    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return Etternavn;
    }

    public void setEtternavn(String etternavn) {
        Etternavn = etternavn;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    public LocalDate getFødelsdato() {
        return fødelsdato;
    }

    public void setFødelsdato(LocalDate fødelsdato) {
        this.fødelsdato = fødelsdato;
    }

    public String getTelefoneNr() {
        return telefoneNr;
    }

    public void setTelefoneNr(String telefoneNr) {
        this.telefoneNr = telefoneNr;
    }

    public String getReferanser() {
        return Referanser;
    }

    public void setReferanser(String referanser) {
        Referanser = referanser;
    }

    public String getErfaring() {
        return Erfaring;
    }

    public void setErfaring(String erfaring) {
        Erfaring = erfaring;
    }

    public String getUtdannelse() {
        return utdannelse;
    }

    public void setUtdannelse(String utdannelse) {
        this.utdannelse = utdannelse;
    }



    @Override
    public String toString() {
        return "JobbSøker{" +
                "fornavn='" + fornavn + '\'' +
                ", Etternavn='" + Etternavn + '\'' +
                ", epost='" + epost + '\'' +
                ", fødelsdato=" + fødelsdato +
                ", telefoneNr='" + telefoneNr + '\'' +
                ", Referanser='" + Referanser + '\'' +
                ", Erfaring='" + Erfaring + '\'' +
                ", utdannelse='" + utdannelse + '\'' +
                '}';
    }
}