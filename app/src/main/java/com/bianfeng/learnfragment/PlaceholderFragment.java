package com.bianfeng.learnfragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PlaceholderFragment extends Fragment {
    public PlaceholderFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.fragment_main,container,false);
        rootView.findViewById(R.id.btnShowAnotherFragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*加载FragmentManager
                * 1.获取一个getFragmentManager
                * 2.开始变化
                * 3.通过替换添加另一个Fragment
                * 支持后退可以添加到后退栈中addToBackStack
                * */
                getFragmentManager()
                        .beginTransaction()
                        .addToBackStack(null)
                        .replace(R.id.container,new AnotherFragment()).commit();
            }
        });
        return rootView ;
    }
}