/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.equipo_de_futbol;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class FootballTeam implements TeamInterface {
    
    private String teamName;
    private String city;
    private String division;

    public String getTeamName() {
        return teamName;
    }

    public String getDivision() {
        return division;
    }

    public String getCity() {
        return city;
    }

    public FootballTeam(String teamName, String city, String division) {
        this.teamName = teamName;
        this.city = city;
        this.division = division;
    }
    

    @Override
    public void AddPlayer(Player player) {
        System.out.println("The player has been added");
    }

    @Override
    public void RemovePlayer() {
        System.out.println("The player has been removed");
    }
    
    public void showTeamInfo() {
        System.out.println("Team Name: " + teamName);
        System.out.println("City: " + city);
        System.out.println("Division: " + division);

    }
    
}
