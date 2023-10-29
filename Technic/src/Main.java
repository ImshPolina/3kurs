
public class Main {
    public static void main(String[] args) {

       Technic fridge = TechnicFactory.createTechnic("Fridge");
       Technic washer = TechnicFactory.createTechnic("Washer");
       Technic nuke = TechnicFactory.createTechnic("Nuke");
        fridge.name();
        fridge.firm();
        fridge.power();
        fridge.appointment();
        fridge.guarantee();
        washer.name();
        washer.firm();
        washer.power();
        washer.appointment();
        washer.guarantee();
        nuke.name();
        nuke.firm();
        nuke.power();
        nuke.appointment();
        nuke.guarantee();
    }
}
