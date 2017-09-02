package com.ziv.netplayer.home;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ziv.netplayer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements HomeContract.View {
    private TextView resultText;
    private HomeContract.Presenter mPresenter;

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        resultText = (TextView) view.findViewById(R.id.result_tv);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Override
    public void setPresenter(HomeContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void showLoading() {
        resultText.setText(getString(R.string.loading));
    }

    @Override
    public void hideLoading() {
        resultText.setText("");
    }

    @Override
    public void showResult(String result) {
        resultText.setText(result);
    }
}
