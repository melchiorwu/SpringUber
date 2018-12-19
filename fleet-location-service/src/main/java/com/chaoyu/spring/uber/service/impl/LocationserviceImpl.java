package com.chaoyu.spring.uber.service.impl;

import com.chaoyu.spring.uber.domain.Location;
import com.chaoyu.spring.uber.domain.LocationRepository;
import com.chaoyu.spring.uber.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationserviceImpl implements LocationService {
    private LocationRepository locationRepository;

    @Autowired
    public LocationserviceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> saveCarLocations(List<Location> carLocations) {
        return locationRepository.save(carLocations);
    }

    @Override
    public void deleteAll() {
        this.locationRepository.deleteAll();
    }

    @Override
    public Page<Location> findByVehicleMovementType(String movementType, Pageable pageable) {
        return this.locationRepository.findByVehicleMovementType(Location.VehicleMovementType.valueOf(movementType), pageable);
    }

    @Override
    public Page<Location> findByVin(String vin, Pageable pageable) {
        return this.locationRepository.findByUnitInfoUnitVin(vin, pageable);
    }
}
