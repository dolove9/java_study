package study.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class TestJsonObject {
    private String callbackPageUrl;
    private String failurePageUrl;
    private Long expireTime;

    @JsonCreator
    public TestJsonObject(
            @JsonProperty("callbackPageUrl") String callbackPageUrl,
            @JsonProperty("failurePageUrl") String failurePageUrl,
            @JsonProperty("expireTime") long expireTime){
        this.callbackPageUrl = callbackPageUrl;
        this.failurePageUrl = failurePageUrl;
        this.expireTime = expireTime;
    }
}
