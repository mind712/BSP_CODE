package com.jfsd.workouttracker.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
public class WorkoutActive {

	@Id    
	@GeneratedValue
	private Integer id;

	private Time startTime;

	private Date startDate;

	private Date endDate;

	private Time endTime;

	private String comment;

	private Boolean status;

	@ManyToOne
	@JoinColumn(name = "workout_id")
    @RestResource(path = "active", rel="workout_active")
	private WorkoutCollection workoutCollection;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public WorkoutCollection getWorkoutCollection() {
		return workoutCollection;
	}

	public void setWorkoutCollection(WorkoutCollection workoutCollection) {
		this.workoutCollection = workoutCollection;
	}

}
