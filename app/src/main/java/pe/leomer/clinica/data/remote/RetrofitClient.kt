package pe.leomer.clinica.data.remote

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private val okHttpClient: OkHttpClient by lazy {
        OkHttpClient.Builder()
            .addInterceptor { chain ->
                val request = chain.request()
                println("URL request: ${request.url()}")
                chain.proceed(request)
            }
            .build()
    }

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://feux4ohbfl.execute-api.us-east-1.amazonaws.com/v1/")
            //.baseUrl("http://192.168.1.33:8080")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    //val api: ApiService = retrofit.create(ApiService::class.java)
    val api: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}