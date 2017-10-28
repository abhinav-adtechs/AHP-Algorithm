package io.abhinavlabs.ahp_algorithm.View;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.abhinavlabs.ahp_algorithm.R;

public class ApplicantsCountActivity extends BaseActivity{

    @BindView(R.id.activity_main_btn_next)
    Button btnNext ;

    ApplicantsCountActivity applicantsCountActivity ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_applicants_count);

        ButterKnife.bind(this) ;

        applicantsCountActivity = this ;

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(applicantsCountActivity, ApplicantsInputActivity.class) ;
                startActivity(intent);
            }
        });

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
