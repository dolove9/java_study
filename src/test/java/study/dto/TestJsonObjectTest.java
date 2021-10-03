package study.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TestJsonObjectTest {

    @DisplayName("Jsoncreator를 이용한 오브젝트 생성")
    @Test
    void test_Jsoncreator를_이용한_오브젝트_생성() throws JsonProcessingException {
        //given
        String jsonString = "{\"callbackPageUrl\":\"callbackPageUrl_url\",\"failurePageUrl\":\"failurePageUrl_url\",\"expireTime\":123}";
        ObjectMapper objectMapper = new ObjectMapper();

        //when
        TestJsonObject testJsonObject = objectMapper.readValue(jsonString, TestJsonObject.class);

        //then
        assertThat(testJsonObject.getCallbackPageUrl()).isEqualTo("callbackPageUrl_url");
    }

}