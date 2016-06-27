package com.example.mse.salavat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    TextView salavat;
    int a=0;
    Button res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= (Button) findViewById(R.id.btn1);
        salavat= (TextView) findViewById(R.id.text1);
        
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        a=a+1;
        salavat.setText("" + a);


    }
}
