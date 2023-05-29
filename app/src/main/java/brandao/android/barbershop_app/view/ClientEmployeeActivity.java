package brandao.android.barbershop_app.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;

import brandao.android.barbershop_app.R;
import brandao.android.barbershop_app.databinding.ActivityClientEmployeeBinding;

public class ClientEmployeeActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityClientEmployeeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityClientEmployeeBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.textClient.setOnClickListener(this);
        binding.textEmployee.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.text_client){
            Intent intent = new Intent(ClientEmployeeActivity.this, LoginActivity.class);
            startActivity(intent);
        }
//        else if (v.getId() == R.id.text_employee){
//             TODO
//        }
    }
}