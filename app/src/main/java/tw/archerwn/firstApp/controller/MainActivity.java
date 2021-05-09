package tw.archerwn.firstApp.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import tw.archerwn.firstApp.R;
import tw.archerwn.firstApp.model.Calculator;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private Button btn_add;
    private Button btn_min;

    private Calculator model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();

        setView();

        setListener();
    }

    private void findView() {
        text = (TextView) findViewById(R.id.text_sum);
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_min = (Button) findViewById(R.id.btn_min);
    }

    private void setView() {
        if(model == null) {
            model = new Calculator();
        }
    }

    private void setListener() {
        btn_add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                model.add();
                text.setText(String.valueOf(model.getSum()));
            }
        });


        btn_min.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                model.min();
                text.setText(String.valueOf(model.getSum()));
            }
        });
    }

}