package com.noobgrammer.dagger2gradlequickstartexample;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import butterknife.InjectView;
import butterknife.OnClick;


public class InputActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_input); // It's important to swap these 2 lines now, because ButterKnife.inject()
        super.onCreate(savedInstanceState);      // in our superclass needs the layout to do InjectView

        setToolbarTitleText(R.string.input_title);
    }

    @OnClick(R.id.sortButton)
    public void sortButtonClicked() {
        Intent intent = new Intent(this, OutputActivity.class);
        startActivity(intent);
    }

}
