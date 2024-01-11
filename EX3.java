package TD2;


import TD2.livre;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Batta
 */
public class EX3 {public static void main(String[] args) {
       livre l = new  livre("Cours Java POO","Mehdi",0.0f,2022);
        System.out.println(l.toString());
        livre l2 = new  livre(l);
        System.out.println(l2.toString());}
    
}
