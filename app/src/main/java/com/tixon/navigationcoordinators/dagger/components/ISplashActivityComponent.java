package com.tixon.navigationcoordinators.dagger.components;

import com.tixon.navigationcoordinators.dagger.modules.SplashActivityModule;
import com.tixon.navigationcoordinators.dagger.scopes.ActivityScope;
import com.tixon.navigationcoordinators.navigation.splash.ISplashCoordinator;
import com.tixon.navigationcoordinators.screens.splash_screen.SplashActivity;

import dagger.Component;

/**
 * Created by tikhon.osipov on 15.07.2016
 */
@ActivityScope
@Component(dependencies = {IAppComponent.class}, modules = {SplashActivityModule.class})
public interface ISplashActivityComponent {
    ISplashCoordinator splashCoordinator();
    void inject(SplashActivity activity);
}
