package bit.com.a.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bit.com.a.dao.MemberDao;
import bit.com.a.dto.MemberDto;
import bit.com.a.service.MemberService;

@Service	// controller, dao 중간에 위치.... DB데이터 가공
public class MemberServiceImpl implements MemberService {

	@Autowired				// ioc
	MemberDao memberDao;	// MemberDao memberDao = new MemberDaoImpl();

	

	@Override
	public int getId(String id) {		
		return memberDao.getId(id);		
	}
	
	@Override
	public boolean addmember(MemberDto mem) {		
		return memberDao.addmember(mem);		
	}

/*
	@Override
	public MemberDto login(MemberDto dto) {
		return memberDao.login(dto);
	}
*/
	
	@Override
	public MemberDto login(MemberDto dto) {
		return memberDao.login(dto);
	}

	@Override
	public MemberDto get(String id) {
		return memberDao.get(id);
	}
}





