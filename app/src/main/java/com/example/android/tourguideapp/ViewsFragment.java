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
public class ViewsFragment extends Fragment {


    public ViewsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(R.drawable.view_1, R.string.view_1_toast_message));
        items.add(new Item(R.drawable.view_2, R.string.view_2_toast_message));
        items.add(new Item(R.drawable.view_3, R.string.view_3_toast_message));
        items.add(new Item(R.drawable.view_4, R.string.view_4_toast_message));
        items.add(new Item(R.drawable.view_5, R.string.view_5_toast_message));
        items.add(new Item(R.drawable.view_6, R.string.view_6_toast_message));
        items.add(new Item(R.drawable.view_7, R.string.view_7_toast_message));
        items.add(new Item(R.drawable.view_8, R.string.view_8_toast_message));
        items.add(new Item(R.drawable.view_9, R.string.view_9_toast_message));
        items.add(new Item(R.drawable.view_10, R.string.view_10_toast_message));
        items.add(new Item(R.drawable.view_11, R.string.view_11_toast_message));

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
