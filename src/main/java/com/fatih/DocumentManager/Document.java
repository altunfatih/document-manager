package com.fatih.DocumentManager;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "documents")
public class Document {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 512, nullable = false, unique = true)
	private String name;
	
	private long size;
	
	@Column(name = "upload_time")
	private Date uploadTime;
	
	private byte[] content;

	public Document(Long id, String name, long size) {
		this.id = id;
		this.name = name;
		this.size = size;
	}

	public Document() {
	}
	
	
}
