package com.example.hw8_fragments;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by СадвакасовР on 04.04.2018.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private final Context context;
    private final List<Item> itemList;
    private MainActivity mainActivity;
    private Dialog dialog;


    public ItemAdapter(Context context, List<Item> itemList, MainActivity mainActivity) {
        this.context = context;
        this.itemList = itemList;
        this.mainActivity = mainActivity;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.item, null);

        ViewHolder viewHolder = new ViewHolder(view);

        dialog = new Dialog(context);
        dialog.setContentView(R.layout.fragment_item);
        TextView item_name = dialog.findViewById(R.id.fi_name_tv);
        TextView item_title = dialog.findViewById(R.id.fi_title_tv);
        TextView item_coast = dialog.findViewById(R.id.fi_coast_tv);

        item_name.setText(itemList.get(viewHolder.getAdapterPosition()).getName());
        item_title.setText(itemList.get(viewHolder.getAdapterPosition()).getTitle());
        item_coast.setText(String.valueOf(itemList.get(viewHolder.getAdapterPosition()).getCoast()));

        viewHolder.relativeLayout.setOnClickListener(view1 -> {
            mainActivity.changeFragmentClicked(null);
        });


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
        RelativeLayout relativeLayout;

        public ViewHolder(View itemView) {
            super(itemView);

            nameTV = itemView.findViewById(R.id.i_name_tv);
            titleTV = itemView.findViewById(R.id.i_title_tv);
            coastTV = itemView.findViewById(R.id.i_coast_tv);
            relativeLayout = itemView.findViewById(R.id.i_item_all_rl);

        }

    }
}

