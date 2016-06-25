package com.example.dellpc.jokes.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dellpc.jokes.R;

import java.util.zip.Inflater;

/**
 * A placeholder fragment containing a simple view.
 */
public class Joke_One_Fragment extends Fragment {

    public Joke_One_Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_joke_one, container, false);

        return view;
    }
}
