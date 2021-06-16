package com.watasolutions.client

import com.google.gson.annotations.Expose

data class Client(
    @Expose var id: Int?,
    @Expose var name: String?
)