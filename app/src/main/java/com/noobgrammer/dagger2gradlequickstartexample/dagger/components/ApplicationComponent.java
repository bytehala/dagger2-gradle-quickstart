package com.noobgrammer.dagger2gradlequickstartexample.dagger.components;

import com.noobgrammer.dagger2gradlequickstartexample.InputActivity;
import com.noobgrammer.dagger2gradlequickstartexample.dagger.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Lem on 5/13/2015.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
}
