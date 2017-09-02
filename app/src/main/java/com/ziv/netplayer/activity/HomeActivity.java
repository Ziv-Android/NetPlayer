package com.ziv.netplayer.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ziv.netplayer.R;
import com.ziv.netplayer.data.MovieRepository;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        HomeFragment homeFragment = (HomeFragment) getSupportFragmentManager()
                .findFragmentById(R.id.contentFrame);
        new HomePresenter(new MovieRepository(), homeFragment);
    }
}
