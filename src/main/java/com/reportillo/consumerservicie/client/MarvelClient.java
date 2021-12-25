package com.reportillo.consumerservicie.client;

import com.reportillo.consumerservicie.controller.response.comics.ComicsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author Raul E. P. Alvarez
 */

@FeignClient(name = "marvel", url = "${url.marvel}/v1/public")
public interface MarvelClient {
    @GetMapping("/comics")
	public ComicsResponse getAll(@RequestParam(value = "ts") Long timeStamp,
								 @RequestParam(value = "apikey") String publicKey,
								 @RequestParam(value = "hash") String hashMD5);
}
