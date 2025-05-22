package org.ye

import android.hardware.biometrics.BiometricManager
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import org.depinfo.retrofit_demo.http.RetrofitUtil
import org.ye.databinding.ActivityMainBinding
import org.ye.service.Service
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnDouble.setOnClickListener({
            val service: Service = RetrofitUtil.get()
            val nom: String = binding.txPersonne.text.toString()
            val call: Call<String> = service.bonjour(nom)
            call.enqueue(object: Callback<String>{
                override fun onResponse(call: Call<String>,response: Response<String>){
                    if (response.isSuccessful){
                        binding.txNom.text = response.body()!!
                    }
                    else{
                        var error = response.errorBody()?.string()
                        var haha = response.body()
                        Snackbar.make(binding.main,error.toString(),Snackbar.LENGTH_SHORT).show()
                    }
                }
                override fun onFailure(call: Call<String>, t: Throwable) {
                    t.printStackTrace()
                }
            })
        })
    }
}