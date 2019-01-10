package com.blockware.coin.api;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@ConfigurationProperties("coin-api")
public class Configuration {
	
	private String url;
	private String user;
	private String password;

}
