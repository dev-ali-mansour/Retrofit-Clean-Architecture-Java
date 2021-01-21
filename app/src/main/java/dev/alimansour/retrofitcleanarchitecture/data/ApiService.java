package dev.alimansour.retrofitcleanarchitecture.data;

import java.util.List;

import dev.alimansour.retrofitcleanarchitecture.domain.model.Photo;
import dev.alimansour.retrofitcleanarchitecture.domain.model.Post;
import dev.alimansour.retrofitcleanarchitecture.domain.model.User;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * RetrofitCleanArchitecture Android Application developed by: Ali Mansour
 * Copyright © 2021 Ali Mansour. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- RetrofitCleanArchitecture IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */
public interface ApiService {

    @GET("/users")
    Call<List<User>> getUsers();

    @GET("/posts")
    Call<List<Post>> getPosts();

    @GET("/photos")
    Call<List<Photo>> getPhotos();

}
