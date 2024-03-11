package org.jetbrains.assignment.service;

import jakarta.transaction.Transactional;
import org.jetbrains.assignment.dto.Route;

import org.jetbrains.assignment.entities.RobotEntity;
import org.jetbrains.assignment.entities.RouteEntity;
import org.jetbrains.assignment.mapper.RouteMapper;
import org.jetbrains.assignment.repository.RobotRepository;
import org.jetbrains.assignment.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RobotRouteService {

    @Autowired
    private RouteMapper routeMapper;

    @Autowired
    private RobotRepository robotRepository;

    @Autowired
    private RouteRepository routeRepository;

    @Transactional
    public RobotEntity createNewRobot(){
        RobotEntity robot = new RobotEntity();
        return  robotRepository.save(robot);
    }

    //Assume that the initial location for the robot is always at (0, 0).
    public List<RouteEntity> createNewRoute(Route route, RobotEntity robot){
        List<RouteEntity> steps = routeMapper.mapStepDtoToEntity( route.getSteps(), robot);
        return (List<RouteEntity>) routeRepository.saveAll(steps);
    }



}
