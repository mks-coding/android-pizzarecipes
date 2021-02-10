package com.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<PizzaRecipeItem> pizzaRecipeItems = new ArrayList<>();
        pizzaRecipeItems.add(new PizzaRecipeItem(
                R.drawable.pizza_1,
                Utils.PIZZA1_TITLE,
                Utils.PIZZA1_DESCRIPTION,
                Utils.PIZZA1_RECIPE)
        );
        pizzaRecipeItems.add(new PizzaRecipeItem(
                R.drawable.pizza_2,
                Utils.PIZZA2_TITLE,
                Utils.PIZZA2_DESCRIPTION,
                Utils.PIZZA2_RECIPE)
        );
        pizzaRecipeItems.add(new PizzaRecipeItem(
                R.drawable.pizza_3,
                Utils.PIZZA3_TITLE,
                Utils.PIZZA3_DESCRIPTION,
                Utils.PIZZA3_RECIPE)
        );
        pizzaRecipeItems.add(new PizzaRecipeItem(
                R.drawable.pizza_4,
                Utils.PIZZA4_TITLE,
                Utils.PIZZA4_DESCRIPTION,
                Utils.PIZZA4_RECIPE)
        );
        pizzaRecipeItems.add(new PizzaRecipeItem(
                R.drawable.pizza_5,
                Utils.PIZZA5_TITLE,
                Utils.PIZZA5_DESCRIPTION,
                Utils.PIZZA5_RECIPE)
        );

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new PizzaRecipeAdapter(pizzaRecipeItems, this);
        manager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);
    }
}