package com.example.myfoodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myfoodapp.Adapters.RecipeAdapter;
import com.example.myfoodapp.Classes.RecyclerItemClickListener;
import com.example.myfoodapp.Models.RecipeModel;

import java.util.ArrayList;

public class FoodApp extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_app);

        recyclerView=findViewById(R.id.recycleView);

        ArrayList<RecipeModel> list=new ArrayList<>();
        list.add(new RecipeModel(R.drawable.food1,"Jeera Rice"));
        list.add(new RecipeModel(R.drawable.food2,"Paneer with Rice"));
        list.add(new RecipeModel(R.drawable.food3,"Chapati with curry"));
        list.add(new RecipeModel(R.drawable.food4,"Chhole Paneer"));
        list.add(new RecipeModel(R.drawable.food5,"Paratha with pakoda"));
        list.add(new RecipeModel(R.drawable.food6,"Desi Pakhala"));
        list.add(new RecipeModel(R.drawable.food7,"Dahi bada"));
        list.add(new RecipeModel(R.drawable.food8,"Doas & bada"));
        list.add(new RecipeModel(R.drawable.food9,"Samosa wht Green Chatni"));
        list.add(new RecipeModel(R.drawable.food10,"Chingudi curry"));
        list.add(new RecipeModel(R.drawable.food11,"Chicken curry"));
        list.add(new RecipeModel(R.drawable.food12,"Egg curry"));

        RecipeAdapter adapter=new RecipeAdapter(list,this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

//        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(
//                this/*for fragment use get context*/, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
//            @Override
//            public void onItemClick(View view, int position) {
//                switch (position){
//                    case 0:
//                        Intent intent=new Intent(FoodApp.this,SignInActivity.class);
//                        startActivity(intent);
//                        break;
//                    case 1:
//                        Intent intent1=new Intent(FoodApp.this,SignupActivity.class);
//                        intent1.putExtra("type",1);
//                        startActivity(intent1);
//                    default:
//                }
//            }
//
//            @Override
//            public void onLongItemClick(View view, int position) {
//                switch (position){
//                    case 0:
//                        Toast.makeText(FoodApp.this, "Long press done", Toast.LENGTH_SHORT).show();
//                        break;
//                    case 1:
//                        Toast.makeText(FoodApp.this, "LOgn press done", Toast.LENGTH_SHORT).show();
//                    default:
//                }
//            }
//        }
//        ));

//        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true);
//        recyclerView.setLayoutManager(layoutManager);

//        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
//        recyclerView.setLayoutManager(gridLayoutManager);

//        StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL);
//        recyclerView.setLayoutManager(staggeredGridLayoutManager);




    }
}