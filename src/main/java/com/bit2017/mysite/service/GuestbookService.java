package com.bit2017.mysite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit2017.mysite.repository.GuestbookDao;
import com.bit2017.mysite.vo.GuestbookVo;

@Service
public class GuestbookService {
	
	@Autowired
	private GuestbookDao guestbookDao;
	
	public List<GuestbookVo> getMessageList() {
		return guestbookDao.getList();
	}
	
	public boolean removeMessage( GuestbookVo guestbookVo ) {
		return guestbookDao.delete(guestbookVo);
	}
	
	public boolean addMessage( GuestbookVo guestbookVo ) {
		return guestbookDao.insert(guestbookVo);
	}
}
