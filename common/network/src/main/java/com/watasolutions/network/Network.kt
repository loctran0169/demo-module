package com.watasolutions.network

//fun createNetworkClient(baseUrl: String, debug: Boolean = false): Retrofit.Builder =
//    retrofitClient(baseUrl, httpClient(debug))
//
//private fun httpClient(debug: Boolean): OkHttpClient {
//    val httpLoggingInterceptor = HttpLoggingInterceptor(HttpLoggingInterceptor.Logger.DEFAULT)
//    val clientBuilder = OkHttpClient.Builder()
//    if (debug) {
//        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
//        clientBuilder.addInterceptor(httpLoggingInterceptor)
//    }
//    return clientBuilder.build()
//}
//
//private fun retrofitClient(baseUrl: String, httpClient: OkHttpClient): Retrofit.Builder =
//    Retrofit.Builder()
//        .baseUrl(baseUrl)
//        .client(httpClient)
//        .addConverterFactory(MoshiConverterFactory.create())
