package com.londonappbrewery.destini;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button topButtom;
    Button buttomButton;
    TextView storyTextView;
    int mIndex = 1; //record what the story line is.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        topButtom = findViewById(R.id.buttonTop);
        buttomButton = findViewById(R.id.buttonBottom);
        storyTextView = findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //perform when button pressed
                if (mIndex == 3) {
                    storyTextView.setText(R.string.T6_End);
                    topButtom.setVisibility(View.GONE);
                    buttomButton.setVisibility(View.GONE);
                } else if (mIndex == 2) {
                    storyTextView.setText(R.string.T3_Story);
                    topButtom.setText(R.string.T3_Ans1);
                    buttomButton.setText(R.string.T3_Ans2);
                    mIndex = 3;
                } else if (mIndex == 1) {
                    storyTextView.setText(R.string.T3_Story);
                    topButtom.setText(R.string.T3_Ans1);
                    buttomButton.setText(R.string.T3_Ans2);
                    mIndex = 3;
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        buttomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //perform when button pressed
                if (mIndex == 3) {
                    storyTextView.setText(R.string.T5_End);
                    topButtom.setVisibility(View.GONE);
                    buttomButton.setVisibility(View.GONE);
                } else if (mIndex == 2) {
                    storyTextView.setText(R.string.T4_End);
                    topButtom.setVisibility(View.GONE);
                    buttomButton.setVisibility(View.GONE);
                } else if (mIndex == 1) {

                    storyTextView.setText(R.string.T2_Story);
                    topButtom.setText(R.string.T2_Ans1);
                    buttomButton.setText(R.string.T2_Ans2);
                    mIndex = 2;
                }
            }
        });


    }
}