package com.marko.horvat.bottomnavigation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends Fragment {


    public DashboardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_dashboard, container, false);

        ImageButton btFragment5 = view.findViewById(R.id.btFragment5);


        btFragment5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new MountEverestFragment()).addToBackStack(null);


                fr.commit();




            }



        });
        ImageButton btFragment6 = view.findViewById(R.id.btFragment6);


        btFragment6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new K2Fragment()).addToBackStack(null);


                fr.commit();




            }
        });

        ImageButton btFragment7 = view.findViewById(R.id.btFragment7);


        btFragment7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new AlbortFragment()).addToBackStack(null);


                fr.commit();




            }
        });


        ImageButton btFragment8 = view.findViewById(R.id.btFragment8);


        btFragment8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new KinabaluFragment()).addToBackStack(null);


                fr.commit();




            }
        });




        return view;
    }


}
