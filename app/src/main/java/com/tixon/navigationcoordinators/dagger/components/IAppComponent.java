package com.tixon.navigationcoordinators.dagger.components;

import com.tixon.navigationcoordinators.dagger.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by tikhon.osipov on 15.07.2016
 */
@Singleton
@Component(modules = AppModule.class)
public interface IAppComponent {
}
