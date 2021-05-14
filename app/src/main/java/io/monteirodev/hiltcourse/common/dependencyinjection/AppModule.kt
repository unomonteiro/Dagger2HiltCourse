package io.monteirodev.hiltcourse.common.dependencyinjection

import android.app.Application
import dagger.Module
import dagger.Provides
import io.monteirodev.hiltcourse.Constants
import io.monteirodev.hiltcourse.networking.StackoverflowApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class AppModule(val application: Application) {

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    private val stackoverflowApi: StackoverflowApi by lazy {
        retrofit.create(StackoverflowApi::class.java)
    }

    @Provides
    fun application() = application

    @Provides
    fun stackoverflowApi() = stackoverflowApi
}