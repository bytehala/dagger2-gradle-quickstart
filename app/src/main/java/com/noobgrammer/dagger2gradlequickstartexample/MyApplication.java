package com.noobgrammer.dagger2gradlequickstartexample;

import android.app.Application;

import com.noobgrammer.dagger2gradlequickstartexample.dagger.components.ApplicationComponent;
import com.noobgrammer.dagger2gradlequickstartexample.dagger.components.DaggerApplicationComponent;
import com.noobgrammer.dagger2gradlequickstartexample.dagger.modules.ApplicationModule;

/**
 * Created by Lem on 5/13/2015.
 */
public class MyApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector() {
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }


}
