package com.ziv.netplayer.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ziv.netplayer.R;
import com.ziv.netplayer.data.MovieRepository;

import static com.ziv.netplayer.utils.ActivityUtil.addFragmentToActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        HomeFragment homeFragment = (HomeFragment) getSupportFragmentManager()
                .findFragmentById(R.id.contentFrame);
        if (homeFragment == null){
            homeFragment = HomeFragment.newInstance();
            addFragmentToActivity(getSupportFragmentManager(), homeFragment, R.id.contentFrame);
        }
        new HomePresenter(new MovieRepository(), homeFragment);
    }
}
