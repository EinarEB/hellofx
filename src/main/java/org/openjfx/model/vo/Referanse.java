package org.openjfx.model.vo;

public class Referanse {

    private String fornavn;
    private String etterNavn;
    private String telefon;
    private String beskrivelser;


    public Referanse(String fornavn, String etterNavn, String telefon, String beskrivelser) {
        this.fornavn = fornavn;
        this.etterNavn = etterNavn;
        this.telefon = telefon;
        this.beskrivelser = beskrivelser;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtterNavn() {
        return etterNavn;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getBeskrivelser() {
        return beskrivelser;
    }


    @Override
    public String toString() {
        return "Referanse{" +
                "fornavn='" + fornavn + '\'' +
                ", etterNavn='" + etterNavn + '\'' +
                ", telefon='" + telefon + '\'' +
                ", beskrivelser='" + beskrivelser + '\'' +
                '}';
    }
}
