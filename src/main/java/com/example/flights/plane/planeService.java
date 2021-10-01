package com.example.flights.plane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class planeService {

    Map<PlaneSize, String[]> plane = new HashMap<>();
    String smallPlane[] = {"Main Cabin", "Economy Cabin"};
    String mediumPlane[] = {"Main Cabin", "Economy Cabin", "Comfort class", "Business Class", "First Class"};
    String largePlane[] = {"Main Cabin", "Economy Cabin", "Comfort class", "Business Class", "First Class"};

    @Autowired
    private planeRepo repo;


    public Map<PlaneSize, String[]> getCabins(String planeType){
        if(planeType.equals(PlaneSize.SMALL)){
            plane.put(PlaneSize.SMALL, smallPlane);
            return plane;
        }
        else if(planeType.equals(PlaneSize.MEDIUM)){
            plane.put(PlaneSize.MEDIUM, mediumPlane);
            return plane;
        }
        else
            plane.put(PlaneSize.MEDIUM, largePlane);
            return plane;
    }

}
