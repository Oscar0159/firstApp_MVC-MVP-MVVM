package tw.archerwn.firstApp.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import tw.archerwn.firstApp.R;
import tw.archerwn.firstApp.databinding.ActivityMainBinding;
import tw.archerwn.firstApp.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    private MainViewModel viewModel;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new MainViewModel();
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(viewModel);

        viewModel.onCreate();
    }

    @Override
    protected void onPause() {
        super.onPause();

        viewModel.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();

        viewModel.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        viewModel.onDestroy();
    }
}