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

    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        itemRecyclerView = view.findViewById(R.id.fl_items_rv);
        itemRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        init();

        itemRecyclerView.setAdapter(new ItemAdapter(getContext(), items, (MainActivity) getActivity()));

        return view;

    }

    private void init() {
        Item item1 = new Item();
        item1.setId(UUID.randomUUID());
        item1.setName("Meizu m3 Note");
        item1.setTitle("Экран 5.5\" (1920x1080), сенсорный | Восьмиядерный процессор | Оперативная память 3 ГБ | Встроенная память 32 ГБ + microSD до 256 ГБ | Камера 13 Мп + фронтальная 5 Мп | Батарея 4100 мАч | Android 5.1 | Bluetooth 4.2 | Wi-Fi 802.11 b/g/n/ac | 153,6 x 75,5 x 8,2 мм, 163 г | Серый  ");
        item1.setCoast("100 $");
        item1.setPhoto(R.drawable.meizu);

        Item item2 = new Item();
        item2.setId(UUID.randomUUID());
        item2.setName("iPhone X");
        item2.setTitle("Экран 5.8\" Super Retina HD (1125x2436), сенсорный | Стандарт защиты: IP67 | Оперативная память 3 ГБ | Встроенная память 64 ГБ | Камера 12+12 Мп + фронтальная 7 Мп | Батарея 2716 мАч | iOS 11 | Bluetooth | Wi-Fi | NFC | Поддержка 4G | 143.6 x 70.9 x 7.7 мм, 174 гр | Серебристый  ");
        item2.setCoast("1000 $");
        item2.setPhoto(R.drawable.iphone);


        items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
    }


    public interface Callback {
        void changeFragmentClicked(View view, Item item);
    }



}
