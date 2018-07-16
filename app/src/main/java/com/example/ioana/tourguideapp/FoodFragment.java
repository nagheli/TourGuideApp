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
public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<Location> locationList = new ArrayList<Location>();

        locationList.add(new Location(getString(R.string.food_name1), getString(R.string.food_description1), getString(R.string.food_address1), getString(R.string.food_phone1), getString(R.string.food_website1), R.drawable.kane));
        locationList.add(new Location(getString(R.string.food_name2), getString(R.string.food_description2), getString(R.string.food_address2), getString(R.string.food_phone2), getString(R.string.food_website2), R.drawable.sara));
        locationList.add(new Location(getString(R.string.food_name3), getString(R.string.food_description3), getString(R.string.food_address3), getString(R.string.food_phone3), getString(R.string.food_website3), R.drawable.artist));
        locationList.add(new Location(getString(R.string.food_name4), getString(R.string.food_description4), getString(R.string.food_address4), getString(R.string.food_phone4), getString(R.string.food_website4), R.drawable.guxt));
        locationList.add(new Location(getString(R.string.food_name5), getString(R.string.food_description5), getString(R.string.food_address5), getString(R.string.food_phone5), R.drawable.percaria));
        locationList.add(new Location(getString(R.string.food_name6), getString(R.string.food_description6), getString(R.string.food_address6), getString(R.string.food_phone6), getString(R.string.food_website6), R.drawable.beca));
        locationList.add(new Location(getString(R.string.food_name7), getString(R.string.food_description7), getString(R.string.food_address7), getString(R.string.food_phone7), getString(R.string.food_website7), R.drawable.nor));
        locationList.add(new Location(getString(R.string.food_name8), getString(R.string.food_description8), getString(R.string.food_address8), getString(R.string.food_phone8), getString(R.string.food_website8), R.drawable.noa));
        locationList.add(new Location(getString(R.string.food_name9), getString(R.string.food_description9), getString(R.string.food_address9), getString(R.string.food_phone9), getString(R.string.food_website9), R.drawable.hardrock));
        locationList.add(new Location(getString(R.string.food_name10), getString(R.string.food_description10), getString(R.string.food_address10), getString(R.string.food_phone10), getString(R.string.food_website10), R.drawable.excalibur));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locationList);
        ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return rootview;
    }
}
