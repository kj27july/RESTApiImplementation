package android.smartbattery.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {

    companion object {
        private var retrofit: Retrofit? = null
        private var BASE_URL = "https://jsonplaceholder.typicode.com/"

        fun getRetrofitInstance(): Retrofit {
            if (retrofit == null) {
                retrofit = Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build()
            }
            return retrofit!!
        }
    }
}