package com.git.searchTags.singleTag;

import com.git.searchTags.singleTag.responseDto.TagInformationResponseDto;
import com.git.searchTags.singleTag.responseDto.restRequest.OpenTagInformationRequest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({OpenTagInformationRequest.class})
public class OpenSingleTagTest {
    @Test
    public void usingDirectTagUrl() {
        String testUrl = "testUrl";
        TagInformationResponseDto tagInformationResponseDto = new TagInformationResponseDto();
        tagInformationResponseDto.setHtmlUrl(testUrl);
        PowerMockito.mockStatic(OpenTagInformationRequest.class);

        Mockito.when(OpenTagInformationRequest.getTagInformation(Mockito.anyString())).thenReturn(tagInformationResponseDto);
        TagInformationResponseDto tagInformationResponseDtoActual = OpenSingleTag.usingDirectTagUrl(testUrl);
        String actualHtmlUrl = tagInformationResponseDtoActual.getHtmlUrl();

        Assert.assertEquals(testUrl, actualHtmlUrl);
    }
}