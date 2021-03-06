package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view){

        display(1);
        displayPrice(1 * 10);
    }

    private void displayPrice(int number){
        TextView priceTextView = findViewById(R.id.priceTextView);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

private void display(int number){
    TextView quantityTextView = findViewById(R.id.quantityTextView);
    quantityTextView.setText("" + number);
    }
}