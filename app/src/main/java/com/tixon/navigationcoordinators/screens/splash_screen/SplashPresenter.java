package com.tixon.navigationcoordinators.screens.splash_screen;

import javax.inject.Inject;

/**
 * Created by tikhon.osipov on 15.07.2016
 */
public class SplashPresenter implements ISplashPresenter {
    private ISplashView view;

    @Inject
    public SplashPresenter(ISplashView view) {
        this.view = view;
    }
}
