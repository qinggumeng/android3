package com.example.zhengzhang.a20180124;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import android.view.View;

import java.util.List;

/**
 * Created by zhengzhang on 2018/1/24.
 */

public class MyPageAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragment;


    public MyPageAdapter(FragmentManager fm, List<Fragment> mFragment) {
        super(fm);
        this.mFragment = mFragment;
    }

    public MyPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return (Fragment) mFragment.get(position);
    }

    @Override
    public int getCount() {
        return mFragment.size();
    }
}
