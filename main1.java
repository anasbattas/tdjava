/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TD3;

/**
 *
 * @author Batta
 */
public class main1 {
    public static void main(String[] args) {
            Point point = new Point(1 , 2 );
            Centre centre = new Centre(2 , 3 , "o");
            Cercle cercle = new Cercle(2 , 3 , "c" , 3);
            point.affCoord();
            centre.affCoord();
            centre.affNom();
            cercle.affNom();
        }
}
