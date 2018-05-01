package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EatsFragment extends Fragment {


    public EatsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(R.drawable.eat_1_acuka, R.string.eats_1_toast_message));
        items.add(new Item(R.drawable.eat_2_haluj, R.string.eats_2_toast_message));
        items.add(new Item(R.drawable.eat_3_cheese, R.string.eats_3_toast_message));
        items.add(new Item(R.drawable.eat_4_mancar, R.string.eats_4_toast_message));
        items.add(new Item(R.drawable.eat_5_melenguccegi, R.string.eats_5_toast_message));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Item item = items.get(position);
                int toastMessageId = item.getToastMessageId();
                Toast.makeText(getContext(), getString(toastMessageId), Toast.LENGTH_LONG).show();
            }
        });

        return rootView;
    }

}
