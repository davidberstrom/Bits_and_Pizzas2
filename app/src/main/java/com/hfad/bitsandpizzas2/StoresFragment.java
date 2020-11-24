package com.hfad.bitsandpizzas2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


public class StoresFragment extends ListFragment {
    public View onCreateView(LayoutInflater infalter,ViewGroup container,Bundle savedInstanceState){
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                infalter.getContext(),
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.stores)
        );
        setListAdapter(adapter);
        return super.onCreateView(infalter,container,savedInstanceState);
    }
}