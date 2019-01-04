package com.git.searchRepository.request;

import com.git.searchRepository.dto.requestDto.SearchRepositoryRequesDto;
import com.git.searchRepository.dto.responseDto.SearchResultsResponseDto;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class SearchRepositoryRequestTest {
    @Test
    public void getSearchResults() {
        SearchResultsResponseDto searchResultsResponseDto = new SearchResultsResponseDto();
        searchResultsResponseDto.setTotalCount(1);

        Map map = new SearchRepositoryRequesDto()
                .withSearchName("testng")
                .withSortBy("stars")
                .withOrderBy("desc")
                .withPagesCount(1)
                .withResultsPerPage(1)
                .convertToMap();

        SearchResultsResponseDto searchResultsResponseDtoActual = SearchRepositoryRequest.getSearchResults(map);
        String actualName = searchResultsResponseDtoActual.getItems().get(0).getName();

        Assert.assertEquals("testng", actualName);
    }
}