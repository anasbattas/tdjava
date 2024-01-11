package TD2;


import TD2.Temps;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Batta
 */
public class EX4 { public static void main(String[] args) {
        Temps t = new Temps(3,10,10);
        System.out.println(t.toString());
        t.ajouterMinutes(180);
        System.out.println(t);
        t.ajouterSecondes(3660);
        System.out.println(t);}
    
}
