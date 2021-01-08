package com.iamgrodrigues.citiesbrazilapi.countries.repositories;

import com.iamgrodrigues.citiesbrazilapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface countryRepository extends JpaRepository<Country, Long> {
}
