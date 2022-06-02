package com.example.task.data.api

import com.example.task.data.model.User
import retrofit2.Response

interface ApiHelper {
    suspend fun getUsers(): Response<List<User>>
}