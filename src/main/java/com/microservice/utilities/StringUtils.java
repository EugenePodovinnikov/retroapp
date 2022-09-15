package com.microservice.utilities;

import lombok.experimental.UtilityClass;

import java.util.function.UnaryOperator;

import static com.microservice.resources.Constants.HeaderValues.TOKEN;
import static com.microservice.resources.Constants.Urls.EBAY_SEARCH_URL;
import static java.lang.String.format;

@UtilityClass
public class StringUtils {

    @UtilityClass
    public static class StringFunctions {
        public static final UnaryOperator<String> ADD_SEARCH_QUERY_TO_REQUEST = s -> format(EBAY_SEARCH_URL, s);
        public static final UnaryOperator<String> ADD_ACCESS_TOKEN_TO_HEADER = s -> format(TOKEN, s);
    }

}
