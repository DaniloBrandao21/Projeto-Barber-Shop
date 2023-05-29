package brandao.android.barbershop_app.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import brandao.android.barbershop_app.R;
import brandao.android.barbershop_app.databinding.ActivityLoginBinding;
import brandao.android.barbershop_app.viewmodel.LoginViewModel;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityLoginBinding binding;
    private LoginViewModel loginViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        this.loginViewModel = new ViewModelProvider(this).get(LoginViewModel.class);

        binding.textClickHere.setOnClickListener(this);
        binding.buttonEnter.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.text_click_here){
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.button_enter){
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);

            String email = binding.editEmail.getText().toString();
            String password = binding.editPassword.getText().toString();

            loginViewModel.login();


        }

    }
}