package com.example.abhishek.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView helloworld=(TextView)findViewById(R.id.helloworld);
        final TextView changinglable=(TextView)findViewById(R.id.changinglable);
        Button button= (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                counter++;
                if(changinglable.getVisibility()==View.VISIBLE) {
                    helloworld.setVisibility(View.VISIBLE);
                    changinglable.setVisibility(View.GONE);
                }
                else if(helloworld.getVisibility()==View.VISIBLE) {
                    helloworld.setVisibility(View.GONE);
                    changinglable.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}