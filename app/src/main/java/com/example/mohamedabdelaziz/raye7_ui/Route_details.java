package com.example.mohamedabdelaziz.raye7_ui;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;


/**
 * Created by Mohamed Abd Elaziz on 6/5/2017.
 */

public class Route_details {
    public Distance distance;
    public Duration duration;
    public String endAddress;
    public LatLng endLocation;
    public String startAddress;
    public LatLng startLocation;

    public List<LatLng> points;
}
