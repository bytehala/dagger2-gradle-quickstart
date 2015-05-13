package com.noobgrammer.dagger2gradlequickstartexample.dagger.modules;

import android.app.Application;
import android.content.Context;

import com.example.SomeThirdPartyClass;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Lem on 5/13/2015.
 */
@Module
public class ApplicationModule {

    private final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return application.getApplicationContext();
    }

    @Provides
    SomeThirdPartyClass provideSomeClass() {
        return new SomeThirdPartyClass();
    }

}
