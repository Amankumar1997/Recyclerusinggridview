package com.example.recyclerviewusinggidview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.Myholder>{



    int []arr;

    public RecyclerviewAdapter(int[] arr) {
        this.arr = arr;
    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        Myholder myholder=new Myholder(view);
        return myholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int position) {
holder.img.setImageResource(arr[position]);
holder.textview.setText("image no"+position);
    }

    @Override
    public int getItemCount() {
        return arr.length;
    }


    class Myholder extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView textview;
        public Myholder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img);
            textview=itemView.findViewById(R.id.textview);
        }
    }
}
