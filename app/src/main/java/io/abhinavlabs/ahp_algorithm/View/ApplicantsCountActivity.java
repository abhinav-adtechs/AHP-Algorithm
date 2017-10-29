package io.abhinavlabs.ahp_algorithm.View;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.abhinavlabs.ahp_algorithm.R;

public class ApplicantsCountActivity extends BaseActivity{

    @BindView(R.id.activity_applicants_count_next)
    Button btnNext ;

    @BindView(R.id.activity_applicants_count_et)
    EditText etCount ;

    ApplicantsCountActivity applicantsCountActivity ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_applicants_count);

        ButterKnife.bind(this) ;

        applicantsCountActivity = this ;

        etCount = (EditText)findViewById(R.id.activity_applicants_count_et) ;

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etCount.getText().toString().length() != 0 ){
                    if(Integer.parseInt(etCount.getText().toString()) > 0 && Integer.parseInt(etCount.getText().toString()) < 10){
                        Intent intent = new Intent(applicantsCountActivity, ApplicantsInputActivity.class) ;
                        intent.putExtra("count", Integer.parseInt(etCount.getText().toString())) ;
                        startActivity(intent);
                    }else {
                        Toast.makeText(applicantsCountActivity, "Please enter a value between 0 to 10", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(applicantsCountActivity, "Please enter a value between 0 to 10", Toast.LENGTH_SHORT).show();
                }



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
