package org.group.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Proxy;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Proxy(lazy = false)
public class Vocabulary {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(unique = true)
	private String english;
	private String hashtag;
	private String tuLoai;
	private String phienAm;
	private String vietnamses;
	private String goiNho;
	private String imgPath;
	private String voicePath;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date modifyDate;

	public Vocabulary(String english, String hashTag, String tuLoai, String phienAm, String vietnamses, String goiNho) {
		super();
		this.english = english;
		this.hashtag = hashTag;
		this.tuLoai = tuLoai;
		this.phienAm = phienAm;
		this.vietnamses = vietnamses;
		this.goiNho = goiNho;
	}

}
