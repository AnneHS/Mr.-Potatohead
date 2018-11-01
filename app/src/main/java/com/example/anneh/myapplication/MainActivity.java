package com.example.anneh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View v) {
        Log.d("potato", "checkClicked");

        CheckBox checkbox = (CheckBox) v;
        String checkbox_string = checkbox.getText().toString();

        image_dict = {} ??

        ImageView image = (ImageView) findViewById(R.id.arms);

        if (checkbox.isChecked()) {
            image = visible
                    set.Visibility(View.VISIBLE);
        }
        else {
            image = invisible
                    set.Visibility(View.INVISIBLE);
        }
    }
}
