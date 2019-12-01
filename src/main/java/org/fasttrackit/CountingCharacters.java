package org.fasttrackit;

public class CountingCharacters {
    private String name;

    public void length(){

        System.out.println("The string "+getName()+" have " + getName().length() + " characters length");
    }

    public CountingCharacters(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
