package abdelrahman.magara.task2databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import abdelrahman.magara.task2databinding.R;
import abdelrahman.magara.task2databinding.databinding.ActivityMainBinding;
import abdelrahman.magara.task2databinding.models.Info;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main);

    }

}