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
public class HistoryFragment extends Fragment {


    public HistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(R.drawable.history_1_late_ottoman, R.string.history_1_toast_message));
        items.add(new Item(R.drawable.history_2_rome, R.string.history_2_toast_message));
        items.add(new Item(R.drawable.history_3_byzantium, R.string.history_3_toast_message));
        items.add(new Item(R.drawable.history_4_early_ottoman, R.string.history_4_toast_message));

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
