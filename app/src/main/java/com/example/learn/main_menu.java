package com.example.learn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class main_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        final CheckBox cb1 = findViewById(R.id.cb1);
        final CheckBox cb2 = findViewById(R.id.cb2);
        Button btnH = findViewById(R.id.btnH);
        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb1.isChecked()) {
                    Intent intent = new Intent(getApplicationContext(), pvp.class);
                    startActivity(intent);
                }
                else if (cb2.isChecked()) {
                    Intent intent = new Intent(getApplicationContext(), pvc.class);
                    startActivity(intent);
                }
                else if (!(cb1.isChecked()) && !(cb2.isChecked())) {
                    Toast.makeText(getApplicationContext(),"Please choose a gamemode",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void cb1Click(View view) {
        CheckBox cb2 = findViewById(R.id.cb2);
        cb2.setChecked(false);
    }

    public void cb2Click(View view) {
        CheckBox cb1 = findViewById(R.id.cb1);
        cb1.setChecked(false);
            }
}
