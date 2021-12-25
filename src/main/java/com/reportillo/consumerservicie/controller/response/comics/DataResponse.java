package com.reportillo.consumerservicie.controller.response.comics;

import lombok.Getter;

import java.util.List;

/**
 * @Author Raul E. P. Alvarez
 */

@Getter
public class DataResponse {
    private int offset;
    private int limit;
    private int total;
    private int count;
    private List<ResultsResponse> results;
}
