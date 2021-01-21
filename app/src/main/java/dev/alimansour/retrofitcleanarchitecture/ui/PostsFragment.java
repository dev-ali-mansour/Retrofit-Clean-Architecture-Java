package dev.alimansour.retrofitcleanarchitecture.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import dev.alimansour.retrofitcleanarchitecture.R;
import dev.alimansour.retrofitcleanarchitecture.domain.model.Post;

public class PostsFragment extends Fragment {

    private MainViewModel viewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        viewModel =
                new ViewModelProvider(this).get(MainViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
        final TextView textView = root.findViewById(R.id.text_notifications);
        viewModel.getPosts().observe(getViewLifecycleOwner(), posts -> {
            for (Post post : posts) {
                Log.d("Posts", "Post:" + post.getTitle());
            }
        });
        return root;
    }
}