package io.abhinavlabs.ahp_algorithm.View;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.abhinavlabs.ahp_algorithm.R;

public class MainActivity extends BaseActivity{


    @BindView(R.id.activity_main_toolbar)
    Toolbar toolbarMain ;

    @BindView(R.id.activity_main_btn_next)
    Button btnNext ;

    MainActivity mainActivity ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ButterKnife.bind(this) ;
        mainActivity = this ;

        setSupportActionBar(toolbarMain);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mainActivity, ApplicantsCountActivity.class) ;
                startActivity(intent);
            }
        });
    }
}
