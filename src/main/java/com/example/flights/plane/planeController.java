package com.example.flights.plane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/cabins")
public class planeController {
    
    @Autowired
    private planeService service;

    @PostMapping( "/addplane" )
    public Plane addCabin(@RequestBody Plane cabin) {
        service.save(cabin);
        return cabin;
    }

    @RequestMapping(method=RequestMethod.GET, value="/all", produces ={"application/json"})
    public Object getAllPlanes(){
        return (Object) service.getAllCabins();
    }

    @RequestMapping(method=RequestMethod.GET, value="/smallPlanes", produces ={"application/json"})
    public Map<PlaneSize, String[]> getSmallPlanes(){
        return service.getSmallCabins(PlaneSize.SMALL);
    }


    @RequestMapping(method=RequestMethod.GET, value="/mediumPlanes", produces ={"application/json"})
    public Map<PlaneSize, String[]> getMediumPlanes(){
        return service.getMediumCabins(PlaneSize.MEDIUM);
    }

    @RequestMapping(method=RequestMethod.GET, value="/largePlanes", produces ={"application/json"})
    public Map<PlaneSize, String[]> getLargePlanes(){
        return service.getLargeCabins(PlaneSize.LARGE);
    }
}
