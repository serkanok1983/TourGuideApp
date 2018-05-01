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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(R.drawable.rest_3_iskele_restaurant, R.string.rest_3_toast_message));
        items.add(new Item(R.drawable.rest_4_mustafanin_yeri_balikevi, R.string.rest_4_toast_message));
        items.add(new Item(R.drawable.rest_5_bulentin_yeri, R.string.rest_5_toast_message));

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
