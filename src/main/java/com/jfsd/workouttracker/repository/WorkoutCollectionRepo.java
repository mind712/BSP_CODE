package com.jfsd.workouttracker.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.jfsd.workouttracker.entity.WorkoutCollection;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "workout_collection", path = "collection")
public interface WorkoutCollectionRepo extends CrudRepository<WorkoutCollection, Integer> {

	List<WorkoutCollection> findByWorkoutTitle(String title);

}
