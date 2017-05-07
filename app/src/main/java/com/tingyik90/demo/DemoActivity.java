package com.tingyik90.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.tingyik90.prefmanager.PrefManager;

public class DemoActivity extends AppCompatActivity {

    // view parameters
    EditText input;
    TextView output;
    Button write;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        // view initialisation
        input = (EditText) findViewById(R.id.input);
        output = (TextView) findViewById(R.id.output);
        write = (Button) findViewById(R.id.write);
    }

    public void writeClick(View view) {
        // set debugTag and show log
        PrefManager.setDebugTag("TAG");
        PrefManager.showLog(true);      // default = false
        PrefManager prefManager = new PrefManager(this);

        // save string from EditText to pref
        String inputString = input.getText().toString();
        prefManager.putString("PREFERENCE", inputString);

        // display string from pref to TextView
        String outputString = prefManager.getString("PREFERENCE", "default");
        output.setText(outputString);
    }
}
