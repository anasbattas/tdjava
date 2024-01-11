/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TD3;

/**
 *
 * @author Batta
 */
public class main2 {
    public static void main(String[] args) {
        Batiment b = new Batiment();
        Maison m = new Maison("SETTAT ",2);
        Immeuble i = new Immeuble("EL-JADIDA" , 24);
        System.out.println(b.toString());
        System.out.println(m.toString());
        System.out.println(i.toString());
        b.setAdresse("Casa");
        System.out.println(b.toString());
        m.setAdresse("Agadir");
        System.out.println(m.toString());
        i.setAdresse("Tanger");
        System.out.println(i.toString());
    }
}
