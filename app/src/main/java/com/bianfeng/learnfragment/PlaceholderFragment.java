package com.bianfeng.learnfragment;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PlaceholderFragment extends Fragment {
    public PlaceholderFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        System.out.println("P onCreate");
        super.onCreate(savedInstanceState);
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

        rootView.findViewById(R.id.btnStartSliderActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),SliderActivity.class));
            }
        });
        rootView.findViewById(R.id.btnStartTabs).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Tabs.class));
            }
        });
        return rootView ;
    }

    @Override
    public void onDestroy() {
        //始终不执行
        System.out.println("P onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        //当第二个fragment覆盖此fragment时，会执行此方法
        System.out.println("P onDestroyView");
        super.onDestroyView();
    }
}
