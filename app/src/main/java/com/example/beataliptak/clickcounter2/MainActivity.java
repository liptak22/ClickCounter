package com.example.beataliptak.clickcounter2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button osszead, kivon, reset;
    private TextView szam;
    int clickcount=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        osszead = (Button) findViewById(R.id.button4);
        kivon = (Button) findViewById(R.id.button5);
        reset = (Button) findViewById(R.id.button6);
        szam = (TextView) findViewById(R.id.textView);


        osszead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickcount += 1;
                int sajatSzam = 0;

                try {
                    sajatSzam = Integer.parseInt(szam.getText().toString());
                    sajatSzam += 1;
                    szam.setText(""+sajatSzam);

                } catch(NumberFormatException nfe) {
                    System.out.println("Sikertelen parseolás" + nfe);
                }
                if (clickcount == 20) {
                    Context context = getApplicationContext();
                    CharSequence text = "Unatkozol!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else {}

            }
        });

        kivon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickcount += 1;
                int sajatSzam2 = 0;

                try {
                    sajatSzam2 = Integer.parseInt(szam.getText().toString());
                    sajatSzam2 -= 1;
                    szam.setText(""+sajatSzam2);

                } catch(NumberFormatException nfe) {
                    System.out.println("Sikertelen parseolás" + nfe);
                }
                if (clickcount == 20) {
                    Context context = getApplicationContext();
                    CharSequence text = "Unatkozol!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

            }
                else {}
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                szam.setText("0");
            }
        });
    }
}
