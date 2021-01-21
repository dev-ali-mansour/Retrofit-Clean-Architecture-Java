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
import dev.alimansour.retrofitcleanarchitecture.domain.model.User;

public class UsersFragment extends Fragment {

    private MainViewModel mainViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mainViewModel =
                new ViewModelProvider(this).get(MainViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        mainViewModel.getUsers().observe(getViewLifecycleOwner(), users -> {
            if (users != null && users.size() > 0) {
                for (User user : users) {
                    Log.d("Users", "User name: " + user.name);
                }
            }
        });
        return root;
    }
}