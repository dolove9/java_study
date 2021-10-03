package study.constant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;


class PatternsTest {

    @DisplayName("test_패턴_정상처리")
    @Test
    void test_patter_right(){
        String ID_NO_REGEX = "^[a-zA-Z0-9]+"; //공백업는 대/소문자/숫자
        Pattern ID_NO = Pattern.compile(ID_NO_REGEX);

        boolean result = ID_NO.matcher("dolove9").matches();
        assertThat(result).isTrue();
    }

    @DisplayName("test 패턴 비정상처리")
    @Test
    void test_patter_not_right(){
        String ID_NO_REGEX = "^[a-zA-Z0-9]+";
        Pattern ID_NO = Pattern.compile(ID_NO_REGEX);

        boolean result = ID_NO.matcher("dolove9!").matches();
        assertThat(result).isFalse();
    }

}