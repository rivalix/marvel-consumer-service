package com.reportillo.consumerservicie.controller.response.comics;

import lombok.Getter;

import java.util.List;

/**
 * @Author Raul E. P. Alvarez
 */

@Getter
public class ResultsResponse {
    private Long id;
    private int digitalId;
	private String title;
    private int issueNumber;
    private String variantDescription;
    private String description;
    private String modified;
    private String isbn;
    private String upc;
    private String diamondCode;
    private String ean;
    private String issn;
    private String format;
    private int pageCount;
    private List textObjects;
    private String resourceURI;
    private List urls;
    private SeriesResponse series;
    private List variants;
    private List collections;
    private List collectedIssues;
    private List dates;
    private List prices;
    private ThumbnailResponse thumbnail;
    private List images;
    private CreatorsResponse creators;
    private CharactersResponse characters;
    private StoriesResponse stories;
    private EventsResponse eventsResponse;

}
