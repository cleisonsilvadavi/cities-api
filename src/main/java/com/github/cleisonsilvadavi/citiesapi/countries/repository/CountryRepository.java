package com.github.cleisonsilvadavi.citiesapi.countries.repository;

import com.github.cleisonsilvadavi.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
