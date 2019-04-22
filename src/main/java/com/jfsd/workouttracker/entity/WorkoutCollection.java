package com.jfsd.workouttracker.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
public class WorkoutCollection {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "workout_id")
	private Integer id;

	private String workoutTitle;

	private String workoutNote;

	private Float caloriesBurnPerMin;

	@OneToMany(mappedBy ="workoutCollection")
	private List<WorkoutActive> workoutActive;

	@ManyToOne
	@JoinColumn(name = "category_id")
    @RestResource(path = "workoutCategory", rel="workout_category")
	private WorkoutCategory workoutCategory;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWorkoutTitle() {
		return workoutTitle;
	}

	public void setWorkoutTitle(String workoutTitle) {
		this.workoutTitle = workoutTitle;
	}

	public String getWorkoutNote() {
		return workoutNote;
	}

	public void setWorkoutNote(String workoutNote) {
		this.workoutNote = workoutNote;
	}

	public Float getCaloriesBurnPerMin() {
		return caloriesBurnPerMin;
	}

	public void setCaloriesBurnPerMin(Float caloriesBurnPerMin) {
		this.caloriesBurnPerMin = caloriesBurnPerMin;
	}

	public List<WorkoutActive> getWorkoutActive() {
		return workoutActive;
	}

	public void setWorkoutActive(List<WorkoutActive> workoutActive) {
		this.workoutActive = workoutActive;
	}

	public WorkoutCategory getWorkoutCategory() {
		return workoutCategory;
	}

	public void setWorkoutCategory(WorkoutCategory workoutCategory) {
		this.workoutCategory = workoutCategory;
	}

}
