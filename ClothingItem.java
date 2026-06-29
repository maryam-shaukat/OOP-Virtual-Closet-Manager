package smartcloset;

public abstract class ClothingItem {
    private int id;
    private String name;
    private String color;
    private String season;
    private String brand;  
    public ClothingItem(int id, String name, String color, String season, String brand){
        this.id=id;
        this.name=name;
        this.color=color;
        this.season=season;
        this.brand=brand;
        }
    public int getId(){
        return id;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public String getSeason() {
        return season;
    }
    public String getBrand() {
        return brand;
    }
    public abstract String display();
}
