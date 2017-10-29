package io.abhinavlabs.ahp_algorithm;

import android.app.Application;

import io.abhinavlabs.ahp_algorithm.Model.Utils.FontsOverride;
import io.realm.Realm;
import io.realm.RealmConfiguration;


public class AppController extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        RealmConfiguration realmConfiguration = new RealmConfiguration
                .Builder(this)
                .deleteRealmIfMigrationNeeded()
                /*TODO: NEED TO SET UP MIGRATION CODE before prod*/
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);

        FontsOverride.setDefaultFont(this, "MONOSPACE", "fonts/futuramediumbt.ttf");
    }
}
