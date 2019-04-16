package org.openjfx.model.vo;

import java.io.Serializable;
import java.time.LocalDate;

public class Jobberfaring implements Serializable {

    private String jobbtittel;
    private String selskap;
    private String sted;
    private LocalDate fra;
    private LocalDate til;
    private  String beskrivelse;

    public Jobberfaring(String jobbtittel, String selskap, String sted, LocalDate fra, LocalDate til, String beskrivelse) {
        this.jobbtittel = jobbtittel;
        this.selskap = selskap;
        this.sted = sted;
        this.fra = fra;
        this.til = til;
        this.beskrivelse = beskrivelse;
    }

    public String getJobbtittel() {
        return jobbtittel;
    }

    public String getSelskap() {
        return selskap;
    }

    public String getSted() {
        return sted;
    }

    public LocalDate getFra() {
        return fra;
    }

    public LocalDate getTil() {
        return til;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    @Override
    public String toString() {
        return "Jobberfaring{" +
                "jobbtittel='" + jobbtittel + '\'' +
                ", selskap='" + selskap + '\'' +
                ", sted='" + sted + '\'' +
                ", fra=" + fra +
                ", til=" + til +
                ", beskrivelse='" + beskrivelse + '\'' +
                '}';
    }
}
