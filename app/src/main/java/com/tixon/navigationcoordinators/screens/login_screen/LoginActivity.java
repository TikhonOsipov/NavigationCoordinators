package com.tixon.navigationcoordinators.screens.login_screen;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.tixon.navigationcoordinators.R;
import com.tixon.navigationcoordinators.dagger.components.DaggerILoginActivityComponent;
import com.tixon.navigationcoordinators.dagger.components.IAppComponent;
import com.tixon.navigationcoordinators.dagger.components.ILoginActivityComponent;
import com.tixon.navigationcoordinators.dagger.modules.LoginActivityModule;
import com.tixon.navigationcoordinators.screens.base.BaseActivity;

/**
 * Created by tikhon.osipov on 15.07.2016
 */
public class LoginActivity extends BaseActivity implements ILoginView {
    private ILoginActivityComponent component;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    protected void setupComponent(IAppComponent appComponent) {
        component = DaggerILoginActivityComponent.builder()
                .iAppComponent(appComponent)
                .loginActivityModule(new LoginActivityModule(this))
                .build();
        component.inject(this);
    }
}
