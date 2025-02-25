package org.ye

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.depinfo.retrofit_demo.http.RetrofitUtil

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.ye.service.Service
import retrofit2.Call

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("org.ye", appContext.packageName)
    }
    @Test
    fun envoieposte(){
        val service: Service = RetrofitUtil.get()
        val request = Personne()
        request.a = 100
        request.b = "gndsadsa"
        request.c = listOf<Long>(8,12,14,18,1998).toTypedArray()
        val call: Call<Personne> = service.postObjet(request)
        val response = call.execute()
        val resultat = response.body()
        println("Retour du signup : " + resultat)
        assert(resultat != null)
    }
}