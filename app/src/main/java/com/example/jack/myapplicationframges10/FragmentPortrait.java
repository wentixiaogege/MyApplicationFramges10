package com.example.jack.myapplicationframges10;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jack on 5/19/15.
 */
public class FragmentPortrait extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        return  inflater.inflate(R.layout.protrait_fragment,container,false);
    }
}
