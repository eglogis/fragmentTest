package com.example.proyectobase;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.Unos:

                    Uno Uno = new Uno();
                    Uno.setArguments(getIntent().getExtras());
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, Uno).commit();

                    return true;
                case R.id.Dos:

                    Dos Dos = new Dos();
                    Dos.setArguments(getIntent().getExtras());
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, Dos).commit();

                    return true;
                case R.id.Tres:

                    Tres Tres = new Tres();
                    Tres.setArguments(getIntent().getExtras());
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, Tres).commit();

                    return true;
            }
            return false;
        }
    };

    @Override
    public void OnFragmentInteraction(Uri Uri) {

    }
}
