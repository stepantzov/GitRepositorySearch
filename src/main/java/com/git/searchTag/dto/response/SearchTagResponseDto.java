package com.git.searchTag.dto.response;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "zipball_url",
        "tarball_url",
        "commit",
        "node_id"
})
public class SearchTagResponseDto {
    @JsonProperty("name")
    private String name;
    @JsonProperty("zipball_url")
    private String zipballUrl;
    @JsonProperty("tarball_url")
    private String tarballUrl;
    @JsonProperty("commit")
    private Commit commit;
    @JsonProperty("node_id")
    private String nodeId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("zipball_url")
    public String getZipballUrl() {
        return zipballUrl;
    }

    @JsonProperty("zipball_url")
    public void setZipballUrl(String zipballUrl) {
        this.zipballUrl = zipballUrl;
    }

    @JsonProperty("tarball_url")
    public String getTarballUrl() {
        return tarballUrl;
    }

    @JsonProperty("tarball_url")
    public void setTarballUrl(String tarballUrl) {
        this.tarballUrl = tarballUrl;
    }

    @JsonProperty("commit")
    public Commit getCommit() {
        return commit;
    }

    @JsonProperty("commit")
    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    @JsonProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}