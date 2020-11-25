package com.example.recipeapp.requests;

import com.example.recipeapp.requests.responses.RecipeResponse;
import com.example.recipeapp.requests.responses.RecipeSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RecipeApi {
    @GET("api/search")
    Call<RecipeSearchResponse> searchRecipe(
            @Query("key") String key,
            @Query("q") String query,
            @Query("page") String page

    );

    // GET RECIPE REQUEST
    @GET("api/get")
    Call<RecipeResponse> getRecipe(
            @Query("key") String key,
            @Query("foodId") String   foodId
    );
}