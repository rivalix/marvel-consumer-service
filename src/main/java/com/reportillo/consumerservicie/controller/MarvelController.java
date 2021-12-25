package com.reportillo.consumerservicie.controller;

import com.reportillo.consumerservicie.controller.response.comics.ComicsResponse;
import com.reportillo.consumerservicie.service.impl.MarvelService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Raul E. P. Alvarez
 */

@AllArgsConstructor
@RestController
@RequestMapping("marvel")
public class MarvelController {
    private MarvelService service;

	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/comics")
	public ComicsResponse findAll() {
		return service.findAll();
	}
}
