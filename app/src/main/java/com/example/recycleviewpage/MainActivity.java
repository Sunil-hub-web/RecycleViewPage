package com.example.recycleviewpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String name1[] = {"sunil kumar","sunil kumar","sunil kumar"};
    String name2[] = {"Sunil kumar dash","Sunil Kumar Dash","Sunil Kumar Dash"};
    int image1[] = {R.drawable.animationa,R.drawable.animation,R.drawable.computer_animation};
    int image2[] = {R.drawable.ic_favorite,R.drawable.ic_favorite,R.drawable.ic_favorite};

    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycle);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this,
                              LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new adpRecycle(MainActivity.this,name1,name2,image1,image2));
    }
}
