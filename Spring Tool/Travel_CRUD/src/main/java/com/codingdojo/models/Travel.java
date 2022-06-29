package com.codingdojo.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Travel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Size(min=3,max=30,message="Travel destination must be between 3 and 30 characters.")
    private String name;

    @Size(min=3,max=30,message="Hotel Name must be between 3 and 30 characters.")
    private String day;

    @DecimalMin(value="10.00", message="Price must be greater than $10.00")
    @DecimalMax(value="999.00",message=" Price must be lower than $999.00.")
    private double price;

    @NotNull(message="Must be a valid date of travel.")
    @DateTimeFormat(pattern="yyyy-mm-dd")
    private Date time;

    @Size(min=8,max=255,message="Travel plans must be between 8 and 255 characters.")
    private String description;
// Many to One & Join - MySQL    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="agent_id")
    private User agent;

// blank constructor
    public Travel ()
    {
        
    }

    // Getters & Setters

    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

    public void setAgent(User user)
    {
        this.agent = user;
    }

    public User getAgent()
    {
        return agent;
    }

};
