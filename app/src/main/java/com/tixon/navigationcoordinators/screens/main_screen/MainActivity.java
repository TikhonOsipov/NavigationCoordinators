package com.tixon.navigationcoordinators.screens.main_screen;

import android.os.Bundle;

import com.tixon.navigationcoordinators.R;
import com.tixon.navigationcoordinators.dagger.components.IAppComponent;
import com.tixon.navigationcoordinators.screens.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void setupComponent(IAppComponent appComponent) {

    }
}
