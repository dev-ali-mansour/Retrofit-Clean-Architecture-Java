package dev.alimansour.retrofitcleanarchitecture.data.repository;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import dev.alimansour.retrofitcleanarchitecture.data.ApiClient;
import dev.alimansour.retrofitcleanarchitecture.data.ApiService;
import dev.alimansour.retrofitcleanarchitecture.domain.model.Photo;
import dev.alimansour.retrofitcleanarchitecture.domain.model.Post;
import dev.alimansour.retrofitcleanarchitecture.domain.model.User;
import dev.alimansour.retrofitcleanarchitecture.domain.repository.DataRepository;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * RetrofitCleanArchitecture Android Application developed by: Ali Mansour
 * Copyright © 2021 Ali Mansour. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- RetrofitCleanArchitecture IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */
public class DataRepositoryImpl implements DataRepository {
    private static final ApiService service = ApiClient.getClient().create(ApiService.class);
    private static MutableLiveData<List<User>> usersLiveData = new MutableLiveData<>();
    private static MutableLiveData<List<Post>> postsLiveData = new MutableLiveData<>();
    private static MutableLiveData<List<Photo>> photosLiveData = new MutableLiveData<>();

    @Override
    public LiveData<List<User>> getUsers() {
        try {
            service.getUsers().enqueue(new Callback<List<User>>() {
                @Override
                public void onResponse(@NotNull Call<List<User>> call, @NotNull Response<List<User>> response) {
                    if (response.isSuccessful()) {
                        usersLiveData.postValue(response.body());
                    }
                }

                @Override
                public void onFailure(@NotNull Call<List<User>> call, @NotNull Throwable t) {
                    t.printStackTrace();
                }
            });
            return usersLiveData;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public LiveData<List<Post>> getPosts() {
        service.getPosts().enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(@NotNull Call<List<Post>> call, @NotNull Response<List<Post>> response) {
                if (response.isSuccessful()) {
                    postsLiveData.postValue(response.body());
                }
            }

            @Override
            public void onFailure(@NotNull Call<List<Post>> call, @NotNull Throwable t) {
                t.printStackTrace();
            }
        });
        return postsLiveData;
    }

    @Override
    public LiveData<List<Photo>> getPhotos() {
        service.getPhotos().enqueue(new Callback<List<Photo>>() {
            @Override
            public void onResponse(@NotNull Call<List<Photo>> call, @NotNull Response<List<Photo>> response) {
                if (response.isSuccessful()) {
                    photosLiveData.postValue(response.body());
                }
            }

            @Override
            public void onFailure(@NotNull Call<List<Photo>> call, @NotNull Throwable t) {
                t.printStackTrace();
            }
        });
        return photosLiveData;
    }
}