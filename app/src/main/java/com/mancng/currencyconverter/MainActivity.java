package com.mancng.currencyconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText hkdAmount;

    public void btnSubmit(View view) {

        Double hkd = Double.parseDouble(hkdAmount.getText().toString());

        Double usd = hkd / 8.25;

        Toast.makeText(getApplicationContext(), "= $" + usd.toString() + " USD", Toast.LENGTH_LONG).show();

    }

    public void selectText(final View view) {

        hkdAmount.requestFocus();
        hkdAmount.setText("");

        hkdAmount.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                try {

                    if(actionId == EditorInfo.IME_ACTION_DONE) {

                        btnSubmit(view);

                    }

                    return false;


                } catch(Exception e){

                    Toast.makeText(getApplicationContext(), "Please enter a number!", Toast.LENGTH_SHORT).show();

                    return false;
                }


            }

        });

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hkdAmount = (EditText) findViewById(R.id.txtAmount);

    }
}
