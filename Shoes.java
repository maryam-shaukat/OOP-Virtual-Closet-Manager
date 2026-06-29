package smartcloset;

public class Shoes extends ClothingItem {
    
    public Shoes(int id, String name, String color, String season, String brand){
        super(id,name,color,season,brand); 
    }
    @Override
    public String display() {
        return "Shoes : "+ getName() +", Shoes color: "+ getColor() + ", Season:"+ getSeason()+", Brand:"+ getBrand();
    }
    
}
