package com.kanchan.radiobuttons.radiobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private RadioGroup mRadioGroup;
    private RadioButton mRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            mRadioGroup = (RadioGroup) findViewById(R.id.radiogroupID);

            mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    mRadioButton = (RadioButton) findViewById(checkedId);

                    switch(mRadioButton.getId()) {
                        case R.id.radioButton1ID: {
                            if (mRadioButton.isChecked()) {
                                Log.d("RD", "YES !!");
                            }
                        }
                        break;

                        case R.id.radioButton2ID: {
                            if (mRadioButton.isChecked()) {
                                Log.d("RD", "NO !!");
                            }
                        }
                        break;

                        case R.id.radioButton3ID: {
                            if (mRadioButton.isChecked()) {
                                Log.d("RD", "MAY BE !!");
                            }
                        }
                        break;
                    }
                }
            });

    }
}
