package org.zerock.service;

import org.springframework.stereotype.Service;

//핵심로직 구현
@Service
public class SampleServiceImpl implements SampleService{

	@Override
	public Integer doAdd(String str1, String str2) throws Exception {
		return Integer.parseInt(str1)+Integer.parseInt(str2);
	}
	
}
