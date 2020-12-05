package com.example.Transform;

import java.util.Map;

import com.bazaarvoice.jolt.Transform;
import com.example.DTO.CustomerDTO;

public class CustomerTransform implements Transform{

	@Override
	public Object transform(Object input) {
		
		//TODO
		
		String accName = ((Map<String, String>) input).get("name");
		String date = ((Map<String, String>) input).get("dDate");
		
		CustomerDTO cdata = new CustomerDTO();
		
		cdata.setAccountName(accName+" - NEW ACC NAME");
		cdata.setDate(date+" - NEW DATE");
		
		((Map)input).put("newAccName", cdata.getAccountName());
		((Map)input).put("newDate", cdata.getDate());
		
		return cdata;
	}

}
