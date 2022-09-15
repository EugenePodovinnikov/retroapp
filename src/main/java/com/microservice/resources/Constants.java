package com.microservice.resources;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {

    @UtilityClass
    public static class Messages {
        public static final String GAME_NOT_FOUND = "Game not found";
        public static final String CONSOLE_NOT_FOUND = "Console not found";
        public static final String APP_ID = "Ievgenii-retroapp-PRD-333874b1d-1046c900";
    }

    @UtilityClass
    public static class Urls {
        public static final String EBAY_SEARCH_URL = "https://svcs.ebay.com/services/search/FindingService/v1?OPERATION-NAME=findItemsByKeywords&SERVICE-VERSION=1.0.0&SECURITY-APPNAME=Ievgenii-retroapp-PRD-333874b1d-1046c900&RESPONSE-DATA-FORMAT=JSON&REST-PAYLOAD&keywords=sega";
    }

    @UtilityClass
    public static class Headers {
        public static final String ACCEPT = "Accept";
        public static final String ACCEPT_ENCODING = "Accept-Encoding";
        public static final String ACCEPT_LANGUAGE = "Accept-Language";
        public static final String AUTORIZATION = "Authorization";
        public static final String CONTENT_TYPE = "Content-Type";
    }

    @UtilityClass
    public static class HeaderValues {
        public static final String JSON = "application/json";
        public static final String GZIP = "application/gzip";
        public static final String EN_US = "en_US";
        public static final String TOKEN = "Authorization: Bearer %s";
    }
}
