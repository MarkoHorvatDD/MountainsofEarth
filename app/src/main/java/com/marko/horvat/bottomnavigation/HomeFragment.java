package com.marko.horvat.bottomnavigation;


import android.os.Bundle;

import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.support.v4.app.Fragment;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment   {





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home, container, false);

        ImageButton btFragment = view.findViewById(R.id.btFragment);


        btFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new MontBlancFragment()).addToBackStack(null);


                fr.commit();




            }



        });
        ImageButton btFragment2 = view.findViewById(R.id.btFragment2);


        btFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new ElbrusFragment()).addToBackStack(null);


                fr.commit();




            }
        });

        ImageButton btFragment3 = view.findViewById(R.id.btFragment3);


        btFragment3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new AraratFragment()).addToBackStack(null);


                fr.commit();




            }
        });


        ImageButton btFragment4 = view.findViewById(R.id.btFragment4);


        btFragment4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new OlympusFragment()).addToBackStack(null);


                fr.commit();




            }
        });




        return view;
    }


}
