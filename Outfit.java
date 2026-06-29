package smartcloset;

public class Outfit {
    
    private String shirt;
    private String pant;
    private String shoes;

    public Outfit(String shirt,String pant,String shoes) {

        this.shirt = shirt;
        this.pant = pant;
        this.shoes = shoes;
    }

    public String showOutfit() {
        return shirt+ " + "+ pant+ " + "+ shoes;
    }
}
