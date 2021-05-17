package com.example.recyclerviewusinggidview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
RecyclerView.LayoutManager layoutManager;
RecyclerviewAdapter recyclerviewAdapter;
int arr[]={R.drawable.scapular,R.drawable.seatedcalfraise,R.drawable.singlearmcablerow,R.drawable.thirtydegreelatpuldown,R.drawable.trapbardeadlift,R.drawable.widegriplatpulldown,R.drawable.yo,R.drawable.youtube,R.drawable.scapular};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        layoutManager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerviewAdapter=new RecyclerviewAdapter(arr);
        recyclerView.setAdapter(recyclerviewAdapter);
        recyclerView.setHasFixedSize(true);


    }
}