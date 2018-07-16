package com.example.ioana.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Context context, ArrayList<Location> locationList) {
        super(context, 0, locationList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView locationName = (TextView) listItemView.findViewById(R.id.nameTextView);
        locationName.setText(currentLocation.getName());

        TextView locationDescription = (TextView) listItemView.findViewById(R.id.descriptionTextView);
        locationDescription.setText(currentLocation.getDescription());

        TextView locationAddress = (TextView) listItemView.findViewById(R.id.addressTextView);
        locationAddress.setText(currentLocation.getAddress());

        TextView locationWebsite = (TextView) listItemView.findViewById(R.id.webSiteTextView);
        locationWebsite.setText(currentLocation.getWebsite());

        TextView locationPhone = (TextView) listItemView.findViewById(R.id.phoneTextView);
        locationPhone.setText(currentLocation.getPhone());

        ImageView photoLocationImageView = (ImageView) listItemView.findViewById(R.id.photoImageView);

        if (currentLocation.hasImage()) {
            photoLocationImageView.setImageResource(currentLocation.getImageResourceId());
            photoLocationImageView.setVisibility(View.VISIBLE);
        } else {
            photoLocationImageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
