package com.tixon.navigationcoordinators.navigation.splash;

import android.util.Log;

import com.tixon.navigationcoordinators.screens.base.IBaseView;
import com.tixon.navigationcoordinators.screens.main_screen.MainActivity;

import javax.inject.Inject;

/**
 * Created by tikhon.osipov on 15.07.2016
 */
public class SplashCoordinator implements ISplashCoordinator {
    public static final int WAIT_MILLIS = 2000;

    private IBaseView view;

    @Inject
    public SplashCoordinator(IBaseView view) {
        this.view = view;
    }

    @Override
    public void start() {
        Log.d("myLogs", getClass().getSimpleName() + " start method called");
        Log.d("myLogs", "view hashcode: " + view.hashCode());

        openNextScreen();
    }

    @Override
    public void openNextScreen() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(WAIT_MILLIS);
                    view.launchActivity(MainActivity.class);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
