package org.group.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.group.model.enums.TuLoai;
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

	private String english;
	private String hashTag;
	@Enumerated(EnumType.STRING)
	private TuLoai tuLoai;
	private String phienAm;
	private String vietnamses;
	private String goiNho;
	private String imgURL;
	private String voiceURL;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date addDate;

}
