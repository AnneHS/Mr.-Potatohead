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
        // Log.d("potato", "checkClicked");

        CheckBox checkbox = (CheckBox) v;
        String checkbox_string = checkbox.getText().toString(); // --> "Hat"

        // Map alt
        // image_dict = {} ??

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
        if (checkbox_string.equals("Shoes")) { // --> Shoes

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
