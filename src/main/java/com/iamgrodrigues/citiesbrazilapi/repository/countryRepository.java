package com.iamgrodrigues.citiesbrazilapi.repository;

import com.iamgrodrigues.citiesbrazilapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface countryRepository extends JpaRepository<Country, Long> {
}
