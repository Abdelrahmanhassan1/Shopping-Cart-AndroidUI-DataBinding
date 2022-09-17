package abdelrahman.magara.task2databinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import abdelrahman.magara.task2databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}