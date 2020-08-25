package com.biz.nav.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO {
	
	private long m_seq;
	private String m_email;
	private String m_tel;
	private String m_id;
	private String m_pw;

}
