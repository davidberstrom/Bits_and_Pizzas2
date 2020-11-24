package com.hfad.bitsandpizzas2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class TopFragment extends Fragment {

   public View onCreateView(LayoutInflater inflater,ViewGroup contanier, Bundle savedInstanceState){
       super.onCreateView(inflater,contanier,savedInstanceState);
       return inflater.inflate(R.layout.fragment_top,contanier,false);
   }

}