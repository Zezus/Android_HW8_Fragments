package com.example.hw8_fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ItemFragment extends Fragment {

    private Button button_back;

    public ItemFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item, container, false);


        button_back = view.findViewById(R.id.fi_back_btn);

        button_back.setOnClickListener(view1 -> {
            Toast.makeText(getContext().getApplicationContext(), "asdasd", Toast.LENGTH_LONG).show();
            getFragmentManager().popBackStack();
        });

        Item item = getArguments().getParcelable("item");
        button_back.setText(item.getName());





        return view;
    }

}
