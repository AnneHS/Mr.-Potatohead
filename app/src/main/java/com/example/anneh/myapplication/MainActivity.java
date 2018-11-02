package com.example.anneh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {

    /*
    // Set reference for images
    ImageView glasses = (ImageView) findViewById(R.id.glasses);
    ImageView hat = (ImageView) findViewById(R.id.hat);
    ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
    ImageView nose = (ImageView) findViewById(R.id.nose);
    ImageView mustache = (ImageView) findViewById(R.id.mustache);
    ImageView arms = (ImageView) findViewById(R.id.arms);
    ImageView eyes = (ImageView) findViewById(R.id.eyes);
    ImageView mouth = (ImageView) findViewById(R.id.mouth);
    ImageView ears = (ImageView) findViewById(R.id.ears);
    ImageView shoes = (ImageView) findViewById(R.id.shoes);
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        // If activity
        if(savedInstanceState != null) {
            int visibility = savedInstanceState.getInt("Glasses", 0);

            glasses.setVisibility(visibility);

            // hat.setVisibility(savedInstanceState.getInt("Hat"));
            // eyebrows.setVisibility(savedInstanceState.getInt("Eyebrows"));
            // nose.setVisibility(savedInstanceState.getInt("Nose"));
            // mustache.setVisibility(savedInstanceState.getInt("Mustache"));
            // arms.setVisibility(savedInstanceState.getInt("Eyes"));
            // eyes.setVisibility(savedInstanceState.getInt("Glasses"));
            // mouth.setVisibility(savedInstanceState.getInt("Mouth"));
            // ears.setVisibility(savedInstanceState.getInt("Ears"));
            // shoes.setVisibility(savedInstanceState.getInt("Shoes"));
        }
        */
    }

    /*
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState); // always call super

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
    */


    public void checkClicked(View v) {
        // Log.d("potato", "checkClicked");

        CheckBox checkbox = (CheckBox) v;
        String checkbox_string = checkbox.getText().toString(); // --> "Hat"

        if (checkbox_string.equals("Glasses")){
            Log.d("potato", "checkClicked");

            ImageView image = (ImageView) findViewById(R.id.glasses);

            if (checkbox.isChecked()) {
                image.setVisibility(View.VISIBLE);
            }
            else {
                image.setVisibility(View.INVISIBLE);
            }
        }
        if (checkbox_string.equals("Hat")) {
            ImageView image = (ImageView) findViewById(R.id.hat);

            if (checkbox.isChecked()) {
                image.setVisibility(View.VISIBLE);
            }
            else {
                image.setVisibility(View.INVISIBLE);
            }
        }
        if (checkbox_string.equals("Eyebrows")) {

            ImageView image = (ImageView) findViewById(R.id.eyebrows);

            if (checkbox.isChecked()) {
                image.setVisibility(View.VISIBLE);
            }
            else {
                image.setVisibility(View.INVISIBLE);
            }
        }
        if (checkbox_string.equals("Nose")) {

            ImageView image = (ImageView) findViewById(R.id.nose);

            if (checkbox.isChecked()) {
                image.setVisibility(View.VISIBLE);
            }
            else {
                image.setVisibility(View.INVISIBLE);
            }
        }
        if (checkbox_string.equals("Mustache")) {

            ImageView image = (ImageView) findViewById(R.id.mustache);

            if (checkbox.isChecked()) {
                image.setVisibility(View.VISIBLE);
            }
            else {
                image.setVisibility(View.INVISIBLE);
            }
        }
        if (checkbox_string.equals("Arms")) {

            ImageView image = (ImageView) findViewById(R.id.arms);

            if (checkbox.isChecked()) {
                image.setVisibility(View.VISIBLE);
            }
            else {
                image.setVisibility(View.INVISIBLE);
            }
        }
        if (checkbox_string.equals("Eyes")) {

            ImageView image = (ImageView) findViewById(R.id.eyes);

            if (checkbox.isChecked()) {
                image.setVisibility(View.VISIBLE);
            }
            else {
                image.setVisibility(View.INVISIBLE);
            }
        }
        if (checkbox_string.equals("Mouth")) {

            ImageView image = (ImageView) findViewById(R.id.mouth);

            if (checkbox.isChecked()) {
                image.setVisibility(View.VISIBLE);
            }
            else {
                image.setVisibility(View.INVISIBLE);
            }
        }
        if (checkbox_string.equals("Ears")) {

            ImageView image = (ImageView) findViewById(R.id.ears);

            if (checkbox.isChecked()) {
                image.setVisibility(View.VISIBLE);
            }
            else {
               image.setVisibility(View.INVISIBLE);
            }
        }
        if (checkbox_string.equals("Shoes")) {

            ImageView image = (ImageView) findViewById(R.id.shoes);

            if (checkbox.isChecked()) {
                image.setVisibility(View.VISIBLE);
            }
            else {
                image.setVisibility(View.INVISIBLE);
            }
        }
    }
}