package com.robot.spring.mssql.repository;

import com.robot.spring.mssql.model.Survivor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RobotRepository extends JpaRepository<Survivor, Long> {
public List<Survivor> findSurvivorByInfectionReportIsGreaterThan(int number);
    public List<Survivor> findSurvivorByInfectionReportIsLessThan(int number);

//    public List<Survivor> findSurvivorByInfectionstatusIsGreaterThan(int number);
//    public List<Survivor> findSurvivorByInfectionstatusIsLessThan(int number);
}
