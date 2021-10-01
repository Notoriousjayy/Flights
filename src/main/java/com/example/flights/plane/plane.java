package com.example.flights.plane;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * This class is the entity class
 * @author Jordan
 * **/
@Entity
@Table(name="plane")
public class plane implements Serializable {

    @Id
    private String flightId;
    private String mainCabin;
    private String economy;
    private String comfort;
    private String firstClass;
    private String business;
    private String planeType;

    public plane(String flightId, String mainCabin, String economy, String comfort, String firstClass, String business, String planeType) {
        this.flightId = flightId;
        this.mainCabin = mainCabin;
        this.economy = economy;
        this.comfort = comfort;
        this.firstClass = firstClass;
        this.business = business;
        this.planeType = planeType;
    }

    /**
     * This method returns the flight id as String
     * @return String
     * **/
    public String getFlightId() {
        return flightId;
    }

    /**
     * This method sets the flight id as String
     * @param flightId
     * **/
    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    /**
     * This method returns the main cabin as String
     * @return String
     * **/
    public String getMainCabin() {
        return mainCabin;
    }

    /**
     * This method sets the main cabin as String
     * @param mainCabin
     * **/
    public void setMainCabin(String mainCabin) {
        this.mainCabin = mainCabin;
    }

    /**
     * This method returns the Economy class as String
     * @return String
     * **/
    public String getEconomy() {
        return economy;
    }

    /**
     * This method sets the economy class as String
     * @param economy
     * **/
    public void setEconomy(String economy) {
        this.economy = economy;
    }

    /**
     * This method returns the comfort class as String
     * @return String
     * **/
    public String getComfort() {
        return comfort;
    }

    /**
     * This method sets the comfort class as String
     * @param comfort
     * **/
    public void setComfort(String comfort) {
        this.comfort = comfort;
    }

    /**
     * This method returns the first class as String
     * @return String
     * **/
    public String getFirstClass() {
        return firstClass;
    }

    /**
     * This method sets the first class as String
     * @param firstClass
     * **/
    public void setFirstClass(String firstClass) {
        this.firstClass = firstClass;
    }

    /**
     * This method returns the buisness class as String
     * @return String
     * **/
    public String getBusiness() {
        return business;
    }

    /**
     * This method sets the business class as String
     * @param business
     * **/
    public void setBusiness(String business) {
        this.business = business;
    }

    /**
     * This gets plane type
     * @return planeType
     * **/
    public String getPlaneType() {
        return planeType;
    }

    /**
     * This sets plane type
     * @param planeType
     * **/
    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    @Override
    public String toString() {
        return "plane{" +
                "flightId='" + flightId + '\'' +
                ", mainCabin='" + mainCabin + '\'' +
                ", economy='" + economy + '\'' +
                ", comfort='" + comfort + '\'' +
                ", firstClass='" + firstClass + '\'' +
                ", business='" + business + '\'' +
                ", planeType='" + planeType + '\'' +
                '}';
    }
}
