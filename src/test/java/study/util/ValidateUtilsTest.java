package study.util;

import com.google.common.base.Preconditions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import study.constant.TestConst;

import static org.assertj.core.api.Assertions.*;
import static study.util.ValidateUtils.*;

class ValidateUtilsTest {
    @Test
    void checkId_입력_아이디가_널_일때_오류를__발생시킨다() {
        assertThatThrownBy(() -> checkId(null))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void checkId_입력_아이디가_공백_일때_오류를__발생시킨다() {
        assertThatThrownBy(() -> checkId(" "))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("")
    @Test
    void test_checkId_정상일_때(){
        assertThat(checkId(TestConst.ID)).isEqualTo(TestConst.ID);
    }

    @DisplayName("")
    @Test
    void test_checkArgument_test1(){
        //given
        String test = "dolove9";

        //when

        //then
        Preconditions.checkArgument(test == "dolove9", "error message");
    }
}