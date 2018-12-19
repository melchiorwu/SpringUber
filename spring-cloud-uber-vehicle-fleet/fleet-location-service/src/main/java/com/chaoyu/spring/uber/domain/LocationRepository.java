package com.chaoyu.spring.uber.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

public interface LocationRepository extends PagingAndSortingRepository<Location, Long> { //Save Location, Long duiiying ID about Location DAO

    @RestResource(rel = "by-service-type")
    Page<Location> findByVehicleMovementType(@Param("movementType") Location.VehicleMovementType move, Pageable pageable);
    //@Param means you can use that name represents that following variable in Java in SqEL

    @RestResource(path = "vin", rel = "by-vin")
    Page<Location> findByUnitInfoUnitVin(@Param("unitVin") String unitVin, Pageable pageable);
}
