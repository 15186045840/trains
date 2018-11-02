package com.hk.dao;

import java.util.List;

import com.hk.bean.Advertisement;

public interface AdvertisementDao {
	List<Advertisement> selectAdvertisement();
	int insertAdvertisement(Advertisement advertisement);
	int updateAdvertisement(Advertisement advertisement);
	int deleteAdvertisement(int a);

}
