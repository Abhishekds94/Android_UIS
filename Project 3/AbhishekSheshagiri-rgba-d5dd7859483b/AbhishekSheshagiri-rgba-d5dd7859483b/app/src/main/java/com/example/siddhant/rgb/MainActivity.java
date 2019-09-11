package com.example.siddhant.rgb;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    SeekBar SeekA;
    SeekBar SeekR;
    SeekBar SeekG;
    SeekBar SeekB;
    TextView AView,RView,GView,BView;
    //Reference the TextView
    TextView ShowColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Get a reference to the seekbars
        SeekA=(SeekBar)findViewById(R.id.seekA);
        SeekR=(SeekBar)findViewById(R.id.seekR);
        SeekG=(SeekBar)findViewById(R.id.seekG);
        SeekB=(SeekBar)findViewById(R.id.seekB);
        AView = findViewById(R.id.ATView);
        RView = findViewById(R.id.RTView);
        GView = findViewById(R.id.GTView);
        BView = findViewById(R.id.BTView);


        //Reference the TextView
        ShowColor=(TextView)findViewById(R.id.textView);
        //This activity implements SeekBar OnSeekBarChangeListener
        SeekA.setOnSeekBarChangeListener(this);
        SeekR.setOnSeekBarChangeListener(this);
        SeekG.setOnSeekBarChangeListener(this);
        SeekB.setOnSeekBarChangeListener(this);
    }
    //Satisfy the implements
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromTouch) {
        //get current ARGB values
        int A=SeekA.getProgress();
        int R=SeekR.getProgress();
        int G=SeekG.getProgress();
        int B=SeekB.getProgress();


        //Reference the value changing
        int id=seekBar.getId();
        //Get the chnaged value
        if(id == com.example.siddhant.rgb.R.id.seekA){
            A=progress;
        }
        else if(id == com.example.siddhant.rgb.R.id.seekR){
            R=progress;
        }
        else if(id == com.example.siddhant.rgb.R.id.seekG){
            G=progress;
        }
        else if(id == com.example.siddhant.rgb.R.id.seekB){
            B=progress;
        }
        //Build and show the new color
        ShowColor.setBackgroundColor(Color.argb(A,R,G,B));
        //show the color value
        AView.setText(String.valueOf(A));
        RView.setText(String.valueOf(R));
        GView.setText(String.valueOf(G));
        BView.setText(String.valueOf(B));
    }
    public void onStartTrackingTouch(SeekBar seekBar) {
        //Only required due to implements
    }
    public void onStopTrackingTouch(SeekBar seekBar) {
        //Only required due to implements
    }

    /**
     * Called when pointer capture is enabled or disabled for the current window.
     *
     * @param hasCapture True if the window has pointer capture.
     */
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
