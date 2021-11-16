package dtos;

import entities.CatFact;

public class CatFactDTO {

    private String[] data;
    private String catFact;


    public CatFactDTO(CatFact catFact) {
        this.catFact = catFact.getFact();


    }

    public CatFactDTO(CatFactDTO catFactDTO) {
        this.catFact = catFactDTO.getData()[0];
    }

    public String getFact() {
        return catFact;
    }

    public void setFact(String fact) {
        this.catFact = fact;
    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }
}
