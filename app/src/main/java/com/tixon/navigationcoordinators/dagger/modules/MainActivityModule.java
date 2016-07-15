package com.tixon.navigationcoordinators.dagger.modules;

import com.tixon.navigationcoordinators.dagger.scopes.ActivityScope;
import com.tixon.navigationcoordinators.screens.main_screen.IMainPresenter;
import com.tixon.navigationcoordinators.screens.main_screen.IMainView;
import com.tixon.navigationcoordinators.screens.main_screen.MainPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tikhon.osipov on 15.07.2016
 */
@Module
public class MainActivityModule {
    private IMainView view;

    public MainActivityModule(IMainView view) {
        this.view = view;
    }

    @Provides
    public IMainView provideView() {
        return view;
    }

    @Provides
    @ActivityScope
    public IMainPresenter providePresenter() {
        return new MainPresenter(view);
    }
}
