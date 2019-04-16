package org.openjfx.model.vo;

import java.io.Serializable;

public class Bransje implements Serializable {

    private  String bransjeNavn;

    public Bransje(String bransjeNavn) {
        this.bransjeNavn = bransjeNavn;
    }

    public String getBransjeNavn() {
        return bransjeNavn;
    }

    @Override
    public String toString() {
        return "Bransje{" +
                "bransjeNavn='" + bransjeNavn + '\'' +
                '}';
    }
}
