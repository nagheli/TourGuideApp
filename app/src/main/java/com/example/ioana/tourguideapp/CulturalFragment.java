package com.example.ioana.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CulturalFragment extends Fragment {


    public CulturalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<Location> locationList = new ArrayList<Location>();

        locationList.add(new Location( getString(R.string.cultural_name1), getString(R.string.cultural_description1),getString(R.string.cultural_address1),getString(R.string.cultural_phone1),R.drawable.satului));
        locationList.add(new Location( getString(R.string.cultural_name2), getString(R.string.cultural_description2),getString(R.string.cultural_address2),getString(R.string.cultural_phone2),R.drawable.arta));
        locationList.add(new Location( getString(R.string.cultural_name3), getString(R.string.cultural_description3),getString(R.string.cultural_address3),getString(R.string.cultural_phone3),R.drawable.istorie));
        locationList.add(new Location( getString(R.string.cultural_name4), getString(R.string.cultural_description4),getString(R.string.cultural_address4),getString(R.string.cultural_phone4),R.drawable.antipa));
        locationList.add(new Location( getString(R.string.cultural_name5), getString(R.string.cultural_description5),getString(R.string.cultural_address5),getString(R.string.cultural_phone5),R.drawable.botanica));
        locationList.add(new Location( getString(R.string.cultural_name6), getString(R.string.cultural_description6),getString(R.string.cultural_address6),getString(R.string.cultural_phone6),R.drawable.militar));
        locationList.add(new Location( getString(R.string.cultural_name7), getString(R.string.cultural_description7),getString(R.string.cultural_address7),getString(R.string.cultural_phone7),R.drawable.enescu));


        LocationAdapter adapter = new LocationAdapter(getActivity(), locationList);
        ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return rootview;
    }

}
