package edu.softserveinc.healthbody.webclient.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.*;

@Entity
@Table(name="statistics")
@Getter
@Setter
@NoArgsConstructor
public class Statistics implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "userlogin", nullable = false)
	private String userLogin;
	
	@Column(name = "logindate", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date loginDate;
	
	@Column(name = "logoutdate", nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	private Date logoutDate;
	
}
