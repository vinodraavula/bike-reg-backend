package com.globalmatics.bike.repositories;

import com.globalmatics.bike.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by H151463 on 11/28/2018.
 */
public interface BikeRepository extends JpaRepository<Bike, Long> {

}
