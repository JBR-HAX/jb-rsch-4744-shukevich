package org.jetbrains.assignment.mapper;

import org.jetbrains.assignment.dto.Step;
import org.jetbrains.assignment.entities.RobotEntity;
import org.jetbrains.assignment.entities.RouteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface RouteMapper  {

    @Mapping()
    List<RouteEntity> mapStepDtoToEntity(List<Step> steps, RobotEntity robot);


}
