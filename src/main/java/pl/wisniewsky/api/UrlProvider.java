package pl.wisniewsky.api;

import okhttp3.HttpUrl;

class UrlProvider {
    private static final String DEFAULT_REQUEST_SCHEMA = "http";
    private static final String DEFAULT_REQUEST_HOST = "serwis.mobilotto.pl";
    private static final String DEFAULT_REQUEST_SOURCE = "mapi_v6/index.php";

    public HttpUrl createUrl() {
        return new HttpUrl.Builder()
                .scheme(DEFAULT_REQUEST_SCHEMA)
                .host(DEFAULT_REQUEST_HOST)
                .addPathSegments(DEFAULT_REQUEST_SOURCE)
                .addQueryParameter("json", "getGames")
                .build();
    }
}
