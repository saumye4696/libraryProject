package com.library.books.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.library.books.DAO.DisplayDao;
import com.library.books.model.Address;

@Service(value = "libraryService")
@Transactional
public class DisplayServiceImpl implements DisplayService {
	@Autowired
	private DisplayDao libraryDao;
	
	@Override
	public Address showAddress(Integer libraryId) {
		Address a = new Address();
		a = libraryDao.showAddress(libraryId);
		if (a != null) {
			return a;
		}
		else {
			System.out.println("#####RECORD NOT FOUND######");
		}
		return null; 
	}
}
