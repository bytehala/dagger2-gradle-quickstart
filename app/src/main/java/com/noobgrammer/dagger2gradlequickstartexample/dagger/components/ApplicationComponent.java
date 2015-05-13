package com.noobgrammer.dagger2gradlequickstartexample.dagger.components;

import com.noobgrammer.dagger2gradlequickstartexample.OutputActivity;
import com.noobgrammer.dagger2gradlequickstartexample.dagger.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Lem on 5/13/2015.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(OutputActivity activity);
    /**
     * The following are also possible:
     *
     * void inject(InputActivity activity);
     * void inject(BaseActivity activity);
     * void inject(SomeFragmentSubclass fragment);
     *
     * They can all live harmoniously here, because they have different method signatures.
     * I've also seen injectActivity() and injectFragment() variants. I have not done research into
     * the history of this.
     */
}
