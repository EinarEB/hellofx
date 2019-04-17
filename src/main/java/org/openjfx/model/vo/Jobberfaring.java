package org.openjfx.model.vo;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.io.Serializable;
import java.time.LocalDate;

public class Jobberfaring implements Serializable {

    private StringProperty jobbtittel;
    private StringProperty selskap;
    private StringProperty sted;
    private ObjectProperty<LocalDate> fra;
    private ObjectProperty<LocalDate> til;
    private StringProperty beskrivelse;

public Jobberfaring(String jobbtittel, String selskap, String sted, LocalDate fra, LocalDate til, String beskrivelse) {
        this.jobbtittel = new SimpleStringProperty(jobbtittel);
        this.selskap = new SimpleStringProperty(selskap);
        this.sted = new SimpleStringProperty(sted);
        this.fra = new SimpleObjectProperty<>(fra);
        this.til = new SimpleObjectProperty<>(til);
        this.beskrivelse = new SimpleStringProperty(beskrivelse);
    }

    public StringProperty getJobbtittel() {
        return jobbtittel;
    }

    public StringProperty getSelskap() {
        return selskap;
    }

    public StringProperty getSted() {
        return sted;
    }

    public ObjectProperty<LocalDate> getFra() {
        return fra;
    }

    public ObjectProperty<LocalDate> getTil() {
        return til;
    }

    public StringProperty getBeskrivelse() {
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
