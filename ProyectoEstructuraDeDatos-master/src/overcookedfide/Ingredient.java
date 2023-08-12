/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overcookedfide;

import java.util.Random;

/**
 *
 * @author admin
 */
public class Ingredient {

    private String ingredients;
    private int id;

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ingredient(String ingredients, int id) {
        this.ingredients = ingredients;
        this.id = id;
    }

}
