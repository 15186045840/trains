package com.hk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.bean.Advertisement;
import com.hk.dao.AdvertisementDao;

@Service
public class AdvertisementServiceImpl implements AdvertisementService {
	
	@Autowired
	private AdvertisementDao advertisementDao;

	@Override
	public List<Advertisement> selectAdvertisement() {
		// TODO Auto-generated method stub
		return advertisementDao.selectAdvertisement();
	}

	@Override
	public int insertAdvertisement(Advertisement advertisement) {
		// TODO Auto-generated method stub
		return advertisementDao.insertAdvertisement(advertisement);
	}

	@Override
	public int updateAdvertisement(Advertisement advertisement) {
		// TODO Auto-generated method stub
		return advertisementDao.updateAdvertisement(advertisement);
	}

	@Override
	public int deleteAdvertisement(int a) {
		// TODO Auto-generated method stub
		return advertisementDao.deleteAdvertisement(a);
	}

}
