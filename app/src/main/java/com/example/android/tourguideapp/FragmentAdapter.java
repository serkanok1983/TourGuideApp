package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by serka on 31.03.2018.
 */

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public FragmentAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ViewsFragment();
        } else if (position == 1) {
            return new EatsFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new HistoryFragment();
        }

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.fragment_views);
        } else if (position == 1) {
            return mContext.getString(R.string.fragment_eats);
        } else if (position == 2) {
            return mContext.getString(R.string.fragment_restaurants);
        } else {
            return mContext.getString(R.string.fragment_history);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
