package org.ye

import android.hardware.biometrics.BiometricManager
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
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
            val nombre: String = binding.txNombre.text.toString()
            val call: Call<String> = service.doublerNombre(nombre)
            call.enqueue(object: Callback<String>{
                override fun onResponse(call: Call<String>,response: Response<String>){
                    if (response.isSuccessful){
                        Toast.makeText(binding.root.context,response.body(),Toast.LENGTH_SHORT).show()
                    }
                }
                override fun onFailure(call: Call<String>, t: Throwable) {
                    Toast.makeText(binding.root.context,"pas de reponse",Toast.LENGTH_SHORT).show()
                }
            })
        })
    }
}