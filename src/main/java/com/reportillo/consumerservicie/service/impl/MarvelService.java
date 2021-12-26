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
    private static final String PUBLIC_KEY = "";
	private static final String PRIVATE_KEY = "";

	private MarvelClient client;

	public ComicsResponse findAll() {
		Long timeStamp = new Date().getTime();

		return client.getAll(timeStamp, PUBLIC_KEY, buildHash(timeStamp));
	}

	private String buildHash(Long timeStamp) {
		return DigestUtils.md5Hex(timeStamp + PRIVATE_KEY + PUBLIC_KEY);
	}
}
