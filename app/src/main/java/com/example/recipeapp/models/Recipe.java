package com.example.recipeapp.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Arrays;

public class Recipe implements Parcelable {
    private String label;
    private String foodId;
    private String image;
    private String[] ingredients;



public Recipe(String label,String foodId,String image,String[] ingredients){
    this.label=label;
    this.foodId=foodId;
    this.image=image;
    this.ingredients=ingredients;

}

public Recipe(){

}
    protected Recipe(Parcel in) {
        label = in.readString();
        foodId = in.readString();
        image = in.readString();
        ingredients = in.createStringArray();



    }
    public static final Creator<Recipe> CREATOR = new Creator<Recipe>() {
        @Override
        public Recipe createFromParcel(Parcel in) {
            return new Recipe(in);
        }

        @Override
        public Recipe[] newArray(int size) {
            return new Recipe[size];
        }
    };
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }
    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "label='" + label + '\'' +
                ", foodId='" + foodId + '\'' +
                ", image='" + image + '\'' +
                ", ingredients=" + Arrays.toString(ingredients) +

                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(label);
        dest.writeString(foodId);
        dest.writeString(image);
        dest.writeStringArray(ingredients);


    }
}
