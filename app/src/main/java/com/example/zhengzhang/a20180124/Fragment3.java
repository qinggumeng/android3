package com.example.zhengzhang.a20180124;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.JsonElement;

import net.callumtaylor.asynchttp.AsyncHttpClient;
import net.callumtaylor.asynchttp.obj.NameValuePair;
import net.callumtaylor.asynchttp.response.JsonResponseHandler;
import net.callumtaylor.asynchttp.response.ResponseHandler;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Headers;

/**
 * Created by zhengzhang on 2018/1/24.
 */

public class Fragment3 extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.f3,null);

        AsyncHttpClient client = new AsyncHttpClient("http://l.hfbdqn.cn/api/v3/");

        List<NameValuePair> params = new ArrayList<>();
        params.add(new NameValuePair("name", "value"));
        params.add(new NameValuePair("password", "value111111"));
        params.add(new NameValuePair("username", "value"));
        params.add(new NameValuePair("email", "value@qq.com"));
        params.add(new NameValuePair("private_token", "baif-VJ87yHWP1xk88qo"));

        Headers headers = Headers.of("Header", "value");

        client.post("users", params, headers,new JsonResponseHandler()
        {
            @Override public void onSuccess()
            {
                JsonElement result = getContent();
                System.out.println(result.toString());
            }
        });

        return v;
    }
}
