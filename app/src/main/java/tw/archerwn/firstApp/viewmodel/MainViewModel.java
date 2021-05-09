package tw.archerwn.firstApp.viewmodel;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import tw.archerwn.firstApp.BR;
import tw.archerwn.firstApp.model.Calculator;

public class MainViewModel extends BaseObservable implements ViewModel{

    private Calculator model;

    private String sum;

    @Override
    public void onCreate() {
        model = new Calculator();
        sum = String.valueOf(model.getSum());
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

    @Bindable
    public String getSum() {return this.sum;}

    public void onButtonClick(int i) {
        if (i > 0){
            model.add();
        }
        if (i < 0){
            model.min();
        }
        this.sum = String.valueOf(model.getSum());
        notifyChange();
    }

}
