package com.tixon.navigationcoordinators.screens.main_screen;

import android.os.Bundle;

import com.tixon.navigationcoordinators.R;
import com.tixon.navigationcoordinators.dagger.components.DaggerIMainActivityComponent;
import com.tixon.navigationcoordinators.dagger.components.IAppComponent;
import com.tixon.navigationcoordinators.dagger.components.IMainActivityComponent;
import com.tixon.navigationcoordinators.dagger.modules.MainActivityModule;
import com.tixon.navigationcoordinators.screens.base.BaseActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements IMainView {
    private IMainActivityComponent component;

    @Inject
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void setupComponent(IAppComponent appComponent) {
        component = DaggerIMainActivityComponent.builder()
                .iAppComponent(appComponent)
                .mainActivityModule(new MainActivityModule(this))
                .build();
        component.inject(this);
    }
}
