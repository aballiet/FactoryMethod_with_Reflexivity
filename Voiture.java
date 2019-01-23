public class Voiture extends Vehicule{
    public Voiture(){
        this.nbRoue = 4;
        this.poids = 1000;
    }
    public void avancer(){
        System.out.println("La voiture roule !");
    }
}