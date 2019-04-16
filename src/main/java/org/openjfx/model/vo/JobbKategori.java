package org.openjfx.model.vo;

import java.io.Serializable;

public class JobbKategori implements Serializable {

    private String navn;

    public JobbKategori(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    @Override
    public String toString() {
        return "JobbKategori{" +
                "navn='" + navn + '\'' +
                '}';
    }
}
