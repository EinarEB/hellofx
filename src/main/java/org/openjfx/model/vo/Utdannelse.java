package org.openjfx.model.vo;

import java.io.Serializable;
import java.time.LocalDate;

public class Utdannelse implements Serializable {

    private String skole;
    private String studietittel;
    private String grad;
    private LocalDate fra;
    private LocalDate til;
    private String beskrivelse;

    public Utdannelse(String skole, String studietittel, String grad, LocalDate fra, LocalDate til, String beskrivelse) {
        this.skole = skole;
        this.studietittel = studietittel;
        this.grad = grad;
        this.fra = fra;
        this.til = til;
        this.beskrivelse = beskrivelse;
    }

    public String getSkole() {
        return skole;
    }

    public String getStudietittel() {
        return studietittel;
    }

    public String getGrad() {
        return grad;
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
        return "Utdannelse{" +
                "skole='" + skole + '\'' +
                ", studietittel='" + studietittel + '\'' +
                ", grad='" + grad + '\'' +
                ", fra=" + fra +
                ", til=" + til +
                ", beskrivelse='" + beskrivelse + '\'' +
                '}';
    }
}
