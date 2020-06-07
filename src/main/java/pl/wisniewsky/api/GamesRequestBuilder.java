package pl.wisniewsky.api;

import okhttp3.HttpUrl;
import okhttp3.Request;

public class GamesRequestBuilder implements RequestBuilder {
    private UrlProvider urlProvider = new UrlProvider();

    @Override
    public Request newRequest() {
        HttpUrl url = urlProvider.createUrl();
        return new Request.Builder()
                .url(url)
                .build();
    }
}
