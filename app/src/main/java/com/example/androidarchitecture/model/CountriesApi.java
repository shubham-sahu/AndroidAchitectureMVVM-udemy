package com.example.androidarchitecture.model;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface CountriesApi {
    @GET("search?country=United+Kingdom")
    Single<List<Country>> getCountries();
}
