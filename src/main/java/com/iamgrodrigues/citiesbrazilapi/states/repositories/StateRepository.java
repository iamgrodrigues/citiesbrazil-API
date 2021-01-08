package com.iamgrodrigues.citiesbrazilapi.states.repositories;

import com.iamgrodrigues.citiesbrazilapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
