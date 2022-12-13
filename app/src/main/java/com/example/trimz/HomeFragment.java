package com.example.trimz;

import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class HomeFragment extends Fragment{

    private View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_home,container, false);
        configureImageButton1();
        configureImageButton2();
        return v;
    }

    private void configureImageButton1() {
        ImageButton recBarberButton = (ImageButton) v.findViewById(R.id.cardViewHFrag1image);

        recBarberButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Create new fragment and transaction
                BookingsScrollingFragment bookingsScrollingFragment = new BookingsScrollingFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.container, bookingsScrollingFragment);
                transaction.addToBackStack(null);

                // Commit the transaction
                transaction.commit();

            }

        });
    }

    private void configureImageButton2() {

        ImageButton ratedBarberButton = (ImageButton) v.findViewById(R.id.cardViewHFrag2image);
        ImageButton availBarberButton = (ImageButton) v.findViewById(R.id.cardViewHFrag3image);
        ImageButton newBarberButton = (ImageButton) v.findViewById(R.id.cardViewHFrag4image);



        ratedBarberButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Create new fragment and transaction
                MapsFragment mapsFragment = new MapsFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.container, mapsFragment);
                transaction.addToBackStack(null);

                // Commit the transaction
                transaction.commit();

            }

        });

        availBarberButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Create new fragment and transaction
                MapsFragment mapsFragment = new MapsFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.container, mapsFragment);
                transaction.addToBackStack(null);

                // Commit the transaction
                transaction.commit();

            }

        });

        newBarberButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Create new fragment and transaction
                MapsFragment mapsFragment = new MapsFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.container, mapsFragment);
                transaction.addToBackStack(null);

                // Commit the transaction
                transaction.commit();

            }

        });
    }

}