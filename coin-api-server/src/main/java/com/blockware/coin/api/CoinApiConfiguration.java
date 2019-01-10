package com.blockware.coin.api;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CoinApiConfiguration {

	private String url;
	private String user;
	private String password;
	
	public CoinApiConfiguration(String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
	}
	
}
