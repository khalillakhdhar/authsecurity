package com.sec.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String taskName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public Task(long id, String taskName) {
		super();
		this.id = id;
		this.taskName = taskName;
	}
	public Task(String taskName) {
		super();
		this.taskName = taskName;
	}
	public Task() {
		super();
	}
	

}
