package com.reportillo.consumerservicie.controller.response.comics;

import lombok.Getter;

import java.util.List;

/**
 * @Author Raul E. P. Alvarez
 */

@Getter
public class StoriesResponse {
    private int available;
    private String collectionURI;
    private List items;
    private int returned;
}
