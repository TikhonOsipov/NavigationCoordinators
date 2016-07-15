package com.tixon.navigationcoordinators.navigation;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by tikhon.osipov on 15.07.2016
 */
public class AppCoordinator implements ICoordinator {
    @Inject
    public AppCoordinator() {

    }

    ICoordinator coordinator;

    public AppCoordinator setCoordinator(ICoordinator coordinator) {
        this.coordinator = coordinator;
        return this;
    }

    @Override
    public void start() {
        Log.d("myLogs", getClass().getSimpleName() + " start method called");
        if(coordinator != null) {
            coordinator.start();
        }
    }
}
