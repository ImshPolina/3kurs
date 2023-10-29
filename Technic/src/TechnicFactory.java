public interface TechnicFactory {
    public static Technic createTechnic(String type) {
        switch (type) {
            case "Fridge":
                return new Fridge();
            case "Washer":
                return new Washer();
            case "Nuke":
                return new Nuke();
            default:
                return null;
        }
    }
}
