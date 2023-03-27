package com.example.chestnut5;


import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputType;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class RecyclerViewTest extends AppCompatActivity{

    RelativeLayout RLSwitchPage, RLSwitch1, RLSwitch2, RLSwitch3, RLSwitch4, RLSwitch5, RLSwitch6, RLSwitch7;
    ProgressBar progressBar2;
    TextView State1, State2, State3, State4, State5, State6, State7,
            Switch1, Switch2, Switch3, Switch4, Switch5, Switch6, Switch7;
    ImageView img_1, img_2, img_3, img_4, img_5, img_6, img_7;

    Switch theSwitch, theSwitch2;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_test);

        getSupportActionBar().hide();

//
//        //UI Initialization
//        RLSwitchPage = findViewById(R.id.RLSwitchPage);
//
//
//
//
//        //Relative Layout Initialization
//        RLSwitch1 = findViewById(R.id.RLSwitch1);
//        RLSwitch2 = findViewById(R.id.RLSwitch2);
//        RLSwitch3 = findViewById(R.id.RLSwitch3);
//        RLSwitch4 = findViewById(R.id.RLSwitch4);
//        RLSwitch5 = findViewById(R.id.RLSwitch5);
//        RLSwitch6 = findViewById(R.id.RLSwitch6);
//        RLSwitch7 = findViewById(R.id.RLSwitch7);
//
//        //Image View Initialization
//        img_1 = findViewById(R.id.img_1);
//        img_2 = findViewById(R.id.img_2);
//        img_3 = findViewById(R.id.img_3);
//        img_4 = findViewById(R.id.img_4);
//        img_5 = findViewById(R.id.img_5);
//        img_6 = findViewById(R.id.img_6);
//        img_7 = findViewById(R.id.img_7);
//
//        //State Initialization
//        State1 = findViewById(R.id.state1);
//        State2 = findViewById(R.id.state2);
//        State3 = findViewById(R.id.state3);
//        State4 = findViewById(R.id.state4);
//        State5 = findViewById(R.id.state5);
//        State6 = findViewById(R.id.state6);
//        State7 = findViewById(R.id.state7);
//
//        //Switch Initialization
//        Switch1 = findViewById(R.id.switch1);
//        Switch2 = findViewById(R.id.switch2);
//        Switch3 = findViewById(R.id.switch3);
//        Switch4 = findViewById(R.id.switch4);
//        Switch5 = findViewById(R.id.switch5);
//        Switch6 = findViewById(R.id.switch6);
//        Switch7 = findViewById(R.id.switch7);
//
//
//        progressBar2.setVisibility(View.GONE);
//        RLSwitchPage.setVisibility(View.INVISIBLE);
//        theSwitch.setChecked(false);
//        theSwitch2.setChecked(false);
//
//        theSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(isChecked){
//                    State1.setText("Switch is On");
//                    Switch1.setTextColor(getResources().getColor(R.color.black));
//                    img_1.setBackground(getDrawable(R.drawable.switch_drawable_on));
//                    RLSwitch1.setBackground(getDrawable(R.drawable.switch_gradient_on));
//                    State1.setTextColor(getResources().getColor(R.color.black));
//                }
//                else {
//                    img_1.setBackgroundColor(getResources().getColor(R.color.colorOff));
//                    State1.setTextColor(getResources().getColor(R.color.grey));
//                    Switch1.setTextColor(getResources().getColor(R.color.grey));
//                    RLSwitch1.setBackground(getDrawable(R.drawable.switch_gradient));
//                    State1.setText("Switch is Off");
//                }
//            }
//        });
//
//        theSwitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(isChecked){
//                    State2.setText("Switch is On");
//                    Switch2.setTextColor(getResources().getColor(R.color.black));
//                    img_2.setBackground(getDrawable(R.drawable.switch_drawable_on));
//                    RLSwitch2.setBackground(getDrawable(R.drawable.switch_gradient_on));
//                    State2.setTextColor(getResources().getColor(R.color.black));
//                }
//                else {
//                    img_2.setBackgroundColor(getResources().getColor(R.color.colorOff));
//                    State2.setTextColor(getResources().getColor(R.color.grey));
//                    Switch2.setTextColor(getResources().getColor(R.color.grey));
//                    RLSwitch2.setBackground(getDrawable(R.drawable.switch_gradient));
//                    State2.setText("Switch is Off");
//                }
//            }
//        });
//
//        //AlertDialog Settings
//        AlertDialog.Builder alert = new AlertDialog.Builder(this);
//        final EditText input = new EditText(this);
//        alert.setTitle("Enter Number of Devices");
//
//
//        //Input Settings
//        input.setInputType(InputType.TYPE_CLASS_NUMBER);
//        input.setHint("Enter a value between 1 and 5");
//        input.setHeight(100);
//        input.setPadding(40, 0, 2, 0);
//        input.setEllipsize(TextUtils.TruncateAt.END);
//        input.setFilters(new InputFilter[]{new InputFilterMinMax("1", "5")}
//        );
//
//        String editTextValue = input.getText().toString();
//
//
//        alert.setView(input);
//
//
//        //Dialog Box Design
//        alert.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//
//                RLSwitchPage.setVisibility(View.VISIBLE);
//            }
//        });
//        alert.setPositiveButton("Exit App", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//
//                System.exit(0);
//            }
//        });
//        alert.show();
//        //Dialog Box Design
//
//
//
//
//
////        if(editTextValue == 5){
////            RLSwitch1.setEnabled(true);
////            RLSwitch2.setEnabled(true);
////            RLSwitch3.setEnabled(true);
////            RLSwitch4.setEnabled(true);
////            RLSwitch5.setEnabled(true);
////        }
////
////        else if(editTextValue ==4){
////            RLSwitch1.setEnabled(true);
////            RLSwitch2.setEnabled(true);
////            RLSwitch3.setEnabled(true);
////            RLSwitch4.setEnabled(true);
////            RLSwitch5.setEnabled(false);
////        }
////
////        else if(editTextValue ==3){
////            RLSwitch1.setEnabled(true);
////            RLSwitch2.setEnabled(true);
////            RLSwitch3.setEnabled(true);
////            RLSwitch4.setEnabled(false);
////            RLSwitch5.setEnabled(false);
////        }
////
////        else if(editTextValue ==2){
////            RLSwitch1.setEnabled(true);
////            RLSwitch2.setEnabled(true);
////            RLSwitch3.setEnabled(false);
////            RLSwitch4.setEnabled(false);
////            RLSwitch5.setEnabled(false);
////        }
////
////        else{
////            RLSwitch1.setEnabled(true);
////            RLSwitch2.setEnabled(false);
////            RLSwitch3.setEnabled(false);
////            RLSwitch4.setEnabled(false);
////            RLSwitch5.setEnabled(false);
////        }
////
//
//    }
    }
}