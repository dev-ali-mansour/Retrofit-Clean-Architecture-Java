package dev.alimansour.retrofitcleanarchitecture.domain.usecase;

import java.util.List;

import androidx.lifecycle.LiveData;
import dev.alimansour.retrofitcleanarchitecture.domain.model.Post;
import dev.alimansour.retrofitcleanarchitecture.domain.repository.DataRepository;

/**
 * RetrofitCleanArchitecture Android Application developed by: Ali Mansour
 * Copyright © 2021 Ali Mansour. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- RetrofitCleanArchitecture IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */
public class GetPostsUseCase {
    private final DataRepository repository;

    public GetPostsUseCase(DataRepository repository) {
        this.repository = repository;
    }

    public LiveData<List<Post>> execute (){
        return repository.getPosts();
    }
}
