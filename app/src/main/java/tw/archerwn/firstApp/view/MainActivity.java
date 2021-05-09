package tw.archerwn.firstApp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import tw.archerwn.firstApp.R;
import tw.archerwn.firstApp.presenter.FirstAppPresenter;

public class MainActivity extends AppCompatActivity implements MainView{
    
    private TextView text;
    private Button btn_add;
    private Button btn_min;

    private FirstAppPresenter presenter;

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
        presenter = new FirstAppPresenter(this);
    }

    private void setListener() {
        btn_add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                presenter.onButtonClick("+");
            }
        });


        btn_min.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                presenter.onButtonClick("-");
            }
        });
    }

    @Override
    public void setText(String str) {
        text.setText(str);
    }
}