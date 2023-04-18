package com.example.apprecipie.data


import androidx.annotation.DrawableRes
import com.example.apprecipie.R

data class Recipe(
    var title: String,
    var category: String,
    var cookingTime: String,
    var energy: String,
    var rating: String,
    var description: String,
    var reviews: String,
    var ingredients: List<Ingredient>
    )
data class Ingredient(@DrawableRes val image: Int, val title: String, val subtitle: String)

val strawberryCake = Recipe(
    title = "Strawberry Cake",
    category = "Desserts",
    cookingTime = "50 min",
    energy = "620 kcal",
    rating = "4,9",
    description = "its too delicious",
    reviews = "84 photos     430 comments  ",
    ingredients = listOf(
        Ingredient(R.drawable.flour,"Flour","450 g"),
        Ingredient(R.drawable.egg,"Eggs", "4"),
        Ingredient(R.drawable.juice,"Orange juice", "150 g"),
        Ingredient(R.drawable.strawberry, "Strawberry","200 g"),
        Ingredient(R.drawable.sugar, "Sugar","1 cup"),
        Ingredient(R.drawable.mind, "Mind","20 g"),
        Ingredient(R.drawable.vanille," Vanille","1/2 teaspoon"),
 )
)
