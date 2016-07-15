package com.tixon.navigationcoordinators.screens.main_screen;

import javax.inject.Inject;

/**
 * Created by tikhon.osipov on 15.07.2016
 */
public class MainPresenter implements IMainPresenter {
    private IMainView view;

    @Inject
    public MainPresenter(IMainView view) {
        this.view = view;
    }
}
