package com.microservices.assignment.aggregator.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.microservices.assignment.aggregator.entiry.AggregatorService;
import com.microservices.assignment.aggregator.entity.OrderDetails;

@Service
public class AggregatorServiceImpl implements AggregatorService {

	Logger logger=LoggerFactory.getLogger(AggregatorServiceImpl.class);

	@Autowired
	private RestTemplate restTemplate;
	@Override
	public OrderDetails getOrderDetails(int userId){
		String baseUrlUser = System.getenv("user_url") + "/user";
		String baseUrlOrder = System.getenv("order_url") + "/orders";
		ResponseEntity<Object> responseUser = null;
		ResponseEntity<Object> responseOrder = null;

		try {
			UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseUrlUser).pathSegment(String.valueOf(userId)  );
				
			responseUser = restTemplate.exchange(builder.buildAndExpand().toUri(), HttpMethod.GET, null,
					Object.class);
			builder = UriComponentsBuilder.fromUriString(baseUrlOrder).pathSegment(String.valueOf(userId));
			responseOrder=restTemplate.exchange(builder.buildAndExpand().toUri(), HttpMethod.GET, null,
					Object.class);
			
		} catch (Exception ex) {
			System.out.println(ex);
		}		
		return new OrderDetails(responseUser.getBody(), responseOrder.getBody());
	}

}
