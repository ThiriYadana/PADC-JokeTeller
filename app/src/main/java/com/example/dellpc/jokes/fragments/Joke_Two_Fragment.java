package com.example.dellpc.jokes.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dellpc.jokes.R;

/**
 * Created by dellpc on 23-Jun-16.
 */
public class Joke_Two_Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_joke_two, container, false);

        return view;
    }
}
