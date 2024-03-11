package org.jetbrains.assignment.repository;


import org.jetbrains.assignment.entities.RouteEntity;
import org.springframework.data.repository.CrudRepository;

public interface RouteRepository extends CrudRepository<RouteEntity, Long> {
}
