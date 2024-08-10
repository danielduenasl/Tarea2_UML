/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.equipo_de_futbol;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Equipo_de_Futbol {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Welcome...");

        Forward forward = new Forward(75, 10, 2, 25, "Lionel", "Messi", 36, 170, "Argentina");
        Midfielder midfielder = new Midfielder(0, 8, 3, 90, "Andres", "Iniesta", 39, 171, "Spain");
        Defense defense = new Defense(3, 5, 4, 80, "Gerard", "Pique", 37, 194, "Spain");
        Goalkeeper goalkeeper = new Goalkeeper(0, 1, 1, 15, "Victor", "Valdes", 42, 183, "Spain");

        FootballTeam footballTeam = new FootballTeam("FC Barcelona", "Barcelona - Spain", "1st division");

        goalkeeper.showPlayerInfo();
        footballTeam.AddPlayer(forward);
        defense.showPlayerInfo();
        footballTeam.AddPlayer(forward);
        midfielder.showPlayerInfo();
        footballTeam.AddPlayer(forward);
        forward.showPlayerInfo();
        footballTeam.AddPlayer(forward);       

        System.out.println("Team information:");
        footballTeam.showTeamInfo();

    }
}
