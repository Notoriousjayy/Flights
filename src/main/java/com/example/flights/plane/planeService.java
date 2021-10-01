package com.example.flights.plane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class planeService {

    @Autowired
    private planeRepo repo;

    public planeService(planeRepo repo) {
        this.repo = repo;
    }


}
