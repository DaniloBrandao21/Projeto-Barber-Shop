package brandao.android.barbershop_app.view;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import brandao.android.barbershop_app.R;
import brandao.android.barbershop_app.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityRegisterBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());






    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_register){
            String nome = binding.editName.getText().toString();
            String email = binding.editEmail.getText().toString();
            String phoneText = binding.editPhone.getText().toString();
            int phone = Integer.parseInt(phoneText);
            String password = binding.editPassword.getText().toString();
            binding.buttonRegister.setOnClickListener(this);

        }

    }
}