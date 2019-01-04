package com.git.searchRepository;

import com.git.searchRepository.dto.responseDto.SearchResultsResponseDto;
import com.git.searchRepository.request.SearchRepositoryRequest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(SearchRepositoryRequest.class)
public class SearchRepositoryTest {
    @Test
    public void usingOptions() {
        SearchResultsResponseDto searchResultsResponseDto = new SearchResultsResponseDto();
        searchResultsResponseDto.setTotalCount(1);

        PowerMockito.mockStatic(SearchRepositoryRequest.class);
        Mockito.when(SearchRepositoryRequest.getSearchResults(Mockito.anyMap())).thenReturn(searchResultsResponseDto);

        SearchResultsResponseDto searchResultsResponseDtoActual = SearchRepository.usingOptions("testng");

        int actualTotalCount = searchResultsResponseDtoActual.getTotalCount();

        Assert.assertEquals(1, actualTotalCount);
    }
}