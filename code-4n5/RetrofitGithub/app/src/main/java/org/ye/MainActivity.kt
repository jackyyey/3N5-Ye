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
import org.ye.adapters.RepoAdapter
import org.ye.service.Service
import org.ye.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.jar.Attributes.Name

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private lateinit var adapter: RepoAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupRecycler()
        fillRecycler()
    }
    private fun setupRecycler() {
        adapter = RepoAdapter() // Créer l'adapteur
        binding.rvRecyclerComplex.adapter = adapter // Assigner l'adapteur au RecyclerView // Assigner l'adapteur au RecyclerView
        binding.rvRecyclerComplex.setHasFixedSize(true) // Option pour améliorer les performances
        binding.rvRecyclerComplex.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.rvRecyclerComplex.context, DividerItemDecoration.VERTICAL
            )
        )

    }
    private fun fillRecycler() {
        val service: Service = RetrofitUtil.get()
        val callComplex: Call<List<Repo>> = service.getRepo()
        callComplex.enqueue(object: Callback<List<Repo>>{
            override fun onResponse(call: Call<List<Repo>>,response: Response<List<Repo>>){
                if (response.isSuccessful){
                    var e = response.body();
                    adapter.submitList(e)
                }
            }
            override fun onFailure(call: Call<List<Repo>>, t: Throwable) {
                t.printStackTrace()
            }
            })
    }


}