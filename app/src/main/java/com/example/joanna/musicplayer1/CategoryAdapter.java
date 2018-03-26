package com.example.joanna.musicplayer1;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Joanna on 20.03.2018.
 */


public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    public CategoryAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PopMusic();
        } else if (position == 1) {
            return new RockMusic();
        } else
            return new DanceMusic();

    }


    @Override
    public int getCount() {
        return 3;
    }

        @Override
        public CharSequence getPageTitle(int position) {
            if (position == 0) {
                return mContext.getString(R.string.pop_music);
            } else if (position == 1) {
                return mContext.getString(R.string.rock_music);
            }
            else
                 return mContext.getString(R.string.dance_music);
            }

        }

