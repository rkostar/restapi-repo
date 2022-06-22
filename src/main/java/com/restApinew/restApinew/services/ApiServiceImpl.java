package com.restApinew.restApinew.services;


import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.restApinew.restApinew.entity.Api;

@Service
public class ApiServiceImpl implements ApiService {
	List<Api> list= new ArrayList<>();
	String path= new ClassPathResource("bin-file-assignment.csv").getFile().getAbsolutePath();
	
	public ApiServiceImpl() throws IOException {
		
		Scanner sc= new Scanner(new FileReader(path));
		int i=0;
		while(sc.hasNext()) {
			String inputValues[]= sc.nextLine().split(";",-1);
			if(i==0) {
				i++;
				continue;
			}
			
			String binRange= inputValues[0];
			String cardBrand= inputValues[1];
			String cardIssuer= inputValues[2];
			String cardType= inputValues[3];
			String cardSubtype= inputValues[4];
			String country= inputValues[5];
			String countryCode= inputValues[6];
			String iso= inputValues[7];
			String currencyCode= inputValues[8];
			String url= inputValues[9];
			String contact= inputValues[10];
			
			list.add(new Api(binRange, cardBrand, cardIssuer, cardType, cardSubtype, country, countryCode, iso, currencyCode, url, contact));
		}
	}
	@Override
	public List<Api> getData() {
		// TODO Auto-generated method stub
		
		return list;
	}
	@Override
	public Api getApi(long id) {
		// TODO Auto-generated method stub
		Api a=null;
		for(Api api: list) {
			if(Long.parseLong(api.getBinRange())==id){
				return api;
				
			}
		}
		return a;
	}


		
}
