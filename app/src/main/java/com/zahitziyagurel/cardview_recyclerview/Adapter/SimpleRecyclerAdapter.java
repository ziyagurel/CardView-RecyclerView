package com.zahitziyagurel.cardview_recyclerview.Adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zahitziyagurel.cardview_recyclerview.R;
import com.zahitziyagurel.cardview_recyclerview.Value.person;

import java.util.List;

public class SimpleRecyclerAdapter extends RecyclerView.Adapter<SimpleRecyclerAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView person_name;
        public TextView person_age;
        public ImageView person_img;
        public CardView card_view;

        public ViewHolder(View view) {
            super(view);

            card_view = view.findViewById(R.id.card_view);
            person_name = view.findViewById(R.id.person_name);
            person_age = view.findViewById(R.id.person_age);
            person_img = view.findViewById(R.id.person_photo);
        }
    }
    List<person> personList;
    
    @Override
    public SimpleRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(SimpleRecyclerAdapter holder, int position) {

    }

    @Override
    public void onBindViewHolder(SimpleRecyclerAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
