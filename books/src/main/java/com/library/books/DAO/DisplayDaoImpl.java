package com.library.books.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.library.books.entity.AddressEntity;
import com.library.books.entity.LibraryEntity;
import com.library.books.model.Address;

@Repository(value = "libraryDao")
public class DisplayDaoImpl implements DisplayDao{
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Address showAddress(Integer libraryId) {
		LibraryEntity le = entityManager.find(LibraryEntity.class, libraryId);
		Address a = new Address();
		AddressEntity ae = new AddressEntity();
		
		if (le == null) {
			System.out.println("######RECORD NOT FOUND######");
		}
		else {
			a.setArea(le.getAddressEntity().getArea());
			a.setCity(le.getAddressEntity().getCity());
			a.setPinCode(le.getAddressEntity().getPinCode());
			a.setPlotNumber(le.getAddressEntity().getPlotNumber());
			a.setAddressId(le.getAddressEntity().getAddressId());
		}
		
		return a;
	}
}
