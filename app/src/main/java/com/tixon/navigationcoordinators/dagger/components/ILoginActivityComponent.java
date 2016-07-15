package com.tixon.navigationcoordinators.dagger.components;

import com.tixon.navigationcoordinators.dagger.modules.LoginActivityModule;
import com.tixon.navigationcoordinators.dagger.scopes.ActivityScope;
import com.tixon.navigationcoordinators.screens.login_screen.LoginActivity;

import dagger.Component;

/**
 * Created by tikhon.osipov on 15.07.2016
 */
@ActivityScope
@Component(dependencies = {IAppComponent.class}, modules = {LoginActivityModule.class})
public interface ILoginActivityComponent {
    void inject(LoginActivity activity);
}
