package com.noobgrammer.dagger2gradlequickstartexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.StringRes;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Lem on 5/13/2015.
 */

/** In this example, BaseActivity is inherited by Activities that have a toolbar in their layout
 *  If, for example, I had other Activities that did not have toolbars I will have them inherit from android.app.Activity instead
 */
public class BaseActivity extends Activity {

    @InjectView(R.id.toolbarTitleText)
    TextView toolbarTitleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.inject(this);
    }

    protected void setToolbarTitleText(@StringRes int titleId) {
        toolbarTitleText.setText(titleId);
    }
}
