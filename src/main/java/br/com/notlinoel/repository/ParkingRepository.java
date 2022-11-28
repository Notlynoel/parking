package br.com.notlinoel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.notlinoel.model.Parking;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {
}
