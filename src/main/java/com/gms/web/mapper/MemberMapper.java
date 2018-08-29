package com.gms.web.mapper;

import java.util.*;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gms.web.controller.HomeController;
import com.gms.web.domain.MemberDTO;
import com.gms.web.repository.MemberDAO;
@Repository //템플릿 패턴역활
public class MemberMapper implements MemberDAO{
	static final Logger logger = LoggerFactory.getLogger(MemberMapper.class);
	@Autowired SqlSessionFactory factory;
	private static final String ns =
			"com.gms.web.mapper.MemberMapper";

	@Override
	public void insert(MemberDTO p) {
		factory.openSession().insert(ns+".insert",p);
	}

	@Override
	public List<?> selectList(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> selectSome(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO selectOne(MemberDTO p) {
		return (MemberDTO) (factory.openSession()).selectOne(ns+".selectOne",p);
	}

	@Override
	public int count(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(MemberDTO p) {
		factory.openSession().update(ns+".update",p);
	}

	@Override
	public boolean remove(MemberDTO p) {
		return ((factory.openSession().delete(ns+".delete",p)) != 0);
	}

	@Override
	public MemberDTO login(MemberDTO p) {
		return factory.openSession().selectOne(ns+".login",p);
	}

}
