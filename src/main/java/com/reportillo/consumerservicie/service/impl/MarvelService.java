package com.reportillo.consumerservicie.service.impl;

import com.reportillo.consumerservicie.client.MarvelClient;
import com.reportillo.consumerservicie.controller.response.comics.ComicsResponse;
import lombok.AllArgsConstructor;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author Raul E. P. Alvarez
 */

@Service
@AllArgsConstructor
public class MarvelService {
    private static final String PUBLIC_KEY = "c902abeaff6e47853f2539567b4b8f58";
	private static final String PRIVATE_KEY = "a63a2f4855a83402d7d9253bed003ad1a3d1b441";

	private MarvelClient client;

	public ComicsResponse findAll() {
		Long timeStamp = new Date().getTime();

		return client.getAll(timeStamp, PUBLIC_KEY, buildHash(timeStamp));
	}

	private String buildHash(Long timeStamp) {
		return DigestUtils.md5Hex(timeStamp + PRIVATE_KEY + PUBLIC_KEY);
	}
}
