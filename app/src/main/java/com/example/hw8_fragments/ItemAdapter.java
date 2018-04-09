package com.example.hw8_fragments;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by СадвакасовР on 04.04.2018.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private final Context context;
    private final List<Item> itemList;


    public ItemAdapter(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.item, null);


        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final Item item = itemList.get(position);
        holder.nameTV.setText(item.getName());
        holder.titleTV.setText(item.getTitle());
        holder.coastTV.setText(String.valueOf(item.getCoast()));


    }


    @Override
    public int getItemCount() {
        return itemList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView nameTV;
        TextView titleTV;
        TextView coastTV;

        public ViewHolder(View itemView) {
            super(itemView);

            nameTV = itemView.findViewById(R.id.i_name_tv);
            titleTV = itemView.findViewById(R.id.i_title_tv);
            coastTV = itemView.findViewById(R.id.i_coast_tv);

        }

    }
}

