package com.alqudri.appmontor.model.log.nonparselog

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("data")
	val data: List<String?>? = null
)
