package com.example.trimz;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment = new HomeFragment();
    BookingsScrollingFragment bookingsScrollingFragment = new BookingsScrollingFragment();
    SettingsFragment settingsFragment = new SettingsFragment();
    MapsFragment mapsFragment = new MapsFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( MenuItem item) {
                switch (item.getItemId()){
                    case R.id.homeFragment:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
                        return true;
                    case R.id.bookingsScrollingFragment:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,bookingsScrollingFragment).commit();
                        return true;
                    case R.id.settingsFragment:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,settingsFragment).commit();
                        return true;
                    case R.id.mapsFragment:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,mapsFragment).commit();
                        return true;

                }
                return false;
            }
        });
    }

}
