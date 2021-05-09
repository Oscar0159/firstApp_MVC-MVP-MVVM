package tw.archerwn.firstApp.presenter;

import android.view.View;

import tw.archerwn.firstApp.model.Calculator;
import tw.archerwn.firstApp.view.MainView;

public class FirstAppPresenter implements Presenter {

    private MainView view;
    private Calculator model;

    public FirstAppPresenter(MainView view) {
        this.view = view;
        this.model = new Calculator();
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }

    public void onButtonClick(String str) {
        if (str.equals("+")){
            model.add();
        }
        if (str.equals("-")){
            model.min();
        }
        view.setText(String.valueOf(model.getSum()));
    }
}
