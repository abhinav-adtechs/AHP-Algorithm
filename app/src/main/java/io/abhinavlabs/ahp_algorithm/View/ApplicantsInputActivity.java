package io.abhinavlabs.ahp_algorithm.View;


import android.os.Bundle;
import android.support.annotation.Nullable;

import butterknife.ButterKnife;
import io.abhinavlabs.ahp_algorithm.R;

public class ApplicantsInputActivity extends BaseActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_applications_input);

        ButterKnife.bind(this) ;
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
