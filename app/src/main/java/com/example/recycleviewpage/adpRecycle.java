package com.example.recycleviewpage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class adpRecycle extends RecyclerView.Adapter<adpRecycle.MyViewHolder> {

    Context context;
    String[] aname;
    String[] bname;
    int[] imagea;
    int[] imageb;
    RatingBar ratingBar1;

    public adpRecycle(MainActivity mainActivity, String[] name1, String[] name2, int[] image1, int[] image2) {

        context = mainActivity;
        aname = name1;
        bname = name2;
        imagea = image1;
        imageb = image2;

    }

    @NonNull
    @Override
    public adpRecycle.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.coustam,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adpRecycle.MyViewHolder holder, int position) {

        holder.textView1.setText(aname[position]);
        holder.textView2.setText(bname[position]);
        holder.imageView1.setImageResource(imagea[position]);
        holder.imageView2.setImageResource(imageb[position]);

    }

    @Override
    public int getItemCount() {
        return aname.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView1,textView2;
        ImageView imageView1,imageView2;
        RatingBar ratingBar;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textView1 = itemView.findViewById(R.id.text1);
            textView2 = itemView.findViewById(R.id.text2);
            imageView1 = itemView.findViewById(R.id.image1);
            imageView2 = itemView.findViewById(R.id.image2);
            ratingBar = itemView.findViewById(R.id.ratingBar);


        }

    }
}
