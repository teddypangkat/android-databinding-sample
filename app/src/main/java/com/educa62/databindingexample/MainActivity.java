package com.educa62.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.educa62.databindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private User user;
    private MyClickListeners listeners;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User();
        user.name.set("Teddy");
        user.email.set("teddy.pangkat@gmail.com");

        binding.setVm(user);

        listeners = new MyClickListeners(this, user);
        binding.setMylisteners(listeners);
    }
}
