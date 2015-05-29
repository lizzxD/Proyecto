package com.example.lizz.caliz.Activity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lizz.caliz.R;

public class Alert extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        Button b = (Button) findViewById(R.id.button_tomado);
        b.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                // TODO Auto-generated method stub
                startActivity(new Intent(Alert.this, Alarma.class));
            }
        });
    }
}
