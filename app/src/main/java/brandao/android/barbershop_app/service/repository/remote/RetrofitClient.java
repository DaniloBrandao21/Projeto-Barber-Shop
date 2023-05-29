package brandao.android.barbershop_app.service.repository.remote;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitClient {

    private static String BASE_URL = "";
    private static Retrofit retrofit;

    //Headers ?? TODO

    private static Retrofit getRetrofitInstance() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(httpClient.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }


    public static <S> S createService(Class<S> sClass) {
        return getRetrofitInstance().create(sClass);
    }


}
