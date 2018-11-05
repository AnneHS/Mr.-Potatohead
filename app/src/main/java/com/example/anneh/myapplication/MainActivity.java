package com.example.anneh.myapplication;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {

    // Set reference for images
    ImageView glasses, hat, eyebrows, nose, mustache, arms, eyes, mouth, ears, shoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set reference for images
        glasses = (ImageView) findViewById(R.id.glasses);
        hat = (ImageView) findViewById(R.id.hat);
        eyebrows = (ImageView) findViewById(R.id.eyebrows);
        nose = (ImageView) findViewById(R.id.nose);
        mustache = (ImageView) findViewById(R.id.mustache);
        arms = (ImageView) findViewById(R.id.arms);
        eyes = (ImageView) findViewById(R.id.eyes);
        mouth = (ImageView) findViewById(R.id.mouth);
        ears = (ImageView) findViewById(R.id.ears);
        shoes = (ImageView) findViewById(R.id.shoes);

        System.out.println("Hier ben ik");

        // If activity
        if(savedInstanceState != null) {

            // Restore visibility state
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


    // Set visibility for images based on the checked checkboxes
    public void checkClicked(View v) {
        CheckBox checkbox = (CheckBox) v;
        String checkbox_string = checkbox.getText().toString(); // --> "Hat"

        if (checkbox_string.equals("Glasses")){

            if (checkbox.isChecked()) {
                glasses.setVisibility(View.VISIBLE);
            }
            else {
                glasses.setVisibility(View.INVISIBLE);
            }
        }
        if (checkbox_string.equals("Hat")) {

            if (checkbox.isChecked()) {
                hat.setVisibility(View.VISIBLE);
            }
            else {
                hat.setVisibility(View.INVISIBLE);
            }
        }
        if (checkbox_string.equals("Eyebrows")) {

            if (checkbox.isChecked()) {
                eyebrows.setVisibility(View.VISIBLE);
            }
            else {
                eyebrows.setVisibility(View.INVISIBLE);
            }
        }
        if (checkbox_string.equals("Nose")) {
            if (checkbox.isChecked()) {
                nose.setVisibility(View.VISIBLE);
            }
            else {
                nose.setVisibility(View.INVISIBLE);
            }
        }
        if (checkbox_string.equals("Mustache")) {

            if (checkbox.isChecked()) {
                mustache.setVisibility(View.VISIBLE);
            }
            else {
                mustache.setVisibility(View.INVISIBLE);
            }
        }
        if (checkbox_string.equals("Arms")) {

            if (checkbox.isChecked()) {
                arms.setVisibility(View.VISIBLE);
            }
            else {
                arms.setVisibility(View.INVISIBLE);
            }
        }
        if (checkbox_string.equals("Eyes")) {

            if (checkbox.isChecked()) {
                eyes.setVisibility(View.VISIBLE);
            }
            else {
                eyes.setVisibility(View.INVISIBLE);
            }
        }
        if (checkbox_string.equals("Mouth")) {


            if (checkbox.isChecked()) {
                mouth.setVisibility(View.VISIBLE);
            }
            else {
                mouth.setVisibility(View.INVISIBLE);
            }
        }
        if (checkbox_string.equals("Ears")) {

            if (checkbox.isChecked()) {
                ears.setVisibility(View.VISIBLE);
            }
            else {
                ears.setVisibility(View.INVISIBLE);
            }
        }
        if (checkbox_string.equals("Shoes")) {

            if (checkbox.isChecked()) {
                shoes.setVisibility(View.VISIBLE);
            }
            else {
                shoes.setVisibility(View.INVISIBLE);
            }
        }
    }
}