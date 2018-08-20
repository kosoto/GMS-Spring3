package com.gms.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component  //Bean 으로 쓴다는 의미, @Bean 은 옛날 코딩
@Data
public class Member {
	private String 
				memberId,
				teamId,
				name,
				ssn,
				roll,
				pass,
				age,
				gender,
				subject;

}
