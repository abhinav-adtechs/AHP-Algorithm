package io.abhinavlabs.ahp_algorithm.View;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import io.abhinavlabs.ahp_algorithm.Model.Pojos.ApplicantAttributes;
import io.abhinavlabs.ahp_algorithm.R;


public class ApplicantsAdapter extends RecyclerView.Adapter<ApplicantsAdapter.ApplicantViewHolder> {

    private List<ApplicantAttributes> applicantAttributesList ;
    private Context context ;

    public ApplicantsAdapter(List<ApplicantAttributes> applicantAttributesList, Context context) {
        this.applicantAttributesList = applicantAttributesList;
        this.context = context;
    }

    @Override
    public ApplicantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_rv_applicants, parent, false) ;
        return new ApplicantViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ApplicantViewHolder holder, int position) {
        holder.tvApplicantNummber.setText("Applicant " + (position+1) );
    }

    @Override
    public int getItemCount() {
        return applicantAttributesList.size();
    }

    class ApplicantViewHolder extends RecyclerView.ViewHolder{

        private TextView tvApplicantNummber ;

        public ApplicantViewHolder(View itemView) {
            super(itemView);

            tvApplicantNummber = (TextView) itemView.findViewById(R.id.item_rv_applicants_tv_applicant_number) ;
        }
    }
}
