package com.restApinew.restApinew.services;

import java.util.List;

import com.restApinew.restApinew.entity.Api;

public interface ApiService {
	
	
	public List<Api> getData();
	public Api getApi(long id);
}
