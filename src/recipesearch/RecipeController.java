package recipesearch;

import java.util.List;
import se.chalmers.ait.dat215.lab2.*;

public class RecipeController {
    RecipeDatabase db = RecipeDatabase.getSharedInstance();
    List<Recipe> recipes;

    RecipeSearchView rsv;
    
    public RecipeController(){
               //db.search(new SearchFilter("Lätt", 0, "Sverige", 0, null, "gg"));
    }
    
    public void doSearch(String diff, int maxPrice, String kitchen, int maxTime, String ingredient){
        this.recipes = db.search(new SearchFilter(diff, maxPrice, kitchen, maxTime, ingredient));
    }
}
