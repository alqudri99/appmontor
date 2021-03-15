package com.alqudri.appmontor.network


import com.alqudri.appmontor.model.process.GetProcess
import com.alqudri.appmontor.model.log.LogList
import com.alqudri.appmontor.model.log.access.AccessLog
import com.alqudri.appmontor.model.log.nonparselog.NonParseLog
import retrofit2.Call
import retrofit2.http.*


interface Service {

    @GET("getProcess")
    fun getProcess(): Call<GetProcess>

    @GET("getServerLog")
    fun getServerLog(): Call<LogList>

    @GET("log/detail")
    fun getAccess(@Query("mode") mode: String): Call<AccessLog>

    @GET("log/detail")
    fun getNonParse(@Query("mode") mode: String): Call<NonParseLog>

}