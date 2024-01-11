/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TD3;

/**
 *
 * @author Batta
 */
public class Point2 {
    private int x, y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void affCoord() {
        System.out.println("Coordonnees : " + x + " , " + y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class Centre extends Point2 {
    String Nom ;
    public Centre(int x, int y , String Nom) {

        super(x, y);
        this.Nom=Nom;
    }

    public String getNom() {
        return Nom;
    }

    public void affNom(){
        System.out.println(" Nom : "+this.getNom());
    }

    public void affiche() {
        System.out.println("Centre{" +
                "Nom='" + Nom + '\'' +
                " X = " +this.getX()+
                " y = " +this.getY()+'}');
    }
}
class Cercle extends Centre {
    int Rayon;
    public Cercle(int x , int y , String Nom , int Rayon ){
        super (x , y , Nom);
        this.Rayon=Rayon;
    }
    public void perimetre(int Rayon){
        System.out.println("le perimetre");
    }
}






