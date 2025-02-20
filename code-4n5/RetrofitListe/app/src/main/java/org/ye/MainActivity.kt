package org.ye

import android.hardware.biometrics.BiometricManager
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import org.depinfo.retrofit_demo.http.RetrofitUtil
import org.ye.adapters.LongAdapter
import org.ye.adapters.PersonneAdapter
import org.ye.databinding.ActivityMainBinding
import org.ye.service.Service
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private lateinit var adapter: PersonneAdapter
    private lateinit var adapterLong: LongAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupRecycler()
        fillRecycler()
    }
    private fun setupRecycler() {
        adapter = PersonneAdapter() // Créer l'adapteur
        adapterLong = LongAdapter() // Créer l'adapteur long
        binding.rvRecyclerComplex.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.rvRecyclerLong.adapter = adapterLong // Assigner l'adapteur au RecyclerView
        binding.rvRecyclerComplex.setHasFixedSize(true) // Option pour améliorer les performances
        binding.rvRecyclerLong.setHasFixedSize(true)
        binding.rvRecyclerComplex.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.rvRecyclerComplex.context, DividerItemDecoration.VERTICAL
            )
        )
        binding.rvRecyclerLong.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.rvRecyclerLong.context, DividerItemDecoration.VERTICAL
            )
        )
    }
    private fun fillRecycler() {
        val service: Service = RetrofitUtil.get()
        val callLong: Call<List<Long>> = service.getListLong()
        val callComplex: Call<List<Personne>> = service.getListComplex()
        callComplex.enqueue(object: Callback<List<Personne>>{
            override fun onResponse(call: Call<List<Personne>>,response: Response<List<Personne>>){
                if (response.isSuccessful){
                    var e = response.body();
                    adapter.submitList(response.body())
                }
            }
            override fun onFailure(call: Call<List<Personne>>, t: Throwable) {
                t.printStackTrace()
            }
        })
         callLong.enqueue(object: Callback<List<Long>>{
            override fun onResponse(call: Call<List<Long>>,response: Response<List<Long>>){
                if (response.isSuccessful){
                    adapterLong.submitList(response.body())
                }
            }
            override fun onFailure(call: Call<List<Long>>, t: Throwable) {
                t.printStackTrace()
            }
        })
    }


}