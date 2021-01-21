package dev.alimansour.retrofitcleanarchitecture.ui;

import android.os.AsyncTask;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import dev.alimansour.retrofitcleanarchitecture.data.repository.DataRepositoryImpl;
import dev.alimansour.retrofitcleanarchitecture.domain.model.Photo;
import dev.alimansour.retrofitcleanarchitecture.domain.model.Post;
import dev.alimansour.retrofitcleanarchitecture.domain.model.User;
import dev.alimansour.retrofitcleanarchitecture.domain.usecase.GetPhotosUseCase;
import dev.alimansour.retrofitcleanarchitecture.domain.usecase.GetPostsUseCase;
import dev.alimansour.retrofitcleanarchitecture.domain.usecase.GetUsersUseCase;

public class MainViewModel extends ViewModel {
    MutableLiveData<List<User>> usersLiveData = new MutableLiveData<>();

    private final GetUsersUseCase getUsersUseCase;
    private final GetPhotosUseCase getPhotosUseCase;
    private final GetPostsUseCase getPostsUseCase;

    public MainViewModel() {
        DataRepositoryImpl repository = new DataRepositoryImpl();
        getUsersUseCase = new GetUsersUseCase(repository);
        getPhotosUseCase = new GetPhotosUseCase(repository);
        getPostsUseCase = new GetPostsUseCase(repository);
    }

    public LiveData<List<User>> getUsers() {
        return getUsersUseCase.execute();
    }
    public LiveData<List<Photo>> getPhotos() {
        return getPhotosUseCase.execute();
    }
    public LiveData<List<Post>> getPosts() {
        return getPostsUseCase.execute();
    }

    private final class GetUsers extends AsyncTask<Void,Void,Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            return null;
        }
    }
}