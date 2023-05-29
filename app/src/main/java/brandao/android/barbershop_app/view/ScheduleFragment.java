package brandao.android.barbershop_app.view;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;

import androidx.fragment.app.Fragment;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import brandao.android.barbershop_app.R;
import brandao.android.barbershop_app.databinding.FragmentScheduleBinding;
import brandao.android.barbershop_app.service.model.ServiceModel;


public class ScheduleFragment extends Fragment implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    private String item;
    private List<ServiceModel> list = new ArrayList<>();
    private FragmentScheduleBinding binding;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle b) {

        binding = FragmentScheduleBinding.inflate(getLayoutInflater());


        //Configurando spinner time
        ArrayAdapter<CharSequence> adapterTime = ArrayAdapter.createFromResource
                (getContext(),R.array.time, R.layout.my_selected_item);
        adapterTime.setDropDownViewResource(R.layout.my_dropdown_item);
        binding.SpinnerTime.setAdapter(adapterTime);


        //Configurando spinner time
        ArrayAdapter<CharSequence> adapterEmployee = ArrayAdapter.createFromResource
                (getContext(),R.array.name, R.layout.my_selected_item);
        adapterEmployee.setDropDownViewResource(R.layout.my_dropdown_item);
        binding.spinnerEmployee.setAdapter(adapterEmployee);


        binding.SpinnerTime.setOnItemSelectedListener(this);
        binding.spinnerEmployee.setOnItemSelectedListener(this);
        binding.imageViewCalendar.setOnClickListener(this);


        list.add(new ServiceModel(1, "Cabelo", 25.00f, false));
        list.add(new ServiceModel(2, "Barba", 20.00f, false));
        list.add(new ServiceModel(3, "Sobrancelha", 10.00f, false));
        list.add(new ServiceModel(4, "Platinado", 100.00f, false));


        binding.buttonContinue.setOnClickListener(this);




        return binding.getRoot();
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View v, int i, long l) {

        Spinner spinner = (Spinner) adapterView;

        if ( spinner.getId() == R.id.Spinner_time){
            binding.textSelectedTime.setText(adapterView.getItemAtPosition(i).toString());
        }else if (spinner.getId() == R.id.spinner_employee){
            binding.textSelectedEmployee.setText(adapterView.getItemAtPosition(i).toString());
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.imageView_calendar){
            handleDate();
        } else if (v.getId() == R.id.button_continue){

        }

    }

    private void handleDate() {
        Calendar calendar = Calendar.getInstance();
        Integer year = calendar.get(Calendar.YEAR);
        Integer month = calendar.get(Calendar.MONTH);
        Integer day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dialog = new DatePickerDialog(getContext(), R.style.MyTimePickerDialogTheme,
                new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {

                Calendar calendar = Calendar.getInstance();
                calendar.set(year, month, day);
                binding.textSelectedDate.setText(dateFormat.format(calendar.getTime()));
            }
        }, year, month, day);

        dialog.show();
    }

}