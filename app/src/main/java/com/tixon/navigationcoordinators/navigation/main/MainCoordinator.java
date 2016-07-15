package com.tixon.navigationcoordinators.navigation.main;

import android.util.Log;

import com.tixon.navigationcoordinators.screens.base.IBaseView;

import javax.inject.Inject;

/**
 * Created by tikhon.osipov on 15.07.2016
 */
public class MainCoordinator implements IMainCoordinator {
    private IBaseView view;

    @Inject
    public MainCoordinator(IBaseView view) {
        this.view = view;
    }

    @Override
    public void start() {
        Log.d("myLogs", getClass().getSimpleName() + " start method called");
        Log.d("myLogs", "view hashcode: " + view.hashCode());
    }
}
