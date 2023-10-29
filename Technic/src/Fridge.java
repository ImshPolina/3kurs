public class Fridge implements Technic{
    public void name() {
        System.out.println("Name: Fridge");
    }
    @Override
    public void firm(){
        System.out.println("Samsung");
    }
    @Override
    public void power(){
        System.out.println("Power: 1800");;
    }
    @Override
    public void appointment(){
        System.out.println("Appointment: storage of products");;
    }
    @Override
    public void guarantee(){
        System.out.println("Guarantee: one year");
    }
}
