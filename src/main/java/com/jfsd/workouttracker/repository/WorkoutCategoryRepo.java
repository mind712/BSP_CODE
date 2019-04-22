package com.jfsd.workouttracker.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.jfsd.workouttracker.entity.WorkoutCategory;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "workout_category", path = "category")
public interface WorkoutCategoryRepo extends CrudRepository<WorkoutCategory, Integer> {
	List<WorkoutCategory> findByCategoryName(String name);
}
