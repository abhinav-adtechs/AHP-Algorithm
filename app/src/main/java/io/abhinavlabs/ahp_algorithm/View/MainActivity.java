package io.abhinavlabs.ahp_algorithm.View;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.abhinavlabs.ahp_algorithm.R;

public class MainActivity extends BaseActivity{


    @BindView(R.id.activity_main_toolbar)
    Toolbar toolbarMain ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ButterKnife.bind(this) ;

        setSupportActionBar(toolbarMain);
    }
}
