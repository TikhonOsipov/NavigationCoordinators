package com.tixon.navigationcoordinators.screens.login_screen;

import javax.inject.Inject;

/**
 * Created by tikhon.osipov on 15.07.2016
 */
public class LoginPresenter implements ILoginPresenter {
    private ILoginView view;

    @Inject
    public LoginPresenter(ILoginView view) {
        this.view = view;
    }
}
