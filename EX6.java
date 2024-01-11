package TD2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Batta
 */
public class EX6 {
    public static void main(String[] args) {
        Banque compte = new Banque(1, 5000.75f, "AB1200");
        System.out.println(compte.avoirInf());
        System.out.println("Solde : " + compte.avoirSolde());
        compte.deposer(500);
        System.out.println(compte.avoirInf());
        System.out.println("Solde : " + compte.avoirSolde());
        compte.retirer(200);
        System.out.println(compte.avoirInf());
        System.out.println("Solde : " + compte.avoirSolde());
    }
}
