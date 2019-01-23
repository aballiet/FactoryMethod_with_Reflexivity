public class CamionFactory extends Factory{
    public Vehicule getVehicule(){
        return new Camion();
    }
}