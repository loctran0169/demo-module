package com.watasolutions.demomodule.model

import com.google.gson.annotations.Expose

data class Estimate(
    @Expose var id: Int?,
    @Expose var name: String?,
    @Expose var vehicle: String?,
    @Expose var date: String?
)