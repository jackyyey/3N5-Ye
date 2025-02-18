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
            val nom: String = binding.txPersonne.text.toString()
            val call: Call<Personne> = service.getPersonne(nom)
            call.enqueue(object: Callback<Personne>{
                override fun onResponse(call: Call<Personne>,response: Response<Personne>){
                    if (response.isSuccessful){
                        binding.txNom.text = response.body()!!.b
                    }
                }
                override fun onFailure(call: Call<Personne>, t: Throwable) {
                    t.printStackTrace()
                }
            })
        })
    }
}