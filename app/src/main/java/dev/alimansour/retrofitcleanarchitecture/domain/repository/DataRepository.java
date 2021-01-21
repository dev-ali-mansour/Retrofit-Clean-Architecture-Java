package dev.alimansour.retrofitcleanarchitecture.domain.repository;

import java.util.List;

import androidx.lifecycle.LiveData;
import dev.alimansour.retrofitcleanarchitecture.domain.model.Photo;
import dev.alimansour.retrofitcleanarchitecture.domain.model.Post;
import dev.alimansour.retrofitcleanarchitecture.domain.model.User;

/**
 * RetrofitCleanArchitecture Android Application developed by: Ali Mansour
 * Copyright © 2021 Ali Mansour. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- RetrofitCleanArchitecture IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */
public interface DataRepository {

    LiveData<List<User>> getUsers();

    LiveData<List<Post>> getPosts();

    LiveData<List<Photo>> getPhotos();
}
