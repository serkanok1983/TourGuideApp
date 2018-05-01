package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by serka on 31.03.2018.
 */

public class ItemAdapter extends ArrayAdapter<Item> {

    private int toastMessageId;

    public ItemAdapter(Context context, ArrayList<Item> items) {

        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View itemView = convertView;

        if (itemView == null) {
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }

        Item currentItem = getItem(position);

        ImageView itemImage = (ImageView) itemView.findViewById(R.id.item_image);
        itemImage.setImageResource(currentItem.getImageResourceId());

        toastMessageId = currentItem.getToastMessageId();

        return itemView;
    }
}
