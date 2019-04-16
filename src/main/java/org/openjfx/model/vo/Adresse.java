package org.openjfx.model.vo;

public class Adresse {

    private String gataNavn;
    private String gataNr;
    private String postNr;
    private String postSted;

    public Adresse(String gataNavn, String gataNr, String postNr, String postSted) {
        this.gataNavn = gataNavn;
        this.gataNr = gataNr;
        this.postNr = postNr;
        this.postSted = postSted;



    }

    public String getGataNavn() {
        return gataNavn;
    }

    public String getGataNr() {
        return gataNr;
    }

    public String getPostNr() {
        return postNr;
    }

    public String getPostSted() {
        return postSted;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "gataNavn='" + gataNavn + '\'' +
                ", gataNr='" + gataNr + '\'' +
                ", postNr='" + postNr + '\'' +
                ", postSted='" + postSted + '\'' +
                '}';
    }


}
