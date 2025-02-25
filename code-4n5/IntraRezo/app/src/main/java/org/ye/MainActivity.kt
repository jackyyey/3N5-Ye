package org.ye

import android.hardware.biometrics.BiometricManager
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import androidx.recyclerview.widget.DividerItemDecoration
import com.google.gson.Gson
import org.depinfo.retrofit_demo.http.RetrofitUtil
import org.ye.adapters.LongAdapter
import org.ye.adapters.NombreAdapter
import org.ye.databinding.ActivityMainBinding
import org.ye.service.Service
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private lateinit var adapter: NombreAdapter
    private lateinit var adapterLong: LongAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvRecyclerComplex.isVisible = false
        binding.btnRetour.setOnClickListener{
            fillRecycler(binding.txNombre.text.toString())
            binding.rvRecyclerComplex.isVisible = true
        }
        setupRecycler()
        fillRecycler("12")
    }
    private fun setupRecycler() {
        adapter = NombreAdapter() // Créer l'adapteur
        binding.rvRecyclerComplex.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.rvRecyclerComplex.setHasFixedSize(true) // Option pour améliorer les performances
        binding.rvRecyclerComplex.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.rvRecyclerComplex.context, DividerItemDecoration.VERTICAL
            )
        )

    }
    private fun fillRecycler(nombre: String) {
        val service: Service = RetrofitUtil.get()
        val callLong: Call<List<Long>> = service.getListLong()
        val callComplex: Call<List<Nombre>> = service.getListComplex(nombre)
        callComplex.enqueue(object: Callback<List<Nombre>>{
            override fun onResponse(call: Call<List<Nombre>>,response: Response<List<Nombre>>){
                if (response.isSuccessful){
                    var e: List<Nombre>? = response.body()
                    adapter.submitList(response.body())
                    Log.i("retour", Gson().toJson(response.body()))
                }
            }
            override fun onFailure(call: Call<List<Nombre>>, t: Throwable) {
                t.printStackTrace()
            }
        })
    }


}