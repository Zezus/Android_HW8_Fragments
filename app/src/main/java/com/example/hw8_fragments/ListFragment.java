package com.example.hw8_fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.UUID;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {

    private RecyclerView itemRecyclerView;
    private ArrayList<Item> items;
    private  RecyclerView relativeLayout;

    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        View view2 = inflater.inflate(R.layout.item, container, false);
        itemRecyclerView = view.findViewById(R.id.fl_items_rv);
        itemRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        init();

        itemRecyclerView.setAdapter(new ItemAdapter(getContext(), items, (MainActivity) getActivity()));


        /*relativeLayout = view.findViewById(R.id.fl_items_rv);

        relativeLayout.setOnClickListener(view1 -> {
            ((Callback) getActivity()).changeFragmentClicked(null);
        });*/
        return view;

    }

    private void init() {
        Item item1 = new Item();
        item1.setId(UUID.randomUUID());
        item1.setName("Meizu m3 Note");
        item1.setTitle("16 gb  ");
        item1.setCoast(100);

        Item item2 = new Item();
        item2.setId(UUID.randomUUID());
        item2.setName("iPhone X");
        item2.setTitle("256 gb  ");
        item2.setCoast(1000);

        items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
    }


    public interface Callback {
        void changeFragmentClicked(View view);
    }



}
