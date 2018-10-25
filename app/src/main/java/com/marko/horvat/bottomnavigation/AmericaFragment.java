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
public class AmericaFragment extends Fragment {


    public AmericaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_america, container, false);

        ImageButton btFragment13 = view.findViewById(R.id.btFragment13);


        btFragment13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new McKinleyFragment()).addToBackStack(null);


                fr.commit();




            }



        });
        ImageButton btFragment14 = view.findViewById(R.id.btFragment14);


        btFragment14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new PicoFragment()).addToBackStack(null);


                fr.commit();




            }
        });

        ImageButton btFragment15 = view.findViewById(R.id.btFragment15);


        btFragment15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new Aconcagua()).addToBackStack(null);


                fr.commit();




            }
        });


        ImageButton btFragment16 = view.findViewById(R.id.btFragment16);


        btFragment16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new OjosFragment()).addToBackStack(null);


                fr.commit();




            }
        });




        return view;
    }


}
