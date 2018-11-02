package com.hk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hk.bean.Resource;
import com.hk.service.ResourceService;

@Controller
public class ResourceController {
	
	@Autowired
	private ResourceService resourceService;
	
	@RequestMapping("selresource.do")
	@ResponseBody
	public List<Resource> queryResources() {
		return resourceService.selectResource();
		
	}
	
	@RequestMapping("insertresource.do")
	@ResponseBody
	public int insertResource(Resource resource) {
		Resource re = new Resource();
		re.setRID(1);
		re.setRname("�羰");
		re.setRtype("��Ƭ");
		re.setRlink("C:\\Users\\Administrator\\Desktop\\�����ֵ�\\train_7.png");
		return resourceService.insertResource(re);
	}
	
	@RequestMapping("updateresource.do")
	@ResponseBody
	public int updateResource(Resource resource) {
		Resource re = new Resource();
		re.setRID(1);
		re.setRname("ɽˮ");
		re.setRtype("��Ƭ");
		re.setRlink("C:\\Users\\Administrator\\Desktop\\�����ֵ�\\train_7.png");
		
		return resourceService.updateResource(re);
	}
	
	@RequestMapping("deleteresource.do")
	@ResponseBody
	public int deleteResource() {
		return resourceService.deleteResource(1);
	}

}
