package com.ziv.netplayer.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.ziv.netplayer.R;
import com.ziv.netplayer.data.MovieDataSource;
import com.ziv.netplayer.data.remote.OnlyRetrofit;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.click_me_btn)
    Button clickMeBtn;
    @BindView(R.id.result_tv_1)
    TextView resultTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.click_me_btn)
    public void onClick() {
        Log.e("ButterKnife", "onClick");
        // 网络请求数据
        MovieDataSource dataSource = new OnlyRetrofit();
        String movieInfo = dataSource.getMovieInfo();
        Log.d("Ziv", "MainActivity onClick MovieInfo = " + movieInfo);
        resultTv.setText(movieInfo);
    }
}
