package com.example.zhengzhang.a20180124;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengzhang on 2018/1/24.
 */

public class Fragment1 extends Fragment implements View.OnClickListener {

    ViewPager vp;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.f1,null);

        vp = v.findViewById(R.id.vp2);

        LinearLayout l3 = v.findViewById(R.id.t3);
        LinearLayout l4 = v.findViewById(R.id.t4);
        l3.setOnClickListener(this);
        l4.setOnClickListener(this);

        List<Fragment> flist = new ArrayList<Fragment>();
        flist.add(new Fragment3());
        flist.add(new Fragment4());


        vp.setAdapter(new MyPageAdapter(getFragmentManager(),flist));
        vp.setOffscreenPageLimit(2);

        return v;
    }

    @Override
    public void onClick(View v) {

            Log.d("ddddd",v.getId()+"");
            if(v.getId()==R.id.t3){
                vp.setCurrentItem(0);
            }else if(v.getId()==R.id.t4){
                vp.setCurrentItem(1);
            }

    }
}
