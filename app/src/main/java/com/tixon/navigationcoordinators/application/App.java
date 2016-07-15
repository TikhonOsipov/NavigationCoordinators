package com.tixon.navigationcoordinators.application;

import android.app.Application;
import android.content.Context;

import com.tixon.navigationcoordinators.dagger.components.DaggerIAppComponent;
import com.tixon.navigationcoordinators.dagger.components.IAppComponent;
import com.tixon.navigationcoordinators.dagger.modules.AppModule;

/**
 * Created by tikhon.osipov on 15.07.2016
 */
public class App extends Application {
    private IAppComponent appComponent;

    public IAppComponent getAppComponent() {
        return appComponent;
    }

    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        buildGraph();
    }

    private void buildGraph() {
        appComponent = DaggerIAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }
}
