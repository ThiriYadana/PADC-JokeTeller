package com.example.dellpc.jokes;

import android.app.Application;
import android.content.Context;

/**
 * Created by dellpc on 23-Jun-16.
 */
public class Jokes_App extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
