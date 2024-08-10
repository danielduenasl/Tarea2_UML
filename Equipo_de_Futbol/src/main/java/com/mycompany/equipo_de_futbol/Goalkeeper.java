/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.equipo_de_futbol;

/**
 *
 * @author PC
 */
public class Goalkeeper extends Player {
    
    private int saves;

    public int getSaves() {
        return saves;
    }

    public Goalkeeper(int saves, int number, int faults, int touches, String name, String lastname, int age, int size, String country) {
        super(number, faults, touches, name, lastname, age, size, country);
        this.saves = saves;
    }
    
    
}
