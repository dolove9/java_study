package study.constant;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.core.ParameterizedTypeReference;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Map;

public final class TestConst {
	public static final String ID = "testId";
	public static final String ID_NO = "testIdNo";
	public static final String NAME = "박갑동";
	public static final String BIRTHDAY = "birthday";
	public static final String NIDLOGINSTAT = "Success-NotRefeshTime";
	public static final String CI = "0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567";
	public static final String DI = "DIDI456789012345678901234567890123456789012345678901234567890123456789012345678901234567";
	public static final String ACCESS_TOKEN = "accessToken";
	public static final String IP = "1.2.3.4";
	public static final String COMPANY_IP = "10.25.3.4";

	public static final String OS_NAME = "testOsName";

	public static final String RAW_PC_USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.106 Whale/2.8.108.15 Safari/537.36";
	public static final String RAW_ANDROID_MOBILE_USER_AGENT = "Mozilla/5.0 (Linux; Android 7.1.2; AFTMM Build/NS6265; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/70.0.3538.110 Mobile Safari/537.36";
	public static final String RAW_ANDROID_TABLET_USER_AGENT = "Mozilla/5.0 (Linux; Android 7.1.1; SM-T555 Build/NMF26X; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/83.0.4103.96 Safari/537.36";
	public static final String RAW_IOS_MOBILE_USER_AGENT = "Mozilla/5.0 (iPhone; CPU iPhone OS 12_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E148";
	public static final String RAW_IOS_TABLET_USER_AGENT = "Mozilla/5.0 (iPad; CPU OS 12_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Mobile/15E148 Safari/604.1";

	public static final String RAW_ANDROID_NAVERAPP_USER_AGENT =
		"Mozilla/5.0 (Linux; Android 10; SM-G977N Build/QP1A.190711.020) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.128 Whale/1.0.0.0 Crosswalk/23.69.599.0 Mobile Safari/537.36 NAVER(inapp; search; 595; 10.15.3)";
	public static final String RAW_ANDROID_DARK_MODE_NAVERAPP_USER_AGENT =
		"Mozilla/5.0 (Linux; Android 11; SM-G981N Build/RP1A.200720.012; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/80.0.3987.163 Whale/1.0.0.0 Crosswalk/25.80.14.28 Mobile Safari/537.36 NAVER(inapp; search; 1000; 11.3.2)";
	public static final String RAW_IOS_NAVERAPP_USER_AGENT =
		"Mozilla/5.0 (iPhone; CPU iPhone OS 14_2 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.0 Mobile/15E148 Safari/605.1 NAVER(inapp; search; 730; 10.30.1; X)";
	public static final String RAW_IOS_DARK_MODE_NAVERAPP_USER_AGENT =
		"Mozilla/5.0 (iPhone; CPU iPhone OS 14_6 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.0 Mobile/15E148 Safari/605.1 NAVER(inapp; search; 1000; 11.3.2; 12PRO)";

	public static final ObjectMapper OBJECT_MAPPER = createObjectMapper();

	public static final String DETAIL = "detail";
	public static final String PRIVATE_DETAIL = "privateDetail";
	public static final Throwable CAUSE = new UnsupportedOperationException();
	public static final String LOCALHOST = "http://127.0.0.1:";
	public static final String LOCALHOST_IP = "127.0.0.1";
	public static final ParameterizedTypeReference<Map<String, Object>> MAP_PARAMETERIZED_TYPE_REFERENCE = new ParameterizedTypeReference<>() {
	};

	public static final String NAME_V1 = "nameVersion1";

	public static final String TOKEN = "token";
	public static final String SERVICE = "naversign";
	public static final String VERIFY_CODE = "3728";

	public static final byte[] AES_128_KEY = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
	public static final byte[] AES_256_KEY = new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
		17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32};
	public static final byte[] AES_INVALID_KEY = new byte[3];

	public static final boolean SUCCESS = true;
	public static final boolean FAIL = false;

	public static final LocalDateTime DATE_TIME_1 = LocalDateTime.of(2020, 3, 1, 13, 12, 14, 0);
	public static final LocalDate DATE_1 = DATE_TIME_1.toLocalDate();

	public static final LocalDateTime DATE_TIME_2 = LocalDateTime.of(2020, 3, 13, 2, 42, 1, 0);
	public static final LocalDate DATE_2 = DATE_TIME_2.toLocalDate();

	public static final LocalDateTime DATE_TIME_3 = LocalDateTime.of(2020, 3, 15, 20, 1, 42, 0);
	public static final LocalDate DATE_3 = DATE_TIME_3.toLocalDate();

	public static final Date OLD_DATE_1 = Date.valueOf(DATE_TIME_1.toLocalDate());
	public static final Date OLD_DATE_TIME_1 =
		new Date(DATE_TIME_1.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
	public static final String ACCOUNT_NO = "1232142328";

/*
	public static final BankCode BANK_CODE = BankCode.B002;
	public static final String EMAIL = "email";

	public static final TermAgreeInfo TERM_AGREE_INFO;
	public static final TermAgreeInfo TERM_AGREE_INFO_NOT_AGREE;
	public static final AuthenticationRequestResult ACCOUNT_REQUEST_RESULT;
	public static final VerificiationResult ACCOUNT_VERIFY_RESULT;

	static {
		TERM_AGREE_INFO = TermAgreeInfo.builder()
			.agree(true)
			.cpCode(CP_CODE)
			.idNo(ID_NO)
			.build();

		TERM_AGREE_INFO_NOT_AGREE = TermAgreeInfo.builder()
			.agree(false)
			.cpCode(CP_CODE)
			.idNo(ID_NO)
			.build();

		ACCOUNT_REQUEST_RESULT = AuthenticationRequestResult.builder()
			.id(ID)
			.service(SERVICE)
			.token(TOKEN)
			.build();

		ACCOUNT_VERIFY_RESULT = VerificiationResult.builder()
			.id(ID)
			.service(SERVICE)
			.token(TOKEN)
			.build();
	}
*/
	public static ObjectMapper createObjectMapper() {
		final ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.registerModule(new Jdk8Module());
		objectMapper.registerModule(new JavaTimeModule());
		objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

		return objectMapper;
	}

	private TestConst() {
		throw new UnsupportedOperationException();
	}
}
