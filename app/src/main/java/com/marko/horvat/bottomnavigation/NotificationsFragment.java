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
public class NotificationsFragment extends Fragment {


    public NotificationsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notifications, container, false);


        ImageButton btFragment9 = view.findViewById(R.id.btFragment9);


        btFragment9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new Kilimanjaro()).addToBackStack(null);


                fr.commit();




            }



        });
        ImageButton btFragment10 = view.findViewById(R.id.btFragment10);


        btFragment10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new KenyaFragment()).addToBackStack(null);


                fr.commit();




            }
        });

        ImageButton btFragment11 = view.findViewById(R.id.btFragment11);


        btFragment11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new Toubkal()).addToBackStack(null);


                fr.commit();




            }
        });


        ImageButton btFragment12 = view.findViewById(R.id.btFragment12);


        btFragment12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new CameroonFragment()).addToBackStack(null);


                fr.commit();




            }
        });




        return view;
    }


}
