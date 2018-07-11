package com.FirstWeb.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Java Bean with hibernate Entity annotation for fetching with existing database table
 * or to create a new table
 */
@Component
@Entity
public class Location implements Serializable{
    /**
     * locationID: to store locationId as address
     * in the case of update location in database, it can hold previous address
     */
    @Id
    private String locationID;
    /**
     * address: to store address of location
     */
    @NotNull
    private String address;
    /**
     * latitude: to store latitude of location
     */
    @NotNull
    private Double latitude;
    /**
     * longitude: to store longitude of location
     */
    @NotNull
    private Double longitude;

    /**
     * getter method of address to get address
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * setter method of address to set address
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * getter method of latitude to get latitude
     *
     * @return latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * setter method of latitude to set latitude
     *
     * @param latitude
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * getter method of longitude to get longitude
     *
     * @return longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * setter method of longitude to set longitude
     *
     * @param longitude
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * getter method of locationID to get locationID
     *
     * @return locationID
     */
    public String getLocationID() {
        return locationID;
    }

    /**
     * setter method of locationID to set locationID
     *
     * @param locationID
     */
    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }
}
