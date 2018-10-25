package com.marko.horvat.bottomnavigation;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class MontBlancFragment extends HomeFragment  {


    public MontBlancFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_new, container, false);


        Button button = view.findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new MapsFragment()).addToBackStack(null);


                fr.commit();




            }



        });


                Toolbar toolbar = view.findViewById(R.id.profileToolbar);
        toolbar.setNavigationIcon(R.drawable.baseline_arrow_back_white_18);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });


                return view;



    }




}