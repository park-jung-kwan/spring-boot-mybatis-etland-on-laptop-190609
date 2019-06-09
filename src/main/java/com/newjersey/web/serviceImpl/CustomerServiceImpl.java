package com.newjersey.web.serviceImpl;

import com.newjersey.web.mapper.CustomerMapper;
import com.newjersey.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 */
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired CustomerMapper map;
    @Override
    public String countAll() {
        System.out.println("---- 서비스 내부로 진입함 ----");
		//String num = map.countAll();
		String num = "1";
		System.out.println("서비스에서 판단한 인원수 : "+num);
		return num;
    }

    
}