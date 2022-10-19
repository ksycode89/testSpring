package com.yedam.java.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.java.emp.service.EmpVO;

public interface EmpMapper {
	//	전체조회
	public List<EmpVO> empList ();
	//	employee_id 단건조회
	public EmpVO getEmp(EmpVO empVO);
	//등록
	public int insertEmp(EmpVO empVO);
	//수정 : 10퍼 인상
	public int updateEmp(int employeeId);
	//수정 : 이름/성/이메일 수정 메서드
	public int updateNameMailEmp(EmpVO empVO);
	//삭제
	public int deleteEmp(@Param("empId") int Id);
	

	
	
	
	
}
