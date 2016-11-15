package com.example.ziyi.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DecimalConversion extends AppCompatActivity {
    Spinner spinner1;
    Spinner spinner2;
    List<String> list1 = new ArrayList<String>();
    List<String> list2 = new ArrayList<String>();

    TextView editText1;
    TextView editText2;

    int firstChoice1 = 0;
    int secondChoice1 = 0;

    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal_conversion);

        spinner1 = (Spinner) findViewById(R.id.spinner3);
        spinner2 = (Spinner) findViewById(R.id.spinner4);
        editText1 = (TextView) findViewById(R.id.edittext3);
        editText2 = (TextView) findViewById(R.id.edittext4);

        final Button button_six1 = (Button) findViewById(R.id.six2);
        final Button button_A = (Button) findViewById(R.id.A);
        final Button button_B = (Button) findViewById(R.id.B);
        final Button button_C = (Button) findViewById(R.id.C);
        final Button button_D = (Button) findViewById(R.id.D);
        final Button button_E = (Button) findViewById(R.id.E);
        final Button button_F = (Button) findViewById(R.id.F);
        final Button button_seven1 = (Button) findViewById(R.id.seven2);
        final Button button_eight1 = (Button) findViewById(R.id.eight2);
        final Button button_nine1 = (Button) findViewById(R.id.nine2);
        final Button button_two1 = (Button) findViewById(R.id.two2);
        final Button button_three1 = (Button) findViewById(R.id.three2);
        final Button button_four1 = (Button) findViewById(R.id.four2);
        final Button button_five1 = (Button) findViewById(R.id.five2);
        Button button_one1 = (Button) findViewById(R.id.one2);
        Button button_zero1 = (Button) findViewById(R.id.zero2);
        Button button_changeTo1 = (Button) findViewById(R.id.changeTo2);
        Button button_c1 = (Button) findViewById(R.id.c2);
        Button button_delete1 = (Button) findViewById(R.id.delete2);

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
        button_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "A");
            }
        });
        button_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "B");
            }
        });
        button_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "C");
            }
        });
        button_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "D");
            }
        });
        button_E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "E");
            }
        });
        button_F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "F");
            }
        });
        button_changeTo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(firstChoice1 == 0){
                    if (secondChoice1 == 0){
                        editText2.setText(editText1.getText());
                    }
                    else if (secondChoice1 == 1){
                        Integer integer = Integer.parseInt(editText1.getText().toString());
                        editText2.setText(Integer.toBinaryString(integer));
                    }
                    else if(secondChoice1 == 2){
                        Integer integer = Integer.parseInt(editText1.getText().toString());
                        editText2.setText(Integer.toOctalString(integer));
                    }
                    else {
                        Integer integer = Integer.parseInt(editText1.getText().toString());
                        editText2.setText(Integer.toHexString(integer));
                    }
                }
                else if (firstChoice1 == 1){
                    if(secondChoice1 == 0){
                        editText2.setText(Integer.valueOf(editText1.getText().toString(),2).toString());
                    }
                    else if (secondChoice1 == 1){
                        editText2.setText(editText1.getText());
                    }
                    else if (secondChoice1 == 2){
                        editText2.setText(Integer.toOctalString(Integer.parseInt(editText1.getText().toString(),2)));
                    }
                    else {
                        editText2.setText(Integer.toHexString(Integer.parseInt(editText1.getText().toString(),2)));
                    }
                }
                else if (firstChoice1 == 2){
                    if(secondChoice1 == 0){
                        editText2.setText(Integer.valueOf(editText1.getText().toString(),8).toString());
                    }
                    else if (secondChoice1 == 1){
                        editText2.setText(Integer.toBinaryString(Integer.valueOf(editText1.getText().toString(),8)));
                    }
                    else if (secondChoice1 == 2){
                        editText2.setText(editText1.getText());
                    }
                    else {
                        editText2.setText(Integer.toHexString(Integer.valueOf(editText1.getText().toString(),8)));
                    }
                }
                else {
                    if(secondChoice1 == 0){
                        editText2.setText(Integer.valueOf(editText1.getText().toString(),16).toString());
                    }
                    else if (secondChoice1 == 1){
                        editText2.setText(Integer.toBinaryString(Integer.valueOf(editText1.getText().toString(),16)));
                    }
                    else if (secondChoice1 == 2){
                        editText2.setText(Integer.toOctalString(Integer.valueOf(editText1.getText().toString(),16)));
                    }
                    else {
                        editText2.setText(editText1.getText());
                    }
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

        list1.add("十进制");
        list1.add("二进制");
        list1.add("八进制");
        list1.add("十六进制");

        list2.add("十进制");
        list2.add("二进制");
        list2.add("八进制");
        list2.add("十六进制");


        adapter = new ArrayAdapter<String>(DecimalConversion.this, android.R.layout.simple_spinner_item, list1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);


        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                firstChoice1 = i;
                if(i == 0){
                    button_A.setEnabled(false);
                    button_B.setEnabled(false);
                    button_C.setEnabled(false);
                    button_D.setEnabled(false);
                    button_E.setEnabled(false);
                    button_F.setEnabled(false);
                    button_two1.setEnabled(true);
                    button_three1.setEnabled(true);
                    button_four1.setEnabled(true);
                    button_five1.setEnabled(true);
                    button_six1.setEnabled(true);
                    button_seven1.setEnabled(true);
                    button_eight1.setEnabled(true);
                    button_nine1.setEnabled(true);
                }
                else if (i == 1){
                    button_A.setEnabled(false);
                    button_B.setEnabled(false);
                    button_C.setEnabled(false);
                    button_D.setEnabled(false);
                    button_E.setEnabled(false);
                    button_F.setEnabled(false);
                    button_two1.setEnabled(false);
                    button_three1.setEnabled(false);
                    button_four1.setEnabled(false);
                    button_five1.setEnabled(false);
                    button_six1.setEnabled(false);
                    button_seven1.setEnabled(false);
                    button_eight1.setEnabled(false);
                    button_nine1.setEnabled(false);
                }
                else if (i == 2){
                    button_A.setEnabled(false);
                    button_B.setEnabled(false);
                    button_C.setEnabled(false);
                    button_D.setEnabled(false);
                    button_E.setEnabled(false);
                    button_F.setEnabled(false);
                    button_two1.setEnabled(true);
                    button_three1.setEnabled(true);
                    button_four1.setEnabled(true);
                    button_five1.setEnabled(true);
                    button_six1.setEnabled(true);
                    button_seven1.setEnabled(true);
                    button_eight1.setEnabled(false);
                    button_nine1.setEnabled(false);
                }
                else {
                    button_A.setEnabled(true);
                    button_B.setEnabled(true);
                    button_C.setEnabled(true);
                    button_D.setEnabled(true);
                    button_E.setEnabled(true);
                    button_F.setEnabled(true);
                    button_two1.setEnabled(true);
                    button_three1.setEnabled(true);
                    button_four1.setEnabled(true);
                    button_five1.setEnabled(true);
                    button_six1.setEnabled(true);
                    button_seven1.setEnabled(true);
                    button_eight1.setEnabled(true);
                    button_nine1.setEnabled(true);
                }
                adapterView.setVisibility(View.VISIBLE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        adapter = new ArrayAdapter<String>(DecimalConversion.this, android.R.layout.simple_spinner_item, list2);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);

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
