package com.zahitziyagurel.cardview_recyclerview.Adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zahitziyagurel.cardview_recyclerview.Interface.ICustomItemClickListener;
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
    ICustomItemClickListener listener;
    public SimpleRecyclerAdapter(List<person> personList, ICustomItemClickListener listener){
        this.listener = listener;
        this.personList = personList;
    }
    @Override
    public SimpleRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_view_layout, parent, false);
        final ViewHolder viewHolder = new ViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(view, viewHolder.getPosition());
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(SimpleRecyclerAdapter.ViewHolder holder, int position) {
        holder.person_name.setText(personList.get(position).getName());
        holder.person_age.setText(personList.get(position).getAge());
        holder.person_img.setImageResource(personList.get(position).getPhoto_id());
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
