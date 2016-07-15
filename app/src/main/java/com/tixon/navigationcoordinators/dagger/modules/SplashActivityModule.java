package com.tixon.navigationcoordinators.dagger.modules;

import com.tixon.navigationcoordinators.dagger.scopes.ActivityScope;
import com.tixon.navigationcoordinators.navigation.splash.ISplashCoordinator;
import com.tixon.navigationcoordinators.navigation.splash.SplashCoordinator;
import com.tixon.navigationcoordinators.screens.splash_screen.ISplashPresenter;
import com.tixon.navigationcoordinators.screens.splash_screen.ISplashView;
import com.tixon.navigationcoordinators.screens.splash_screen.SplashPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tikhon.osipov on 15.07.2016
 */
@Module
public class SplashActivityModule {
    private ISplashView view;

    public SplashActivityModule(ISplashView view) {
        this.view = view;
    }

    @Provides
    public ISplashView provideView() {
        return view;
    }

    @Provides
    @ActivityScope
    public ISplashCoordinator provideCoordinator() {
        return new SplashCoordinator(view);
    }

    @Provides
    @ActivityScope
    public ISplashPresenter providePresenter() {
        return new SplashPresenter(view);
    }
}
