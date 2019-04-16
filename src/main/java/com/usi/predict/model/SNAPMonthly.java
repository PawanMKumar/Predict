package com.usi.predict.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import com.datastax.driver.core.LocalDate;

@Table
public class SNAPMonthly {

	@PrimaryKey
	private UUID id;

	private LocalDate date;
	
	private int cases;
	private int tasks;
	private int ebt_cards;
	private int abawd;
	private int notices;
	private BigDecimal benefit;

	private String city;
	private String toa;
	
	private String created_by;
	private String updated_by;
	private Date create_dt;
	private Date update_dt;

	private boolean deleted;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getCases() {
		return cases;
	}

	public void setCases(int cases) {
		this.cases = cases;
	}

	public int getTasks() {
		return tasks;
	}

	public void setTasks(int tasks) {
		this.tasks = tasks;
	}

	public int getEbt_cards() {
		return ebt_cards;
	}

	public void setEbt_cards(int ebt_cards) {
		this.ebt_cards = ebt_cards;
	}

	public int getAbawd() {
		return abawd;
	}

	public void setAbawd(int abawd) {
		this.abawd = abawd;
	}

	public int getNotices() {
		return notices;
	}

	public void setNotices(int notices) {
		this.notices = notices;
	}

	public BigDecimal getBenefit() {
		return benefit;
	}

	public void setBenefit(BigDecimal benefit) {
		this.benefit = benefit;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getToa() {
		return toa;
	}

	public void setToa(String toa) {
		this.toa = toa;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public Date getCreate_dt() {
		return create_dt;
	}

	public void setCreate_dt(Date create_dt) {
		this.create_dt = create_dt;
	}

	public Date getUpdate_dt() {
		return update_dt;
	}

	public void setUpdate_dt(Date update_dt) {
		this.update_dt = update_dt;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@Override
	public String toString() {
		return "SNAPMonthly [id=" + id + ", date=" + date + ", cases=" + cases
				+ ", tasks=" + tasks + ", ebt_cards=" + ebt_cards + ", abawd="
				+ abawd + ", notices=" + notices + ", benefit=" + benefit
				+ ", city=" + city + ", toa=" + toa + ", created_by="
				+ created_by + ", updated_by=" + updated_by + ", create_dt="
				+ create_dt + ", update_dt=" + update_dt + ", deleted="
				+ deleted + "]";
	}



	
}
