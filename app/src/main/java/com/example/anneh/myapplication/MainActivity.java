package com.example.anneh.myapplication;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    ImageView glasses, hat, eyebrows, nose, mustache, arms, eyes, mouth, ears, shoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set reference for images
        glasses = findViewById(R.id.glasses);
        hat = findViewById(R.id.hat);
        eyebrows = findViewById(R.id.eyebrows);
        nose = findViewById(R.id.nose);
        mustache = findViewById(R.id.mustache);
        arms = findViewById(R.id.arms);
        eyes = findViewById(R.id.eyes);
        mouth = findViewById(R.id.mouth);
        ears = findViewById(R.id.ears);
        shoes =  findViewById(R.id.shoes);


        // Restore visibility state when layout is reloaded
        if(savedInstanceState != null) {
            glasses.setVisibility(savedInstanceState.getInt("Glasses"));
            hat.setVisibility(savedInstanceState.getInt("Hat"));
            eyebrows.setVisibility(savedInstanceState.getInt("Eyebrows"));
            nose.setVisibility(savedInstanceState.getInt("Nose"));
            mustache.setVisibility(savedInstanceState.getInt("Mustache"));
            arms.setVisibility(savedInstanceState.getInt("Arms"));
            eyes.setVisibility(savedInstanceState.getInt("Eyes"));
            mouth.setVisibility(savedInstanceState.getInt("Mouth"));
            ears.setVisibility(savedInstanceState.getInt("Ears"));
            shoes.setVisibility(savedInstanceState.getInt("Shoes"));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Preserve visibility of images
        outState.putInt("Glasses", glasses.getVisibility());
        outState.putInt("Hat", hat.getVisibility());
        outState.putInt("Eyebrows", eyebrows.getVisibility());
        outState.putInt("Nose", nose.getVisibility());
        outState.putInt("Mustache", mustache.getVisibility());
        outState.putInt("Arms", arms.getVisibility());
        outState.putInt("Eyes", eyes.getVisibility());
        outState.putInt("Mouth", mouth.getVisibility());
        outState.putInt("Ears", ears.getVisibility());
        outState.putInt("Shoes", shoes.getVisibility());
    }


    // Set visibility for images based on the checked checkboxes
    public void checkClicked(View v) {

        // Get checked checkbox
        CheckBox checkbox = (CheckBox) v;

        // Get corresponding ImageView
        ImageView view = null;
        switch(checkbox.getText().toString()) {
            case "Glasses":         view = glasses;
                                    break;
            case "Hat":             view = hat;
                                    break;
            case "Eyebrows":        view = eyebrows;
                                    break;
            case "Nose":            view = nose;
                                    break;
            case "Mustache":        view = mustache;
                                    break;
            case "Arms":            view = arms;
                                    break;
            case "Eyes":            view = eyes;
                                    break;
            case "Mouth":           view = mouth;
                                    break;
            case "Ears":            view = ears;
                                    break;
            case "Shoes":           view = shoes;

        }

        // Set visibility for view
        try {
            if (checkbox.isChecked()) {
                view.setVisibility(View.VISIBLE);
            }
            else {
                view.setVisibility(View.INVISIBLE);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}