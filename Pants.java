package smartcloset;

public class Pants extends ClothingItem{
   
    public Pants(int id,String name,String color,String season, String brand) {
        super(id,name,color,season,brand);
    }
    @Override
    public String display() {
        return "Pants : "+ getName() +", Pants color: "+ getColor() + ", Season:"+ getSeason()+", Brand:"+ getBrand();
    } 
}
