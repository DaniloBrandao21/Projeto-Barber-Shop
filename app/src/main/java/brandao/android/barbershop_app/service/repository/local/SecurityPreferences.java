package brandao.android.barbershop_app.service.repository.local;

import android.content.Context;
import android.content.SharedPreferences;

public class SecurityPreferences{

    private SharedPreferences mSharedPreferences;

    public SecurityPreferences(Context context){
        this.mSharedPreferences =context.getSharedPreferences("barberShared", Context.MODE_PRIVATE);
    }

    // Salvar valor baseado em uma chave

    public void storeString(String key, String value){
        this.mSharedPreferences.edit().putString(key, value).apply();
    }


    // Obtém o valor associado a chave

    public String getStoreString(String key){
        return  this.mSharedPreferences.getString(key, " ");
    }


    // Deleta o valor associado a chave

    public void remoteStore(String key){
        this.mSharedPreferences.edit().remove(key);
     }




}
