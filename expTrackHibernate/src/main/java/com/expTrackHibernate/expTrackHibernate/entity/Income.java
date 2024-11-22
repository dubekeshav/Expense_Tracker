package com.expTrackHibernate.expTrackHibernate.entity;

import java.util.Date;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "incomes")
@EntityListeners(AuditingEntityListener.class)
public class Income {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private String description;

    private String category;

    private String type = "INCOME";

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    private int amount;

}

/*
 * @Entity - Mark the class as a persistent Java class
 * 
 * @Table - Table that this entity will be mapped to
 * 
 * @Id - Define the primary key
 * 
 * @GeneratedValue - Define the primary key generation strategy. We have
 * declared the primary key to be an Auto Increment field.
 * 
 * @NotBlank - Field is not null or empty
 * 
 * @Column - Define the properties of the column that will be mapped to the
 * annotated field
 * All your domain models must be annotated with @Entity annotation. It is used
 * to mark the class as a persistent Java class.
 * 
 * @Temporal - used with java.util.Date and java.util.Calendar classes. It
 * converts the date and time values from Java Object to compatible database
 * type and vice versa.
 * 
 * @JsonIgnoreProperties - Jackson annotation for Serializing and Deserializing
 * Java objects to and from JSON.
 */