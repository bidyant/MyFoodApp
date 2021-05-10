package com.example.myfoodapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.Models.RecipeModel;
import com.example.myfoodapp.R;
import com.example.myfoodapp.SignInActivity;

import java.util.ArrayList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.viewHolder> {
    ArrayList<RecipeModel> list;
    Context context;

    public RecipeAdapter(ArrayList<RecipeModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.sample_recycle_view,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        RecipeModel model=list.get(position);
        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.getText());

//        Here is the code for simple on click listener without position
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Item clicked",Toast.LENGTH_LONG).show();
            }
        });
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Text clicked",Toast.LENGTH_LONG).show();
//                Intent intent=new Intent(context, SignInActivity.class);
//                startActivity(intent);
            }
        });

//        implement on click listener suing swithc case for several elemets or static app
//        switch (position){
//            case 0:
//                holder.imageView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Toast.makeText(context, "image 1 is clicked", Toast.LENGTH_SHORT).show();
//                    }
//                });
//                holder.textView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Toast.makeText(context, "text 1 is clicked", Toast.LENGTH_SHORT).show();
//                    }
//                });
//                break;
//            default:
//        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public  class  viewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.sample_image);
            textView=itemView.findViewById(R.id.sample_text);
        }
    }
}
