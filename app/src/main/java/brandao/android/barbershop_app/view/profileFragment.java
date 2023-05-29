package brandao.android.barbershop_app.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import brandao.android.barbershop_app.R;
import brandao.android.barbershop_app.service.model.SchedulingModel;
import brandao.android.barbershop_app.service.model.ServiceModel;
import brandao.android.barbershop_app.view.adapter.ScheduleAdapter;
public class profileFragment extends Fragment {


    private List<SchedulingModel> list = new ArrayList<SchedulingModel>();
    private ScheduleAdapter adapter = new ScheduleAdapter();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle b) {

        View binding = inflater.inflate(R.layout.fragment_profile, container, false);

        RecyclerView recyclerView = binding.findViewById(R.id.recycler_scheduler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        List<ServiceModel> serviceList = new ArrayList<>();

        serviceList.add(new ServiceModel(1, "Cabelo", 30.00f, false));
        serviceList.add(new ServiceModel(2,"Barba", 25.00f, false));

        list.add(new SchedulingModel(
                "José",
                serviceList,
                "20/10/2023",
                55.00f,
                "13:00",
                "Renato"));


        list.add(new SchedulingModel(
                "Matheus",
                serviceList,
                "20/10/2013",
                105.00f,
                "14:00",
                "Danilo"));
        list.add(new SchedulingModel(
                "Matheus",
                serviceList,
                "20/10/2013",
                105.00f,
                "09:00",
                "Danilo"));


        list.add(new SchedulingModel(
                "Eduardo",
                serviceList,
                "20/10/2023",
                80.00f,
                "18:30",
                "Gabriel"));

        adapter.upDateList(list);



        return binding;
    }
}