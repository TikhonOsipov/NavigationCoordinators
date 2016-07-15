package com.tixon.navigationcoordinators.dagger.modules;

import com.tixon.navigationcoordinators.navigation.AppCoordinator;
import com.tixon.navigationcoordinators.navigation.ICoordinator;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tikhon.osipov on 15.07.2016
 */
@Module
public class NavigationModule {
    @Provides
    @Singleton
    public ICoordinator provideAppCoordinator() {
        return new AppCoordinator();
    }
}
