package com.example.recipeapp.adapters;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipeapp.R;

public class RecipeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView label, foodId;
    AppCompatImageView image;
    OnRecipeListener onRecipeListener;

    public RecipeViewHolder(@NonNull View itemView, OnRecipeListener onRecipeListener) {
        super(itemView);

        this.onRecipeListener = onRecipeListener;

        label = itemView.findViewById(R.id.recipe_title);
        foodId = itemView.findViewById(R.id.recipe_publisher);
        image = itemView.findViewById(R.id.recipe_image);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        onRecipeListener.onRecipeClick(getAdapterPosition());
    }
}
