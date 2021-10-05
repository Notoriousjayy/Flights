package com.example.flights.plane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class planeService {

    Map<PlaneSize, String[]> planes = new HashMap<>();
    String smallPlane[] = {"Main Cabin", "Economy Cabin"};
    String mediumPlane[] = {"Main Cabin", "Economy Cabin", "Comfort Class", "Business Class", "First Class"};
    String largePlane[]= {"Main Cabin", "Economy Cabin", "Comfort Class", "Business Class", "First Class"};


    @Autowired
    private planeRepo repo;

    public List<Plane> getAllCabins(){

        return (List<Plane>) repo.findAll();
    }
    
    public Map<PlaneSize, String[]> getSmallCabins(Enum planeType) {

        if (planeType.equals(PlaneSize.SMALL)) {
            planes.put(PlaneSize.SMALL, smallPlane);
        }
        return planes;
    }


    public Map<PlaneSize, String[]> getMediumCabins(Enum planeType){
            if (planeType.equals(PlaneSize.MEDIUM)) {
                planes.put(PlaneSize.MEDIUM, mediumPlane);
            }
        return planes;
        }

    public Map<PlaneSize, String[]> getLargeCabins(Enum planeType){
        if (planeType.equals(PlaneSize.LARGE)){
            planes.put(PlaneSize.LARGE, largePlane);
        }
            return planes;
    }

    public Plane save(Plane plane){
        return (Plane) repo.save(plane);
    }

}
