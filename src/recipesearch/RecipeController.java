package recipesearch;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import se.chalmers.ait.dat215.lab2.*;

public class RecipeController{
    RecipeDatabase db = RecipeDatabase.getSharedInstance();
    List<Recipe> recipes;
    
    public void doSearch(String diff, int maxPrice, String kitchen, int maxTime, String ingredient){
        this.recipes = db.search(new SearchFilter(diff, maxPrice, kitchen, maxTime, ingredient));
    }
}
