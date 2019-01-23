import java.lang.reflect.*;

public class Factory{

    public Vehicule createVehicule(TypeVehicule type){
        try{
            //on crée à partir de l'énum le nom de la classe désirée
            // à partir de VOITURE, on veut obtenir VoitureFactory dans notre cas
            String className = type.toString().toLowerCase();
            className = className.substring(0, 1).toUpperCase() + className.substring(1)+"Factory";
            
            Class<?> factoryClass = Class.forName(className);
            Factory factory = (Factory)factoryClass.newInstance();
            return factory.getVehicule();
        
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Le type demandé en argument n'a pas de Factory associée, elle n'a pas été trouvée, on retourne un objet null !!");
            return null;
        }

    }
    //methode à override par chaque factory pour instancier correctement leur objet respectif
    public Vehicule getVehicule(){
        return null;
    }
}