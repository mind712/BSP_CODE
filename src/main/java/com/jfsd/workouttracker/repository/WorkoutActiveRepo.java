package com.jfsd.workouttracker.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.jfsd.workouttracker.entity.WorkoutActive;
import com.jfsd.workouttracker.entity.WorkoutCollection;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "workout_active", path = "active")
public interface WorkoutActiveRepo extends CrudRepository<WorkoutActive, Integer> {
	List<WorkoutActive> findByStatusAndWorkoutCollection(Boolean status,WorkoutCollection id);
}
