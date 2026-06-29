package smartcloset;

public class Shirts extends ClothingItem {
    
    public Shirts(int id, String name, String color, String season, String brand){
        super(id,name,color,season,brand);
    }
    @Override
    public String display(){
        return "Shirt:"+ getName() +", Shirts color: "+ getColor() + ", Season:"+ getSeason()+", Brand:"+ getBrand();
    }
}
