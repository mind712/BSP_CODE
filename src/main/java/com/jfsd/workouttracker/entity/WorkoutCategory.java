package com.jfsd.workouttracker.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class WorkoutCategory {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer categoryId;

    private String categoryName;
    
    @OneToMany(mappedBy = "workoutCategory")
    private List<WorkoutCollection> workoutCollection;
    
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<WorkoutCollection> getWorkoutCollection() {
		return workoutCollection;
	}

	public void setWorkoutCollection(List<WorkoutCollection> workoutCollection) {
		this.workoutCollection = workoutCollection;
	}
    
}
