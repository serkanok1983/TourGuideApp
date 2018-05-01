package com.example.android.tourguideapp;

/**
 * Created by serka on 31.03.2018.
 */

public class Item {

    private int mImageResourceId;
    private int mToastMessageId;

    //Object constructor
    public Item(int imageResourceId, int toastMessageId) {
        mImageResourceId = imageResourceId;
        mToastMessageId = toastMessageId;
    }

    //Getter methods
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getToastMessageId() {
        return mToastMessageId;
    }

}
