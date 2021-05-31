package com.example.traineeData.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.traineeData.Entity.Trainee;



@RepositoryRestResource(collectionResourceRel ="trainee", path="trainee")
public interface TraineeRepository extends JpaRepository<Trainee,Integer> {

}
