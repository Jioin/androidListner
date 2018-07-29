package com.example.daisy.javaobserve;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleFragment extends Fragment implements MainActivityListener{


    public SimpleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_simple, container, false);
        ((MainActivity)getActivity()).changeMode();

        ((MainActivity)getActivity()).setMainActivityListener(this);
        return inflate;
    }


    @Override
    public void protect() {
        System.out.println("进入保护模式");
    }
}
