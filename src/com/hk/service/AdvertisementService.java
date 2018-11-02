package com.hk.service;

import java.util.List;

import com.hk.bean.Advertisement;

public interface AdvertisementService {
	List<Advertisement> selectAdvertisement();
	int insertAdvertisement(Advertisement advertisement);
	int updateAdvertisement(Advertisement advertisement);
	int deleteAdvertisement(int a);

}
