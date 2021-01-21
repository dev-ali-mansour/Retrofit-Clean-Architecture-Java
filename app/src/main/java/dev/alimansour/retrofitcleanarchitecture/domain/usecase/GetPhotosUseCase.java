package dev.alimansour.retrofitcleanarchitecture.domain.usecase;

import java.util.List;

import androidx.lifecycle.LiveData;
import dev.alimansour.retrofitcleanarchitecture.domain.model.Photo;
import dev.alimansour.retrofitcleanarchitecture.domain.repository.DataRepository;

/**
 * RetrofitCleanArchitecture Android Application developed by: Ali Mansour
 * Copyright © 2021 Ali Mansour. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- RetrofitCleanArchitecture IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */
public class GetPhotosUseCase {
    private final DataRepository repository;

    public GetPhotosUseCase(DataRepository repository) {
        this.repository = repository;
    }

    public LiveData<List<Photo>> execute() {
        return repository.getPhotos();
    }
}
