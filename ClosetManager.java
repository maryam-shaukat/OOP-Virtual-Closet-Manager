package smartcloset;

public class ClosetManager {
    private ClothingItem[] clothes;
    int count;
    
    public ClosetManager(){
        clothes= new ClothingItem[100];
        count=0;
    }
    public void add(ClothingItem item){
        if(count< clothes.length){
            
            clothes[count]=item;
            count++;
        }
    }
    
    public ClothingItem[] getItems(){
        return clothes;
    }
    public int noofItems() {

        return count;
    }


}
