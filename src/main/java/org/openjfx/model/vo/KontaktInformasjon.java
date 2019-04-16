package org.openjfx.model.vo;

public class KontaktInformasjon {

    private String epost;
    private String telefonNr;

    public KontaktInformasjon(String epost, String telefonNr) {
        this.epost = epost;
        this.telefonNr = telefonNr;
    }

    public String getEpost() {
        return epost;
    }

    public String getTelefonNr() {
        return telefonNr;
    }

    @Override
    public String toString() {
        return "KontaktInformasjon{" +
                "epost='" + epost + '\'' +
                ", telefonNr='" + telefonNr + '\'' +
                '}';
    }
}
