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
public class SightsFragment extends Fragment {


    public SightsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<Location> locationList = new ArrayList<Location>();

        locationList.add(new Location( getString(R.string.sight_name1), getString(R.string.sight_description1),getString(R.string.sight_address1),getString(R.string.sight_phone1),getString(R.string.sight_website1),R.drawable.parlament));
        locationList.add(new Location( getString(R.string.sight_name2), getString(R.string.sight_description2),getString(R.string.sight_address2),getString(R.string.sight_phone2),getString(R.string.sight_website2),R.drawable.ateneu));
        locationList.add(new Location( getString(R.string.sight_name3), getString(R.string.sight_description3),getString(R.string.sight_address3),getString(R.string.sight_phone3),R.drawable.triumf));
        locationList.add(new Location( getString(R.string.sight_name4), getString(R.string.sight_description4),getString(R.string.sight_address4),R.drawable.universitate));
        locationList.add(new Location( getString(R.string.sight_name5), getString(R.string.sight_description5),getString(R.string.sight_address5),R.drawable.herastrau));
        locationList.add(new Location( getString(R.string.sight_name6), getString(R.string.sight_description6),getString(R.string.sight_address6),getString(R.string.sight_phone6),R.drawable.cismigiu));
        locationList.add(new Location( getString(R.string.sight_name7), getString(R.string.sight_description7),getString(R.string.sight_address7),getString(R.string.sight_phone7),R.drawable.stavro));
        locationList.add(new Location( getString(R.string.sight_name8), getString(R.string.sight_description8),getString(R.string.sight_address8),getString(R.string.sight_phone8),R.drawable.cotroceni));
        locationList.add(new Location( getString(R.string.sight_name9), getString(R.string.sight_description9),getString(R.string.sight_address9),getString(R.string.sight_phone9),R.drawable.mogosoaia));
        locationList.add(new Location( getString(R.string.sight_name10), getString(R.string.sight_description10),getString(R.string.sight_address10),getString(R.string.sight_phone10),R.drawable.cec));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locationList);
        ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return rootview;
    }

}
