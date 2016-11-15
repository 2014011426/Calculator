package com.example.ziyi.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    private String equation = "";
    private char[] cuted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textview_show = (TextView) findViewById(R.id.textview_show);
        Button button_amount = (Button) findViewById(R.id.amount);
        Button button_c = (Button) findViewById(R.id.c);
        Button button_division = (Button) findViewById(R.id.division);
        Button button_multiplication = (Button) findViewById(R.id.multiplication);
        Button button_delete = (Button) findViewById(R.id.delete);
        Button button_seven = (Button) findViewById(R.id.seven);
        Button button_eight = (Button) findViewById(R.id.eight);
        Button button_nine = (Button) findViewById(R.id.nine);
        Button button_subtraction = (Button) findViewById(R.id.subtraction);
        Button button_four = (Button) findViewById(R.id.four);
        Button button_five = (Button) findViewById(R.id.five);
        Button button_six = (Button) findViewById(R.id.six);
        Button button_addition = (Button) findViewById(R.id.addition);
        Button button_one = (Button) findViewById(R.id.one);
        Button button_two = (Button) findViewById(R.id.two);
        Button button_three = (Button) findViewById(R.id.three);
        Button button_zero = (Button) findViewById(R.id.zero);
        Button button_point = (Button) findViewById(R.id.point);
        Button button_change1 = (Button) findViewById(R.id.change1);
        Button button_change2 = (Button) findViewById(R.id.change2);
        Button button_left = (Button) findViewById(R.id.left);
        Button button_right = (Button) findViewById(R.id.right);
        Button button_sin = (Button) findViewById(R.id.sin);
        Button button_cos = (Button) findViewById(R.id.cos);
        Button button_tan = (Button) findViewById(R.id.tan);
        Button button_mi = (Button) findViewById(R.id.mi);

        button_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_show.setText(textview_show.getText() + "(");
            }
        });

        button_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_show.setText(textview_show.getText() + ")");
            }
        });

        button_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_show.setText(textview_show.getText() + "s");
            }
        });

        button_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_show.setText(textview_show.getText() + "c");
            }
        });

        button_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_show.setText(textview_show.getText() + "t");
            }
        });

        button_mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_show.setText(textview_show.getText() + "^");
            }
        });

        button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_show.setText("");
            }
        });

        button_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_show.setText(textview_show.getText() + "/");
            }
        });

        button_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_show.setText(textview_show.getText() + "*");
            }
        });

        button_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char[] cc = textview_show.getText().toString().toCharArray();
                String ss = "";
                for(int i = 0;i<cc.length-1;i++){
                    ss = ss + cc[i];
                }
                textview_show.setText(ss);
            }
        });

        button_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_show.setText(textview_show.getText() + "7");
            }
        });

        button_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_show.setText(textview_show.getText() + "8");
            }
        });

        button_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_show.setText(textview_show.getText() + "9");
            }
        });

        button_subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_show.setText(textview_show.getText() + "-");
            }
        });



        button_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_show.setText(textview_show.getText() + "4");
            }
        });

        button_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_show.setText(textview_show.getText() + "5");
            }
        });

        button_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_show.setText(textview_show.getText() + "6");
            }
        });

        button_addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_show.setText(textview_show.getText() + "+");
            }
        });

        button_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_show.setText(textview_show.getText() + "1");
            }
        });

        button_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_show.setText(textview_show.getText() + "2");
            }
        });

        button_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_show.setText(textview_show.getText() + "3");
            }
        });

        button_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_show.setText(textview_show.getText() + "0");
            }
        });

        button_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_show.setText(textview_show.getText() + ".");
            }
        });

        button_change1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DecimalConversion .class);
                startActivity(intent);
            }
        });

        button_change2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,UnitConversion.class);
                startActivity(intent);
            }
        });



        button_amount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                equation = textview_show.getText().toString();
                cuted = cut(equation);
                String results = calculate(cuted);
                textview_show.setText(results);
            }
        });
    }

    public char[] cut(String equation) {
        char[] result;
        result = equation.toCharArray();
        return result;
    }

    public String calculate(char[] cuted) {
        String result = "";

        Stack<String> stack1 = new Stack<String>();
        Stack<String> stack2 = new Stack<String>();
        stack2.push("#");
        Stack<String> stack3 = new Stack<String>();
        Stack<Double> stack4 = new Stack<Double>();

        String temp = "";

        for (int i = 0; i < cuted.length; i++) {

            if (cuted[i] > 47 && cuted[i] < 58) {
                temp = temp + cuted[i];
            } else if (cuted[i] == 46) {
                temp = temp + cuted[i];
            } else if (cuted[i] == 40) {
                stack2.push(cuted[i] + "");
            } else if (cuted[i] == 41) {
                if(!temp.equals("")){
                    stack1.push(temp);
                    temp = "";
                }

                while (!stack2.peek().equals("(")) {
                    stack1.push(stack2.pop());
                }
                stack2.pop();
            } else {


                if (cuted[i] == 43) {
                    if(!temp.equals("")){
                        stack1.push(temp);
                        temp = "";
                    }

                    if (stack2.isEmpty()) {
                        stack2.push(cuted[i] + "");
                    } else {
                        while (stack2.peek().equals("*") || stack2.peek().equals("/") || stack2.peek().equals("s") ||
                                stack2.peek().equals("c") || stack2.peek().equals("t") || stack2.peek().equals("^")
                                || stack2.peek().equals("-") || stack2.peek().equals("+")) {
                            stack1.push(stack2.pop());
                        }

                        stack2.push(cuted[i] + "");
                    }
                } else if (cuted[i] == 45) {
                    if(!temp.equals("")){
                        stack1.push(temp);
                        temp = "";
                    }





                    if (stack2.isEmpty()) {
                        stack2.push(cuted[i] + "");
                    } else {
                        while (stack2.peek().equals("*") || stack2.peek().equals("/") || stack2.peek().equals("s") ||
                                stack2.peek().equals("c") || stack2.peek().equals("t") || stack2.peek().equals("^")
                                || stack2.peek().equals("-") || stack2.peek().equals("+")) {
                            stack1.push(stack2.pop());
                        }

                        stack2.push(cuted[i] + "");
                    }
                } else if (cuted[i] == 42) {
                    if(!temp.equals("")){
                        stack1.push(temp);
                        temp = "";
                    }

                    if (stack2.isEmpty()) {
                        stack2.push(cuted[i] + "");
                    } else {
                        while (stack2.peek().equals("*") || stack2.peek().equals("/") || stack2.peek().equals("s") ||
                                stack2.peek().equals("c") || stack2.peek().equals("t") || stack2.peek().equals("^")) {
                            stack1.push(stack2.pop());
                        }

                        stack2.push(cuted[i] + "");
                    }
                } else if (cuted[i] == 47) {
                    if(!temp.equals("")){
                        stack1.push(temp);
                        temp = "";
                    }

                    if (stack2.isEmpty()) {
                        stack2.push(cuted[i] + "");
                    } else {
                        while (stack2.peek().equals("*") || stack2.peek().equals("/") || stack2.peek().equals("s") ||
                                stack2.peek().equals("c") || stack2.peek().equals("t") || stack2.peek().equals("^")) {
                            stack1.push(stack2.pop());
                        }

                        stack2.push(cuted[i] + "");
                    }
                } else if (cuted[i] == 115) {
                    if (stack2.isEmpty()) {
                        stack2.push(cuted[i] + "");
                    } else {
                        while (stack2.peek().equals("s") ||
                                stack2.peek().equals("c") || stack2.peek().equals("t") || stack2.peek().equals("^")) {
                            stack1.push(stack2.pop());
                        }

                        stack2.push(cuted[i] + "");
                    }
                } else if (cuted[i] == 99) {
                    if (stack2.isEmpty()) {
                        stack2.push(cuted[i] + "");
                    } else {
                        while (stack2.peek().equals("s") ||
                                stack2.peek().equals("c") || stack2.peek().equals("t") || stack2.peek().equals("^")) {
                            stack1.push(stack2.pop());
                        }

                        stack2.push(cuted[i] + "");
                    }
                } else if (cuted[i] == 116) {
                    if (stack2.isEmpty()) {
                        stack2.push(cuted[i] + "");
                    } else {
                        while (stack2.peek().equals("s") ||
                                stack2.peek().equals("c") || stack2.peek().equals("t") || stack2.peek().equals("^")) {
                            stack1.push(stack2.pop());
                        }

                        stack2.push(cuted[i] + "");
                    }
                } else if (cuted[i] == 94) {
                    if(!temp.equals("")){
                        stack1.push(temp);
                        temp = "";
                    }

                    if (stack2.isEmpty()) {
                        stack2.push(cuted[i] + "");
                    } else {
                        while (stack2.peek().equals("s") ||
                                stack2.peek().equals("c") || stack2.peek().equals("t") || stack2.peek().equals("^")) {
                            stack1.push(stack2.pop());
                        }

                        stack2.push(cuted[i] + "");
                    }
                }
            }

        }

        if (!temp.equals("")) {

            stack1.push(temp);

        }

        while (!stack2.peek().equals("#")) {

            stack1.push(stack2.pop());
        }


        //jisuan
        while (!stack1.isEmpty()) {
            Log.v("log","stack1  "+stack1.peek());
            stack3.push(stack1.pop());
        }

        while (!stack3.isEmpty()) {

            if (isNumber(stack3.peek())) {
                stack4.push(Double.parseDouble(stack3.pop()));
            } else {

                if (stack3.peek().equals("s") || stack3.peek().equals("t") || stack3.peek().equals("c")) {
                    if (!stack4.isEmpty() && !stack3.isEmpty()) {
                        stack4.push(getCalculatedTwo(stack3.pop(), stack4.pop()));
                    } else {
                        result = "出现错误！";
                        break;
                    }
                } else {
                    //jisuan /*-+^
                    if (!stack4.isEmpty() && !stack3.isEmpty()) {
                        String tempS = stack3.pop();
                        Double tempD1 = stack4.pop();

                        if (!stack4.isEmpty()) {
                            Double tempD2 = stack4.pop();
                            stack4.push(getCalculatedThree(tempS, tempD2, tempD1));
                        } else {
                            stack3.push(tempS);
                            stack4.push(tempD1);
                            result = "出现错误！";
                            break;
                        }

                    } else {
                        result = "出现错误！1";
                        break;
                    }
                }
            }
        }

        if (result.equals("出现错误！1")) {

        } else {
            if (!stack4.isEmpty() && stack3.isEmpty()) {
                result = stack4.pop() + "";
                if (!stack4.isEmpty()) {
                    result = "出现错误！5";
                }
            } else {
                //result = "出现错误！6";
                if (!stack3.isEmpty()) {
                    //Log.v("log", stack3.peek());
                    result = stack3.pop() + stack4.pop();
                }
                if (stack4.isEmpty()) {
                    Log.v("log", "eeeeeeee");
                }
            }
        }
        return result;
    }

    public boolean isNumber(String test) {
        boolean result = false;
        char[] index = test.toCharArray();
        if (test.equals("")) {
            Log.v("log", "tag");
        }

        if (index.length != 0) {
            if (index[0] > 47 && index[0] < 58) {
                result = true;
            } else {
                result = false;
            }
        }

        return result;
    }

    public Double getCalculatedTwo(String symble, Double number) {
        Double result;
        switch (symble) {
            case "s":
                result = Math.sin(number);
                break;
            case "c":
                result = Math.cos(number);
                break;
            case "t":
                result = Math.tan(number);
                break;
            default:
                result = 0.0;
        }
        return result;
    }

    public Double getCalculatedThree(String symble, Double number1, Double number2) {
        Double result = 0.0;
        switch (symble) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 != 0) {
                    result = number1 / number2;
                } else result = 0.0;
                break;
            case "^":
                result = Math.pow(number1, number2);
                break;
        }
        return result;
    }
}
