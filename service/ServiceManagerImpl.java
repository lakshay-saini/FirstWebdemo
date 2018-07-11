package com.FirstWeb.service;

import com.FirstWeb.model.Location;
import com.FirstWeb.repository.LocationDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Purpose: service layer implementation class to implement the ServiceManger class method
 */
@Service
public class ServiceManagerImpl implements ServiceManager {
    /**
     * Logger implementation for logging
     */
    private static final Logger LOGGER = LogManager.getLogger(ServiceManagerImpl.class);

    @Autowired
    private LocationDao locationDao;

    public int add(Location location) {
        LOGGER.info("service method is calling dao layer method for saving Location");
        return locationDao.add(location);
    }

    public List display() {
        LOGGER.info("service method is calling dao layer method for retrieve Location List");
        return locationDao.display();
    }

    public int delete(Location location) {
        LOGGER.info("service method is calling dao layer method for delete Location");
        return locationDao.delete(location);
    }

    public List getLocation(Location location) {
        LOGGER.info("service method is calling dao layer method for get Location");
        return locationDao.getLocation(location);
    }

    public int updateLocation(Location location) {
        LOGGER.info("service method is calling dao layer method for update Location");
        return locationDao.updateLocation(location);
    }
}
