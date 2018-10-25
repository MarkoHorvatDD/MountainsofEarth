package com.marko.horvat.bottomnavigation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * A simple {@link Fragment} subclass.
 */
public class Maps_K2_Fragment extends Fragment implements OnMapReadyCallback {
    private GoogleMap mMap;


    public Maps_K2_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_maps__k2, container, false);



    SupportMapFragment mapFragment = (SupportMapFragment)getChildFragmentManager().findFragmentById(R.id.map6);



        if (mapFragment == null) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        mapFragment = (SupportMapFragment)SupportMapFragment.newInstance();
        ft.replace(R.id.map6, mapFragment).commit();
    }
        mapFragment.getMapAsync(this);




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


    @Override
    public void onMapReady(GoogleMap googleMap) {


        mMap = googleMap;

        LatLng K2  = new LatLng(   35.8799, 76.515 );

        mMap.addMarker(new MarkerOptions().position(K2).title(" K2"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(K2));





    }
}