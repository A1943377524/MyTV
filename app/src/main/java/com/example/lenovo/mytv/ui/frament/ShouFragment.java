package com.example.lenovo.mytv.ui.frament;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.mytv.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShouFragment extends Fragment {

    private RecyclerView itme3_recycler;

    public ShouFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_shou, container, false);
        initView(inflate);
        return inflate;
    }


    private void initView(View inflate) {
        itme3_recycler = (RecyclerView) inflate.findViewById(R.id.itme3_recycler);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity());
        itme3_recycler.setLayoutManager(linearLayoutManager);




    }

}
