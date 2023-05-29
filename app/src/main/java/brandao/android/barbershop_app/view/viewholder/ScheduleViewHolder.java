package brandao.android.barbershop_app.view.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import brandao.android.barbershop_app.R;
import brandao.android.barbershop_app.service.model.SchedulingModel;

public class ScheduleViewHolder extends RecyclerView.ViewHolder {

     private TextView textDate = itemView.findViewById(R.id.text_date);
     private TextView textService = itemView.findViewById(R.id.text_service);
     private TextView textEmployeeName = itemView.findViewById(R.id.text_employee_name);
     private TextView textTime = itemView.findViewById(R.id.text_time);
     private TextView textPrice = itemView.findViewById(R.id.text_price);

    public ScheduleViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void BindData(SchedulingModel schedulingModel) {

        this.textDate.setText(schedulingModel.getDate());
        this.textService.setText(schedulingModel.getServiceList().get(0).getName());
        this.textEmployeeName.setText(schedulingModel.getEmployeeName());
        this.textTime.setText(schedulingModel.getTime());
        this.textPrice.setText(schedulingModel.getFinalPrice().toString());

    }
}
