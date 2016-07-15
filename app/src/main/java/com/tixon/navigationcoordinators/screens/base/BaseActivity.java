package com.tixon.navigationcoordinators.screens.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tixon.navigationcoordinators.application.App;
import com.tixon.navigationcoordinators.dagger.components.IAppComponent;

/**
 * Created by tikhon.osipov on 15.07.2016
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupComponent(App.get(this).getAppComponent());
    }

    protected abstract void setupComponent(IAppComponent appComponent);
}
