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
public class PartyFragment extends Fragment {

    public PartyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<Location> locationList = new ArrayList<Location>();

        locationList.add(new Location(getString(R.string.party_name1), getString(R.string.party_description1), getString(R.string.party_address1), getString(R.string.party_phone1), getString(R.string.party_website1), R.drawable.control));
        locationList.add(new Location(getString(R.string.party_name2), getString(R.string.party_description2), getString(R.string.party_address2), getString(R.string.party_phone2), getString(R.string.party_website2), R.drawable.expirat));
        locationList.add(new Location(getString(R.string.party_name3), getString(R.string.party_description3), getString(R.string.party_address3), getString(R.string.party_phone3), getString(R.string.party_website3), R.drawable.gaia));
        locationList.add(new Location(getString(R.string.party_name4), getString(R.string.party_description4), getString(R.string.party_address4), getString(R.string.party_phone4), R.drawable.silver));
        locationList.add(new Location(getString(R.string.party_name5), getString(R.string.party_description5), getString(R.string.party_address5), getString(R.string.party_phone5), getString(R.string.party_website5), R.drawable.loft));
        locationList.add(new Location(getString(R.string.party_name6), getString(R.string.party_description6), getString(R.string.party_address6), getString(R.string.party_phone6), getString(R.string.party_website6), R.drawable.fratelli));
        locationList.add(new Location(getString(R.string.party_name7), getString(R.string.party_description7), getString(R.string.party_address7), getString(R.string.party_phone7), getString(R.string.party_website7), R.drawable.face));
        locationList.add(new Location(getString(R.string.party_name8), getString(R.string.party_description8), getString(R.string.party_address8), getString(R.string.party_phone8), getString(R.string.party_website8), R.drawable.boa));
        locationList.add(new Location(getString(R.string.party_name9), getString(R.string.party_description9), getString(R.string.party_address9), getString(R.string.party_phone9), getString(R.string.party_website9), R.drawable.player));
        locationList.add(new Location(getString(R.string.party_name10), getString(R.string.party_description10), getString(R.string.party_address10), getString(R.string.party_phone10), getString(R.string.party_website10), R.drawable.bamboo));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locationList);
        ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return rootview;
    }
}
