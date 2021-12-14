package com.example.a11st_application;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    ArrayList<Movie> items = new ArrayList<Movie>();
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType){
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.movie_item, viewGroup, false);
        return new ViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position)
    {
        Movie item = items.get(position);
        viewHolder.setItem(item);
    }
    @Override
    public int getItemCount()
    {
        return items.size();
    }
    public void addItem(Movie item)
    {
        items.add(item);
    }
    public void setItems(ArrayList<Movie> items)
    {
        this.items = items;
    }
    public Movie getItem(int position)
    {
        return items.get(position);
    }
    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;

        public ViewHolder(View itemView){
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView2);
            textView3 = itemView.findViewById(R.id.textView3);
            textView4 = itemView.findViewById(R.id.textView4);
            textView5 = itemView.findViewById(R.id.textView5);
            textView6 = itemView.findViewById(R.id.textView6);
        }
        public void setItem(Movie item){
            textView.setText(item.movieNm);
            textView2.setText("관객수 : " + item.audiCnt + "명");
            textView4.setText("누적관객수 : " + item.audiAcc + "명");
            textView5.setText("매출비율 : " + item.salesShare + "%");
            textView3.setText(item.rank + " 위");
            textView6.setText("개봉일 : " + item.openDt);

        }

    }
}
