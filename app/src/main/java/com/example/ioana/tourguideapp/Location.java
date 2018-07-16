package com.example.ioana.tourguideapp;

public class Location {

    private String name;
    private String description;
    private String address;
    private String phone;
    private String website;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    public Location(String name, String description, String address, String phone, String website, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.imageResourceId = imageResourceId;
    }

    public Location(String name, String description, String address, String phone, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.phone = phone;
        this.imageResourceId = imageResourceId;
    }

    public Location(String name, String description, String address, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() { return description;}

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}

