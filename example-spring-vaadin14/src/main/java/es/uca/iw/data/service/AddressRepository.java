package es.uca.iw.data.service;

import es.uca.iw.data.entity.Address;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}