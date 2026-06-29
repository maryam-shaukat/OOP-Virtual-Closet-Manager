package smartcloset;

public class RecommendationSystem {
    
    public String recommend(String season) {

        if(season.equals("Summer")) {

            return "Summer so wear: T-Shirt + Baggy jeans + FlipFlops";
        }

        else if(season.equals("Winter")) {

            return "Winter so wear: Jacket + Jeans + Boots";
        }

        else if(season.equals("Spring")) {

            return "Spring so wear: Floral Shirt + Jeans + Casual sandals";
        }

        else {

            return "Casual Outfit";
        }
    }
    
}
