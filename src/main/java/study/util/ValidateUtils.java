package study.util;
import org.apache.commons.lang3.StringUtils;
import study.constant.Patterns;

import static com.google.common.base.Preconditions.*;

public class ValidateUtils {
    private static final String ERR_MSG_EMPTY = "empty %s";

    public static String checkId(String id){
        checkArgument(StringUtils.isNotBlank(id), "invalid id. value: %s", id);
        return id;
    }

    public static String checkIdNo(String idNo){
        checkArgument(idNo != null && Patterns.ID_NO.matcher(idNo).matches(), "invalid idNo. value: %s", idNo);
        return idNo;
    }
}
