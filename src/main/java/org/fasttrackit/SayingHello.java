package org.fasttrackit;

import java.util.Scanner;

public class SayingHello {
    private String name;

    public void hello(){
        System.out.println("Hello. What is your name?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome "+ scanner.nextLine());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
