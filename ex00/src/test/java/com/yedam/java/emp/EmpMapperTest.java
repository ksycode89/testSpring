package com.yedam.java.emp;


import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/*-context.xml")
public class EmpMapperTest {

	@Autowired
	EmpMapper empMapper;

//	@Before
	public void returnTest() {
		System.out.println("------before------");
	}
	
//	@Test
	public void returnObj() {
		assertNotNull(empMapper);
		System.out.println("------returnobj------");
	}
	
//	@Test
	public void getEmp() {
		List<EmpVO> list = new ArrayList<EmpVO>();
//		EmpVO vo = new EmpVO();
//
//		vo.setEmployeeId(100);

//		EmpVO findVO = empMapper.getEmp(vo);
		list = empMapper.empList();

		System.out.println(list);
		System.out.println("------returnobj2------");
//		assertEquals(findVO.getLastName(), "King");
//		assertNotNull(empMapper);

	}
	@Test
	public void updateEmp() {
		int result = empMapper.updateEmp(100);
	}
}
