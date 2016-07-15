package com.tixon.navigationcoordinators.screens.splash_screen;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.tixon.navigationcoordinators.R;
import com.tixon.navigationcoordinators.dagger.components.DaggerISplashActivityComponent;
import com.tixon.navigationcoordinators.dagger.components.IAppComponent;
import com.tixon.navigationcoordinators.dagger.components.ISplashActivityComponent;
import com.tixon.navigationcoordinators.dagger.modules.SplashActivityModule;
import com.tixon.navigationcoordinators.screens.base.BaseActivity;

import javax.inject.Inject;

/**
 * Created by tikhon.osipov on 15.07.2016
 */
public class SplashActivity extends BaseActivity implements ISplashView {
    private ISplashActivityComponent component;

    @Inject
    SplashPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    @Override
    protected void setupComponent(IAppComponent appComponent) {
        component = DaggerISplashActivityComponent.builder()
                .iAppComponent(appComponent)
                .splashActivityModule(new SplashActivityModule(this))
                .build();
        component.inject(this);
    }
}
