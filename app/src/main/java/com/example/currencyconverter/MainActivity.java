package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convert(View View){
        EditText rupeeamountEdittext = (EditText) findViewById(R.id.rupeeamountEdittext);
        Double rupeeamountDouble= Double.parseDouble(rupeeamountEdittext.getText().toString());
        Double dollaramount= rupeeamountDouble/82;
        Toast.makeText(MainActivity.this," $ " + dollaramount.toString() , Toast.LENGTH_LONG).show();





    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}