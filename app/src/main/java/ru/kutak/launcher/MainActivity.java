package ru.kutak.launcher;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        TextView text = new TextView(this);


        text.setText("Kutak Project v1.0");


        text.setTextSize(24);


        setContentView(text);

    }

}
