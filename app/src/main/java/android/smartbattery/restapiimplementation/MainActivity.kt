package android.smartbattery.restapiimplementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.smartbattery.retrofit.APIInterface
import android.smartbattery.retrofit.PostPojo
import android.smartbattery.retrofit.RetrofitInstance
import android.util.Log
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var apiInterface: APIInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        apiInterface = RetrofitInstance.getRetrofitInstance().create(APIInterface::class.java)
        apiInterface.getPost().enqueue(object : Callback<List<PostPojo>> {
            override fun onResponse(
                call: Call<List<PostPojo>>,
                response: Response<List<PostPojo>>
            ) {
                Log.d("kajal", "onResponse: body:${response?.body()} ")
                if (response?.body() != null) {
                    Toast.makeText(this@MainActivity, " list is not empty", Toast.LENGTH_LONG)
                        .show()
                    Log.d("kajal", "onResponse: not empty")
                } else {
                    Log.d("kajal", "onResponse:empty list ")

                    Toast.makeText(this@MainActivity, "list is empty", Toast.LENGTH_LONG).show()
                }
            }

            override fun onFailure(call: Call<List<PostPojo>>, t: Throwable) {
                Toast.makeText(this@MainActivity, t.localizedMessage, Toast.LENGTH_LONG).show()
            }
        })
    }
}