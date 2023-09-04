package com.sunil.lp.contact;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="feature")
public class Feature {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Other attributes, getters, setters, and constructors

    // Getters and setters for 'id'
    public Long getId() {
        return id;
    }

    public int getFeatureId() {
		return featureId;
	}

	public void setFeatureId(int featureId) {
		this.featureId = featureId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setId(Long id) {
        this.id = id;
    }
    
    @Column(name = "featureID")
    private int featureId;
    
    @Column(name = "status")
    private String status;
    
    

}
