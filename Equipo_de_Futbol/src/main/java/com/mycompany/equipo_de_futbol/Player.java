/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.equipo_de_futbol;

/**
 *
 * @author PC
 */
public class Player extends Person implements PlayerInterface {
    
    private int number;
    private int faults;
    private int touches;

    public Player(int number, int faults, int touches, String name, String lastname, int age, int size, String country) {
        super(name, lastname, age, size, country);
        this.number = number;
        this.faults = faults;
        this.touches = touches;
    }

    public int getFaults() {
        return faults;
    }

    public int getTouches() {
        return touches;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public void Training() {
        System.out.println("The player is training");
    }

    @Override
    public void PlayGame() {
        System.out.println("The player is playing a game");
    }
    
    public void showPlayerInfo() {
        System.out.println("Name: " + super.getName() + " " + super.getLastname());
        System.out.println("Number: " + number);
        System.out.println("Country: " + super.getCountry());
        System.out.println("Age: " + super.getAge());
        System.out.println("Size: " + super.getSize() + " cm");
    }
    
}
