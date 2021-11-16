package dtos;

import entities.CatFact;

public class CatFactDTO {

    private String[] data;
    private String fact;

    public CatFactDTO(String[] fact) {
        this.fact = fact[0];
    }

    public CatFactDTO(CatFact catFact) {
        this.fact = catFact.getFact();


    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }
}
