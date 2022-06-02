package android.smartbattery.retrofit

import retrofit2.Call
import retrofit2.http.GET

interface APIInterface {
    @GET("posts")
   fun getPost(): Call<List<PostPojo>>
}