package org.openjfx.model.vo;

import java.io.Serializable;
import java.time.LocalDate;

public class PersonligInformasjon implements Serializable {


    private String fornavn;
    private String etterNavn;
    private LocalDate fødselsdato;


    public PersonligInformasjon(String fornavn, String etterNavn, LocalDate fødselsdato) {
        this.fornavn = fornavn;
        this.etterNavn = etterNavn;
        this.fødselsdato = fødselsdato;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtterNavn() {
        return etterNavn;
    }

    public LocalDate getFødselsdato() {
        return fødselsdato;
    }

    @Override
    public String toString() {
        return "PersonligInformasjon{" +
                "fornavn='" + fornavn + '\'' +
                ", etterNavn='" + etterNavn + '\'' +
                ", fødselsdato=" + fødselsdato +
                '}';
    }
}
