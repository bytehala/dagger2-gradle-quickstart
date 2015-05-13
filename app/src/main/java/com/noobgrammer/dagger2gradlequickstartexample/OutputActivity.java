package com.noobgrammer.dagger2gradlequickstartexample;

import android.os.Bundle;
import android.widget.TextView;

import com.example.SomeThirdPartyClass;
import com.noobgrammer.dagger2gradlequickstartexample.dagger.components.ApplicationComponent;

import javax.inject.Inject;

import butterknife.InjectViews;


public class OutputActivity extends BaseActivity {

    public static final String EXTRA_INPUT_ARRAY = "OutputActivityExtra_InputArray";

    @InjectViews({R.id.input0, R.id.input1, R.id.input2, R.id.input3, R.id.input4})
    TextView[] outputTexts;

    @Inject
    SomeThirdPartyClass someClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_output);
        super.onCreate(savedInstanceState);
        getApplicationComponent().inject(this);
        // Notice that the code above is very much like ButterKnife.inject(this)
        // It calls the inject() method that we previously declared in ApplicationComponent

        int[] input = getIntent().getIntArrayExtra(EXTRA_INPUT_ARRAY);

        int[] sorted = someClass.sort(input);
        for(int i = 0; i < outputTexts.length; i++) {
            outputTexts[i].setText(String.valueOf(sorted[i]));
        }
        setToolbarTitleText(R.string.output_title);
    }


    public ApplicationComponent getApplicationComponent() {
        return ((MyApplication) getApplication()).getApplicationComponent();
    }
}
