package com.hk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hk.bean.Advertisement;
import com.hk.service.AdvertisementService;

@Controller
public class AdvertisementController {
	@Autowired
	private AdvertisementService advertisementService;
	
	@RequestMapping("seladvertisement.do")
	@ResponseBody
	public List<Advertisement> queryAdvertisement() {
		
		return advertisementService.selectAdvertisement();
	}
	
	@RequestMapping("insertadvertisement.do")
	@ResponseBody
	public int insertAdvertisement(Advertisement advertisement) {
		Advertisement at = new Advertisement();
		at.setAID(1);
		at.setAtype("图文");
		at.setAtitle("贪玩蓝月");
		at.setAcontent("一道暴击99999，快来贪玩南岳，我是渣渣辉");
		at.setAlink("‪C:\\Users\\Administrator\\Desktop\\百度文档下载地址.png");
		
		return advertisementService.insertAdvertisement(at);
	}
	
	@RequestMapping("updateadvertisement.do")
	@ResponseBody
	public int updateAdvertisement(Advertisement advertisement) {
		Advertisement at = new Advertisement();
		at.setAID(1);
		at.setAtype("视频");
		at.setAtitle("贪玩蓝月");
		at.setAcontent("一道暴击99999，快来贪玩南岳，我是渣渣辉");
		at.setAlink("‪C:\\Users\\Administrator\\Desktop\\百度文档下载地址.png");
		
		
		return advertisementService.updateAdvertisement(at);
	}
	
	@RequestMapping("deleteadvertisement.do")
	@ResponseBody
	public int deleteAdvertisement() {
		return advertisementService.deleteAdvertisement(1);
	}

}
