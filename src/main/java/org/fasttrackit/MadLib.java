package org.fasttrackit;

public class MadLib {
    private String noun;
    private String verb;
    private String adjective;
    private String adverb;


    public void story (){
        System.out.println("Do you "+getVerb()+" your " + getAdjective() +" "+getNoun()+" "+getAdverb()+
                "? That's hilarious!");
    }

    public MadLib(String noun, String verb, String adjective, String adverb) {
        this.noun = noun;
        this.verb = verb;
        this.adjective = adjective;
        this.adverb = adverb;
    }

    public String getNoun() {
        return noun;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public String getAdverb() {
        return adverb;
    }

    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }
}
