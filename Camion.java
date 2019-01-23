public class Camion extends Vehicule{
    public Camion(){
        this.nbRoue = 6;
        this.poids = 4500;
    }
    public void avancer(){
        System.out.println("Le camion roule !");
    }
}
