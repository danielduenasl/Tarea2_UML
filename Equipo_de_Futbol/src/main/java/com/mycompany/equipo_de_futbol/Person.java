/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.equipo_de_futbol;

/**
 *
 * @author PC
 */
public class Person {
    
    private String name;
    private String lastname;
    private int age;
    private int size;
    private String country;

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public int getSize() {
        return size;
    }

    public String getCountry() {
        return country;
    }

    public Person(String name, String lastname, int age, int size, String country) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.size = size;
        this.country = country;
    }
    
}
