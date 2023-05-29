package brandao.android.barbershop_app.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import brandao.android.barbershop_app.R;
import brandao.android.barbershop_app.service.model.SchedulingModel;
import brandao.android.barbershop_app.view.viewholder.ScheduleViewHolder;

public class ScheduleAdapter extends RecyclerView.Adapter<ScheduleViewHolder> {

    private List<SchedulingModel> mlist = new ArrayList<>();

    public ScheduleAdapter() {

    }

    @NonNull
    @Override
    public ScheduleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemList = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.row_scheduler_list, parent, false);

        return new ScheduleViewHolder(itemList) ;
    }

    @Override
    public void onBindViewHolder(@NonNull ScheduleViewHolder holder, int position) {

        SchedulingModel schedulingModel = this.mlist.get(position);
        holder.BindData(schedulingModel);

    }

    @Override
    public int getItemCount() {
        return this.mlist.size();
    }

    public void upDateList(List<SchedulingModel> list){
        this.mlist = list;
         notifyDataSetChanged();
    }
}
