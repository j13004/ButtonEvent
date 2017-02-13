package com.example.onoda.sotuken_3;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder Alert1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Alert1  = new AlertDialog.Builder(this);
        Alert1.setMessage(R.string.msg_btn);
        Alert1.setPositiveButton("OK", null);

        Button button1 = (Button)findViewById(R.id.btnShow);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Alert1.show();
            }
        });

    }
}
