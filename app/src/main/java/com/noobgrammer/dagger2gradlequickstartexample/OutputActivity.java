package com.noobgrammer.dagger2gradlequickstartexample;

import android.os.Bundle;


public class OutputActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_output); // It's important to swap these 2 lines now, because ButterKnife.inject()
        super.onCreate(savedInstanceState);      // in our superclass needs the layout to do InjectView

        setToolbarTitleText(R.string.output_title);
    }

}
