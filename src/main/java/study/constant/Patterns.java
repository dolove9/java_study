package study.constant;

import java.util.regex.Pattern;

public class Patterns {
    public static final Pattern CI = Pattern.compile("^[0-9a-zA-Z\\+\\/\\=]{88}$");
    public static final Pattern DI = Pattern.compile("^[0-9a-zA-Z\\+\\/\\=]{88}$");
    public static final Pattern ID_NO = Pattern.compile("^[a-zA-Z0-9]+");
    public static final Pattern NAVER_APP_ANDROID_XWHALE_PATTERN = Pattern.compile("[0-9]+(\\.[0-9]+)*");
}
