package com.example.ziyi.calculator;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;

public class UnitConversion extends AppCompatActivity {
    RadioGroup radioGroup1;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;

    Spinner spinner1;
    Spinner spinner2;
    List<String> list1 = new ArrayList<String>();
    List<String> list2 = new ArrayList<String>();
    List<String> list3 = new ArrayList<String>();

    TextView editText1;
    TextView editText2;

    int firstChoice1 = 0;
    int secondChoice1 = 0;

    int CButton1 = 0;

    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_conversion);

        radioGroup1 = (RadioGroup) findViewById(R.id.choice1);
        radioButton1 = (RadioButton) findViewById(R.id.radio1);
        radioButton2 = (RadioButton) findViewById(R.id.radio2);
        radioButton3 = (RadioButton) findViewById(R.id.radio3);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        editText1 = (TextView) findViewById(R.id.edittext1);
        editText2 = (TextView) findViewById(R.id.edittext2);

        Button button_six1 = (Button) findViewById(R.id.six1);
        Button button_seven1 = (Button) findViewById(R.id.seven1);
        Button button_eight1 = (Button) findViewById(R.id.eight1);
        Button button_nine1 = (Button) findViewById(R.id.nine1);
        Button button_two1 = (Button) findViewById(R.id.two1);
        Button button_three1 = (Button) findViewById(R.id.three1);
        Button button_four1 = (Button) findViewById(R.id.four1);
        Button button_five1 = (Button) findViewById(R.id.five1);
        Button button_one1 = (Button) findViewById(R.id.one1);
        Button button_zero1 = (Button) findViewById(R.id.zero1);
        Button button_changeTo1 = (Button) findViewById(R.id.changeTo1);
        Button button_c1 = (Button) findViewById(R.id.c1);
        Button button_delete1 = (Button) findViewById(R.id.delete1);
        Button button_point1 = (Button)findViewById(R.id.point1);

        button_point1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + ".");
            }
        });
        button_six1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "6");
            }
        });
        button_seven1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "7");
            }
        });
        button_eight1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "8");
            }
        });
        button_nine1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "9");
            }
        });
        button_two1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "2");
            }
        });
        button_three1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "3");
            }
        });
        button_four1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "4");
            }
        });
        button_five1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "5");
            }
        });
        button_one1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "1");
            }
        });
        button_zero1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "0");
            }
        });
        button_changeTo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(CButton1 == 1){
                    editText2.setText(show1(firstChoice1,secondChoice1));

                }
                else if (CButton1 == 2){
                    editText2.setText(show2(firstChoice1,secondChoice1));

                }
                else {
                    editText2.setText(show3(firstChoice1,secondChoice1));

                }
            }
        });
        button_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText("");
            }
        });
        button_delete1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char[] cc = editText1.getText().toString().toCharArray();
                String ss = "";
                for(int i = 0;i<cc.length-1;i++){
                    ss = ss + cc[i];
                }
                editText1.setText(ss);
            }
        });

        list1.add("元");
        list1.add("角");
        list1.add("分");

        list2.add("千米");
        list2.add("米");
        list2.add("厘米");
        list2.add("毫米");

        list3.add("吨");
        list3.add("千克");
        list3.add("克");


        radioGroup1.setOnCheckedChangeListener(new OnCheckedChangeListenerImp());

        adapter = new ArrayAdapter<String>(UnitConversion.this, android.R.layout.simple_spinner_item, list1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                firstChoice1 = i;
                adapterView.setVisibility(View.VISIBLE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                secondChoice1 = i;
                adapterView.setVisibility(View.VISIBLE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }



    private class OnCheckedChangeListenerImp implements RadioGroup.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {

            if (radioButton1.getId() == checkedId) {
                CButton1 = 1;
                adapter = new ArrayAdapter<String>(UnitConversion.this, android.R.layout.simple_spinner_item, list1);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner1.setAdapter(adapter);
                spinner2.setAdapter(adapter);

                spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        firstChoice1 = i;
                        adapterView.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });

                spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        secondChoice1 = i;
                        adapterView.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });
            } else if (radioButton2.getId() == checkedId) {
                CButton1 = 2;
                adapter = new ArrayAdapter<String>(UnitConversion.this, android.R.layout.simple_spinner_item, list2);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner1.setAdapter(adapter);
                spinner2.setAdapter(adapter);

                spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        firstChoice1 = i;
                        adapterView.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });

                spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        secondChoice1 = i;
                        adapterView.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });
            } else{
                CButton1 = 3;
                adapter = new ArrayAdapter<String>(UnitConversion.this, android.R.layout.simple_spinner_item, list3);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner1.setAdapter(adapter);
                spinner2.setAdapter(adapter);

                spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        firstChoice1 = i;
                        adapterView.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });

                spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        secondChoice1 = i;
                        adapterView.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                });
            }

        }
    }

    public String show1(int f,int s){
        Double d1 = Double.parseDouble(editText1.getText().toString());
        Double d2 = 0.0;
        if(f == 0){
            if(s == 0){
                d2 = 1.0;
            }
            else if(s == 1){
                d2 = 10.0;
            }
            else {
                d2 = 100.0;
            }
        }
        else if(f == 1){
            if(s == 0){
                d2 = 0.1;
            }
            else if(s == 1){
                d2 = 1.0;
            }
            else {
                d2 = 10.0;
            }
        }
        else {
            if(s == 0){
                d2 = 0.01;
            }
            else if(s == 1){
                d2 = 0.1;
            }
            else {
                d2 = 1.0;
            }
        }
        return (d1 * d2 ) + "";
    }

    public String show2(int f,int s){
        Double d1 = Double.parseDouble(editText1.getText().toString());
        Double d2 = 0.0;

        if(f == 0){
            if(s == 0){
                d2 = 1.0;
            }
            else if(s == 1){
                d2 = 1000.0;
            }
            else if(s == 2){
                d2 = 1000000.0;
            }
            else {
                d2 = 1000000000.0;
            }
        }
        else  if(f == 1){
            if(s == 0){
                d2 = 0.001;
            }
            else if(s == 1){
                d2 = 1.0;
            }
            else if(s == 2){
                d2 = 1000.0;
            }
            else {
                d2 = 1000000.0;
            }
        }
        else if(f == 2){
            if(s == 0){
                d2 = 0.000001;
            }
            else if(s == 1){
                d2 = 0.001;
            }
            else if(s == 2){
                d2 = 1.0;
            }
            else {
                d2 = 1000.0;
            }
        }
        else {
            if(s == 0){
                d2 = 0.000000001;
            }
            else if(s == 1){
                d2 = 0.000001;
            }
            else if(s == 2){
                d2 = 0.001;
            }
            else {
                d2 = 1.0;
            }
        }

        return (d1 * d2 ) + "";
    }

    public String show3(int f,int s){
        Double d1 = Double.parseDouble(editText1.getText().toString());
        Double d2 = 0.0;
        if(f == 0){
            if (s == 0){
                d2 = 1.0;
            }
            else if(s == 1){
                d2 = 1000.0;
            }
            else {
                d2 = 1000000.0;
            }
        }
        else if(f == 1){
            if (s == 0){
                d2 = 0.001;
            }
            else if(s == 1){
                d2 = 1.0;
            }
            else {
                d2 = 1000.0;
            }
        }
        else {
            if (s == 0){
                d2 = 0.000001;
            }
            else if(s == 1){
                d2 = 0.001;
            }
            else {
                d2 = 1.0;
            }
        }
        return (d1 * d2 ) + "";
    }


}
