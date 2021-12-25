package com.reportillo.consumerservicie.controller.response.comics;

import lombok.Getter;

/**
 * @Author Raul E. P. Alvarez
 */

@Getter
public class ComicsResponse {
	private int code;
	private String author = "Raul Portillo ;-)";
	private String status;
    private String copyright;
	private String attributionText;
	private String attributionHTML;
	private String etag;

	private DataResponse data;
}
