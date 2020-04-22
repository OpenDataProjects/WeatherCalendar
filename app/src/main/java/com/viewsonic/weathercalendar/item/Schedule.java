package com.viewsonic.weathercalendar.item;

import com.github.tlaabs.timetableview.Time;

import java.io.Serializable;

public class Schedule implements Serializable {
	static final int MON = 0;
	static final int TUE = 1;
	static final int WED = 2;
	static final int THU = 3;
	static final int FRI = 4;
	static final int SAT = 5;
	static final int SUN = 6;

	String classTitle="";
	String classPlace="";
	String professorName="";
	private int day = 0;
	private Time startTime;
	private Time endTime;
	private Type_enum pm;

	public Schedule() {
		this.startTime = new Time();
		this.endTime = new Time();
	}

	public enum Type_enum {
		PM_HIGH,
		PM_MEDIUM,
		PM_LOW,
		PM_SAFE
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setPM(Type_enum type_enum) {
		this.pm = type_enum;
	}

	public Type_enum getPM() {
		return this.pm;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	public String getClassTitle() {
		return classTitle;
	}

	public void setClassTitle(String classTitle) {
		this.classTitle = classTitle;
	}

	public String getClassPlace() {
		return classPlace;
	}

	public void setClassPlace(String classPlace) {
		this.classPlace = classPlace;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}
}
