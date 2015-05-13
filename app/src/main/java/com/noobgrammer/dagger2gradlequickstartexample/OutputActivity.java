package com.noobgrammer.dagger2gradlequickstartexample;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.InjectViews;


public class OutputActivity extends BaseActivity {

    public static final String EXTRA_INPUT_ARRAY = "OutputActivityExtra_InputArray";

    @InjectViews({R.id.input0, R.id.input1, R.id.input2, R.id.input3, R.id.input4})
    TextView[] outputTexts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_output); // It's important to swap these 2 lines now, because ButterKnife.inject()
        super.onCreate(savedInstanceState);      // in our superclass needs the layout to do InjectView

        int[] input = getIntent().getIntArrayExtra(EXTRA_INPUT_ARRAY);
        for(int i = 0; i < outputTexts.length; i++) {
            outputTexts[i].setText(String.valueOf(input[i]));
        }
        setToolbarTitleText(R.string.output_title);
    }

}
