package com.mancng.currencyconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void btnSubmit(View view) {

        EditText hkdAmount = (EditText) findViewById(R.id.txtAmount);

        Double hkd = Double.parseDouble(hkdAmount.getText().toString());

        Double usd = hkd / 8.25;

        Toast.makeText(getApplicationContext(), usd.toString(), Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
