package com.gms.web.service.impl;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gms.web.domain.MemberDTO;
import com.gms.web.repository.MemberDAO;
import com.gms.web.service.MemberService;
@Service  //싱글톤 패턴
public class MemberServiceImpl implements MemberService {
	Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);
	@Autowired MemberDAO memberDAO;
	@Override
	public void add(MemberDTO p) {
		String ssn = p.getSsn();
		p.setAge(String.valueOf((Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()))) - (Integer.parseInt("19"+ssn.substring(0, 2)))));
		p.setGender(((Integer.parseInt(ssn.substring(7,8)) % 2 == 1)?"남":"여"));
		memberDAO.insert(p);
	}

	@Override
	public List<?> list(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> search(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO retrieve(MemberDTO p) {
		return memberDAO.selectOne(p);
	}

	@Override
	public int count(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modify(MemberDTO member) {
		memberDAO.update(member);
	}

	@Override
	public boolean remove(MemberDTO p) {
		return memberDAO.remove(p);
	}

	@Override
	public MemberDTO login(MemberDTO p) {
		return memberDAO.login(p);
	}

}
