public class Washer implements Technic{
    public void name() {
        System.out.println("Name: Washer");
    }
    @Override
    public void firm(){
        System.out.println("LG");
    }
    @Override
    public void power(){
        System.out.println("Power: 1500");;
    }
    @Override
    public void appointment(){
        System.out.println("Appointment: cleaning things");;
    }
    @Override
    public void guarantee(){
        System.out.println("Guarantee: two year");
    }
}
