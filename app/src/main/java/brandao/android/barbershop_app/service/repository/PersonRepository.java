package brandao.android.barbershop_app.service.repository;

import android.content.Context;

import brandao.android.barbershop_app.service.model.UserModel;
import brandao.android.barbershop_app.service.repository.local.SecurityPreferences;

public class PersonRepository {

//   TODO private PersonService personService;
    private SecurityPreferences preferences;

    public PersonRepository(Context context) {
        this.preferences = preferences;
    }

    public void saveUserData(UserModel user) {
    }

    public void login(){

    }


}
