package com.bianfeng.learnfragment;

import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sf on 2016/9/21 0021.
 */

public class AnotherFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        System.out.println("onCreate");

        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        System.out.println("onCreateView");

        View root=inflater.inflate(R.layout.fragment_another,container,false);
        root.findViewById(R.id.btnBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //添加回退操作
                getFragmentManager().popBackStack();
            }
        });
        return root;
    }

    @Override
    public void onPause() {
        System.out.println("onPause");
        super.onPause();
    }
}
