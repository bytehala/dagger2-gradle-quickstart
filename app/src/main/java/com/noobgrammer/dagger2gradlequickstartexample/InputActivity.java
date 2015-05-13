package com.noobgrammer.dagger2gradlequickstartexample;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import butterknife.InjectView;
import butterknife.InjectViews;
import butterknife.OnClick;


public class InputActivity extends BaseActivity {

    @InjectViews({R.id.input0, R.id.input1, R.id.input2, R.id.input3, R.id.input4})
    EditText[] inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_input); // It's important to swap these 2 lines now, because ButterKnife.inject()
        super.onCreate(savedInstanceState);      // in our superclass needs the layout to do InjectView

        setToolbarTitleText(R.string.input_title);
    }

    @OnClick(R.id.sortButton)
    public void sortButtonClicked() {
        Intent intent = new Intent(this, OutputActivity.class);
        intent.putExtra(OutputActivity.EXTRA_INPUT_ARRAY, getInputs());
        startActivity(intent);
    }

    private int[] getInputs() {
        int[] result = new int[inputText.length];
        for(int i = 0; i < inputText.length; i++) {
            String inputString = inputText[i].getText().toString();
            result[i] = Integer.parseInt(inputString);
        }
        return result;
    }

}
