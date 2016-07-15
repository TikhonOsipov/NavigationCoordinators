package com.tixon.navigationcoordinators.dagger.modules;

import com.tixon.navigationcoordinators.dagger.scopes.ActivityScope;
import com.tixon.navigationcoordinators.screens.login_screen.ILoginPresenter;
import com.tixon.navigationcoordinators.screens.login_screen.ILoginView;
import com.tixon.navigationcoordinators.screens.login_screen.LoginPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tikhon.osipov on 15.07.2016
 */
@Module
public class LoginActivityModule {
    private ILoginView view;

    public LoginActivityModule(ILoginView view) {
        this.view = view;
    }

    @Provides
    public ILoginView provideView() {
        return view;
    }

    @Provides
    @ActivityScope
    public ILoginPresenter providePresenter() {
        return new LoginPresenter(view);
    }
}
