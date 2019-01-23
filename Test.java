public class Test{
    public static void main(String[] args) {
        //on crée la Factory
        Factory factory = new Factory();

        //On génère différents objets qui héritent de véhicule
        Vehicule vehicule1 = factory.createVehicule(TypeVehicule.VOITURE);
        vehicule1.avancer();

        Vehicule vehicule2  = factory.createVehicule(TypeVehicule.MOTO);
        vehicule2.avancer();

        Vehicule vehicule3  = factory.createVehicule(TypeVehicule.CAMION);
        vehicule3.avancer();
    }
}