package com.fresh.back.end.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fresh.back.end.mapper.TestMapper;
import com.fresh.back.end.model.Tests;
import com.fresh.back.end.service.TestService;

@Service
public class TestServiceImp implements TestService {
	@Autowired
	private TestMapper mapper;

	@Override
	public void add() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Tests> queryAll() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}

}
