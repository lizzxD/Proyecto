package com.example.lizz.caliz;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class alert extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        Button b = (Button) findViewById(R.id.button_tomado);
        b.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                // TODO Auto-generated method stub
                startActivity(new Intent(alert.this, alarma.class));
            }
        });
    }
}
