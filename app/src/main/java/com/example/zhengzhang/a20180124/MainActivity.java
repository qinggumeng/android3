package com.example.zhengzhang.a20180124;


import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager vp;

    public void gotoF(View v){
        if(v.getId()==R.id.t1){
            vp.setCurrentItem(0);
        }else if(v.getId()==R.id.t2){
            vp.setCurrentItem(1);
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = this.findViewById(R.id.vp1);

        List<Fragment> flist = new ArrayList<Fragment>();
        flist.add(new Fragment1());
        flist.add(new Fragment2());


        vp.setAdapter(new MyPageAdapter(getSupportFragmentManager(),flist));
        vp.setOffscreenPageLimit(2);
    }
}
