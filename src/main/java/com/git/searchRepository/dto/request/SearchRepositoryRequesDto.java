package com.git.searchRepository.dto.request;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class SearchRepositoryRequesDto {
    private static ObjectMapper oMapper = new ObjectMapper();
    private String q;
    private String sort;
    private String order;
    private int page;
    private int per_page;

    public SearchRepositoryRequesDto() {
    }

    public String getQ() {
        return q;
    }

    public String getSort() {
        return sort;
    }

    public String getOrder() {
        return order;
    }

    public int getPage() {
        return page;
    }

    public int getPer_page() {
        return per_page;
    }

    public SearchRepositoryRequesDto withSearchName(String q) {
        this.q = q;
        return this;
    }

    public SearchRepositoryRequesDto withSortBy(String sort) {
        this.sort = sort;
        return this;
    }

    public SearchRepositoryRequesDto withOrderBy(String order) {
        this.order = order;
        return this;
    }

    public SearchRepositoryRequesDto withPagesCount(int page) {
        this.page = page;
        return this;
    }

    public SearchRepositoryRequesDto withResultsPerPage(int per_page) {
        this.per_page = per_page;
        return this;
    }

    public Map convertToMap() {
        return oMapper.convertValue(this, Map.class);
    }
}