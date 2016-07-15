package com.tixon.navigationcoordinators.dagger.components;

import com.tixon.navigationcoordinators.dagger.modules.MainActivityModule;
import com.tixon.navigationcoordinators.dagger.scopes.ActivityScope;
import com.tixon.navigationcoordinators.navigation.main.IMainCoordinator;
import com.tixon.navigationcoordinators.screens.main_screen.MainActivity;

import dagger.Component;

/**
 * Created by tikhon.osipov on 15.07.2016
 */
@ActivityScope
@Component(dependencies = {IAppComponent.class}, modules = {MainActivityModule.class})
public interface IMainActivityComponent {
    IMainCoordinator mainCoordinator();
    void inject(MainActivity activity);
}
