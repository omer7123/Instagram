package com.ripalay.instagram.ui.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ripalay.instagram.R;
import com.ripalay.instagram.databinding.ActivityMainBinding;
import com.ripalay.instagram.ui.Fragments.AccountFragment;
import com.ripalay.instagram.ui.Fragments.HomeFragment;
import com.ripalay.instagram.ui.Fragments.LikeFragment;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        initBottom();
    }

    private void initBottom() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();
        binding.bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        binding.toolIv.setVisibility(View.VISIBLE);
                        binding.toolTv.setTextSize(30);
                        binding.toolTv.setText("Instagram");
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();
                        break;
                    case R.id.like:

                        binding.toolIv.setVisibility(View.GONE);
                        binding.toolTv.setText("Following");
                        binding.toolTv.setTextSize(22);
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new LikeFragment()).commit();

                        break;
                    case R.id.acount:
                        binding.toolIv.setVisibility(View.GONE);
                        binding.toolTv.setText("Ripalay");
                        binding.toolTv.setTextSize(22);
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, new AccountFragment()).commit();

                        break;
                }
                return true;
            }
        });
        binding.toolIv.setOnClickListener(v -> {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            startActivity(intent);
        });
    }
}