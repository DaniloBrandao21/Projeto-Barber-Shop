package brandao.android.barbershop_app.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import brandao.android.barbershop_app.service.repository.PersonRepository;

public class LoginViewModel extends AndroidViewModel {
    private PersonRepository repository;

    public LoginViewModel(@NonNull Application application) {
        super(application);
         this.repository = new PersonRepository(application);
    }

    public void login(){
        repository.login();
    }




}
