package io.abhinavlabs.ahp_algorithm;

import android.app.Application;

import io.abhinavlabs.ahp_algorithm.Model.Utils.FontsOverride;


public class AppController extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FontsOverride.setDefaultFont(this, "MONOSPACE", "fonts/FuturaMedium.ttf");
    }
}
