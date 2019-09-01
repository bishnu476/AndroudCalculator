package com.basic.androidcalculator;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private EditText editEnterPercent, editEnterNumber;

    private Button buttonCalculate;

    private TextView textResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        editEnterPercent = (EditText)findViewById(R.id.editEnterPercent);
        editEnterNumber = (EditText)findViewById(R.id.editEnterNumber);
        buttonCalculate = (Button)findViewById(R.id.buttonCalculate);
        textResult = (TextView)findViewById(R.id.textResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
/*
                 textResult.setBackgroundColor(Color.YELLOW);
*/
            float percentNumericValue = Float.parseFloat(editEnterNumber.getText().toString());
                percentNumericValue = percentNumericValue/100;
                float getFinalResult = Float.parseFloat(editEnterPercent.getText().toString())*percentNumericValue ;
                textResult.setText(Float.toString(getFinalResult));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
