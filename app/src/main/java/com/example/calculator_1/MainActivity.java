//package com.example.calculator_1;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.TextView;
//
//import com.google.android.material.button.MaterialButton;
//import org.mozilla.javascript.Context;
//import org.mozilla.javascript.Scriptable;
//
//public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//
//    TextView resultTV, solutionTV;
//    MaterialButton ButtonC, ButtonBracOpen, ButtonBracClose;
//    MaterialButton ButtonDiv, ButtonMul, ButtonSub, ButtonAdd, ButtonEq;
//    MaterialButton Button0, Button1, Button2, Button3, Button4, Button5, Button6, Button7, Button8, Button9;
//    MaterialButton ButtonAC, ButtonDot;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        resultTV = findViewById(R.id.result_tv);
//        solutionTV = findViewById(R.id.solution_tv);
//
//        assignId(ButtonC, R.id.button_c);
//        assignId(ButtonBracOpen, R.id.button_open_bracket);
//        assignId(ButtonBracClose, R.id.button_close_bracket);
//        assignId(ButtonDiv, R.id.button_divide);
//        assignId(ButtonMul, R.id.button_multiply);
//        assignId(ButtonSub, R.id.button_minus);
//        assignId(ButtonAdd, R.id.button_plus);
//        assignId(ButtonEq, R.id.button_equals);
//        assignId(Button0, R.id.button_zero);
//        assignId(Button1, R.id.button_one);
//        assignId(Button2, R.id.button_two);
//        assignId(Button3, R.id.button_three);
//        assignId(Button4, R.id.button_four);
//        assignId(Button5, R.id.button_five);
//        assignId(Button6, R.id.button_six);
//        assignId(Button7, R.id.button_seven);
//        assignId(Button8, R.id.button_eight);
//        assignId(Button9, R.id.button_nine);
//        assignId(ButtonAC, R.id.button_AC);
//        assignId(ButtonDot, R.id.button_dot);
//    }
//
//
//    void assignId(MaterialButton btn, int id){
//        btn = findViewById(id);
//        btn.setOnClickListener(this);
//    }
//
//
//    @Override
//    public void onClick(View view) {
//        MaterialButton button =(MaterialButton) view;
//        String buttonText = button.getText().toString();
//        String dataToCalculate = solutionTV.getText().toString();
//
//        if(buttonText.equals("AC")){
//            solutionTV.setText((""));
//            resultTV.setText("0");
//            return;
//        }
//
//        if(buttonText.equals(("="))){
//            solutionTV.setText(resultTV.getText());
//            return;
//        }
//
//        if(buttonText.equals("C")){
//            dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length()-1);
//        }
//
//        else{
//            dataToCalculate = dataToCalculate+buttonText;
//
//        }
//
//        solutionTV.setText(dataToCalculate);
//
//        String final_Result = getResult(dataToCalculate);
//
//        if(!final_Result.equals("Err")){
//            resultTV.setText(final_Result);
//        }
//
//    }
//
//    String getResult(String data){
//        try{
//            Context context = Context.enter();
//            context.setOptimizationLevel(-1);
//            Scriptable scriptable = context.initStandardObjects();
//            String final_Result = context.evaluateString(scriptable, data, "Javascript", 1, null).toString();
//            if(final_Result.endsWith(".0")){
//                final_Result = final_Result.replace(".0", "");
//            }
//            return final_Result;
//        }catch (Exception e){
//            return "Err";
//        }
//    }
//}
//
//




package com.example.calculator_1;

import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

        import com.google.android.material.button.MaterialButton;
        import org.mozilla.javascript.Context;
        import org.mozilla.javascript.Scriptable;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView resultTv,solutionTv;
    MaterialButton buttonC,buttonBrackOpen,buttonBrackClose;
    MaterialButton buttonDivide,buttonMultiply,buttonPlus,buttonMinus,buttonEquals;
    MaterialButton button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    MaterialButton buttonAC,buttonDot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTv = findViewById(R.id.result_tv);
        solutionTv = findViewById(R.id.solution_tv);

        assignId(buttonC,R.id.button_c);
        assignId(buttonBrackOpen,R.id.button_open_bracket);
        assignId(buttonBrackClose,R.id.button_close_bracket);
        assignId(buttonDivide,R.id.button_divide);
        assignId(buttonMultiply,R.id.button_multiply);
        assignId(buttonPlus,R.id.button_plus);
        assignId(buttonMinus,R.id.button_minus);
        assignId(buttonEquals,R.id.button_equals);
        assignId(button0,R.id.button_0);
        assignId(button1,R.id.button_1);
        assignId(button2,R.id.button_2);
        assignId(button3,R.id.button_3);
        assignId(button4,R.id.button_4);
        assignId(button5,R.id.button_5);
        assignId(button6,R.id.button_6);
        assignId(button7,R.id.button_7);
        assignId(button8,R.id.button_8);
        assignId(button9,R.id.button_9);
        assignId(buttonAC,R.id.button_ac);
        assignId(buttonDot,R.id.button_dot);





    }

    void assignId(MaterialButton btn,int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        MaterialButton button =(MaterialButton) view;
        String buttonText = button.getText().toString();
        String dataToCalculate = solutionTv.getText().toString();

        if(buttonText.equals("AC")){
            solutionTv.setText("");
            resultTv.setText("0");
            return;
        }
        if(buttonText.equals("=")){
            solutionTv.setText(resultTv.getText());
            return;
        }
        if(buttonText.equals("C")){
            dataToCalculate = dataToCalculate.substring(0,dataToCalculate.length()-1);
        }else{
            dataToCalculate = dataToCalculate+buttonText;
        }
        solutionTv.setText(dataToCalculate);

        String finalResult = getResult(dataToCalculate);

        if(!finalResult.equals("Err")){
            resultTv.setText(finalResult);
        }

    }

    String getResult(String data){
        try{
            Context context  = Context.enter();
            context.setOptimizationLevel(-1);
            Scriptable scriptable = context.initStandardObjects();
            String finalResult =  context.evaluateString(scriptable,data,"Javascript",1,null).toString();
            if(finalResult.endsWith(".0")){
                finalResult = finalResult.replace(".0","");
            }
            return finalResult;
        }catch (Exception e){
            return "Err";
        }
    }

}