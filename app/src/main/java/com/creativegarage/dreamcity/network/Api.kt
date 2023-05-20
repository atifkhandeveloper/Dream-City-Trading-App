package com.creativegarage.dreamcity.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Api {
    private var retrofit: Retrofit? = null

    private fun getRetrofit(baseUrl: String): Retrofit? {
//        val interceptor = Interceptor { chain ->
//            val request = chain.request()
//            val accept = request.newBuilder()
//                .addHeader("ACCEPT", "application/json")
//                .build()
//            chain.proceed(accept)
//        }
//        val client = OkHttpClient.Builder()
//            .connectTimeout(90, TimeUnit.SECONDS)
//            .writeTimeout(90, TimeUnit.SECONDS)
//            .readTimeout(90, TimeUnit.SECONDS)
//            .retryOnConnectionFailure(true)
//            .addInterceptor(interceptor)
//            .build()
//
//        val gson = GsonBuilder()
//            .setLenient()
//            .create()
//        retrofit = Retrofit.Builder()
//            .baseUrl(baseUrl)
//            .addConverterFactory(GsonConverterFactory.create(gson))
//            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//            .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
//            .client(client)
//            .build()
//        return retrofit


        retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit
    }

    fun getService(baseUrl: String): Service {
        return getRetrofit(baseUrl)!!.create(Service::class.java)
    }


}