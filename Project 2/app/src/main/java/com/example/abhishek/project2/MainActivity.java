package com.example.abhishek.project2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    int clickcount=0; // ButtonClick
    TextView myText;
    TextView cbtext;
    TextView switchtext;
    TextView rgtext;
    TextView SBtextView;
    SeekBar seekbar;
    EditText editTextName;
    TextView textView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button= (Button) findViewById(R.id.button);
        myText=(TextView)findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                clickcount=clickcount+1;
                if(clickcount==1)
                {
                    //first time clicked
                    myText.setVisibility(View.VISIBLE);
                    myText.setText("Button1 Clicked");
                }
                else
                {
                    //Button click counter
                    myText.setVisibility(View.VISIBLE);
                    myText.setText("Button1 Click counter:"+clickcount);
                }
            }
        });

        final CheckBox checkbox=(CheckBox)findViewById(R.id.checkBox);
        cbtext=(TextView)findViewById(R.id.CBtextValue);

        checkbox.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (checkbox.isChecked())
                {
                    //Perform action when you touch on checkbox and it change to selected state
                    cbtext.setText("Checked");
                }
                else
                {
                    //Perform action when you touch on checkbox and it change to unselected state
                    cbtext.setText("Un-Checked");
                }
            }
        });


        Switch toggle = (Switch) findViewById(R.id.switch3);
        switchtext=(TextView)findViewById(R.id.SwitchtextValue);

        toggle.setOnCheckedChangeListener(new  CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    switchtext.setText("ON");
                } else {
                    switchtext.setText("OFF");
                }
            }
        });


        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
        rgtext=(TextView)findViewById(R.id.RGtextView);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioButton:
                        rgtext.setVisibility(View.VISIBLE);
                        rgtext.setText("Radio1 is selected");
                        break;

                    case R.id.radioButton2:
                        rgtext.setVisibility(View.VISIBLE);
                        rgtext.setText("Radio2 is selected");
                        break;

                    case R.id.radioButton3:
                        rgtext.setVisibility(View.VISIBLE);
                        rgtext.setText("Radio3 is selected");
                        break;
                }
            }
        });

        SBtextView = (TextView)findViewById(R.id.SBtextView);
        seekbar = (SeekBar)findViewById(R.id.seekBar);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                String seekbarValue = String.valueOf(i);

                SBtextView.setText("Seekbar Current Value: "+seekbarValue+"%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        Button lablebutton = (Button)findViewById(R.id.lablebutton);
        textView4=(TextView)findViewById(R.id.textView4);
        editTextName=(EditText) findViewById(R.id.editTextName);
        textView4.setVisibility(View.GONE);

        lablebutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) { {
                //first time clicked
                textView4.setVisibility(View.VISIBLE);
                editTextName.getText().toString();
                String value = editTextName.getText().toString();
                textView4.setText(value);
                }
            }
        });
    }
}