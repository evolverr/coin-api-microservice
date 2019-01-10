package com.blockware.coin.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoinApiController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/")
	public CoinApiConfiguration getConfigurations() {
		return new CoinApiConfiguration(configuration.getUrl(), configuration.getUser(), configuration.getPassword());
	}
	
}
