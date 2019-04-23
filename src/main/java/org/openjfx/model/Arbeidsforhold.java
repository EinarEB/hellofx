package org.openjfx.model;

import org.openjfx.model.vo.Vikaren;
import org.openjfx.model.vo.Vikariat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Arbeidsforhold implements Serializable {


    private String vikaren;
    private String vikariat;
    private String opplevelse;

    public Arbeidsforhold(String vikaren, String vikariat, String opplevelse) {
        this.vikaren = vikaren;
        this.vikariat = vikariat;
        this.opplevelse = opplevelse;
    }

    public String getVikaren() {
        return vikaren;
    }

    public void setVikaren(String vikaren) {
        this.vikaren = vikaren;
    }

    public String getVikariat() {
        return vikariat;
    }

    public void setVikariat(String vikariat) {
        this.vikariat = vikariat;
    }

    public String getOpplevelse() {
        return opplevelse;
    }

    public void setOpplevelse(String opplevelse) {
        this.opplevelse = opplevelse;
    }





    @Override
    public String toString() {
        return "Arbeidsforhold{" +
                "vikaren='" + vikaren + '\'' +
                ", vikariat='" + vikariat + '\'' +
                ", opplevelse='" + opplevelse + '\'' +

                '}';
    }
}