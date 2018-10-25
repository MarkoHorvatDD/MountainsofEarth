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
public class MapsToubkal extends Fragment  implements OnMapReadyCallback {

    private GoogleMap mMap;

    public MapsToubkal() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_maps_toubkal, container, false);



        SupportMapFragment mapFragment = (SupportMapFragment)getChildFragmentManager().findFragmentById(R.id.map11);



        if (mapFragment == null) {
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            mapFragment = (SupportMapFragment)SupportMapFragment.newInstance();
            ft.replace(R.id.map11, mapFragment).commit();
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

        LatLng Toubkal  = new LatLng( 31.0593 ,  -7.9149);

        mMap.addMarker(new MarkerOptions().position(Toubkal).title(" Toubkal  "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Toubkal));





    }}

