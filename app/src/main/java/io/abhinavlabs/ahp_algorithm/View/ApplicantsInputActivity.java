package io.abhinavlabs.ahp_algorithm.View;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.abhinavlabs.ahp_algorithm.Model.Pojos.ApplicantAttributes;
import io.abhinavlabs.ahp_algorithm.R;
import io.abhinavlabs.ahp_algorithm.View.CustomView.CenterZoomLayoutManager;

public class ApplicantsInputActivity extends BaseActivity {


    @BindView(R.id.activity_applications_input_rv)
    RecyclerView rvApplicants ;

    @BindView(R.id.activity_application_input_toolbar)
    Toolbar toolbar ;

    ApplicantsAdapter applicantsAdapter ;
    List<ApplicantAttributes> applicantAttributesList ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_applications_input);

        ButterKnife.bind(this) ;

        setSupportActionBar(toolbar);
        getSupportActionBar().setElevation(0);
        getSupportActionBar().setTitle("Evaluation Sheet");


        setRv() ;
    }

    private void setRv() {

        applicantAttributesList = new ArrayList<>() ;
        applicantsAdapter = new ApplicantsAdapter(applicantAttributesList, this) ;

        RecyclerView.LayoutManager layoutManager = new CenterZoomLayoutManager(this.getApplicationContext(),
                LinearLayoutManager.VERTICAL, false) ;
        rvApplicants.setLayoutManager(layoutManager);
        rvApplicants.setAdapter(applicantsAdapter);

        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(rvApplicants);

        rvApplicants.smoothScrollToPosition(0);

        addToList() ;
    }

    private void addToList() {
        applicantAttributesList.add(new ApplicantAttributes(1, "Abhinav Das")) ;
        applicantAttributesList.add(new ApplicantAttributes(2, "Abhinav Das")) ;
        applicantAttributesList.add(new ApplicantAttributes(3, "Abhinav Das")) ;
        applicantAttributesList.add(new ApplicantAttributes(4, "Abhinav Das")) ;
        applicantAttributesList.add(new ApplicantAttributes(5, "Abhinav Das")) ;

        applicantsAdapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.navigation_input, menu);
        return true ;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int i = item.getItemId() ;
        Intent intent = new Intent(this, ResultsActivity.class) ;
        startActivity(intent);

        return super.onOptionsItemSelected(item);
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
