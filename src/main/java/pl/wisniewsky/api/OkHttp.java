package pl.wisniewsky.api;

import okhttp3.OkHttpClient;

public enum OkHttp {
    INSTANCE(new OkHttpClient());

    private final OkHttpClient okHttpClient;

    OkHttp(OkHttpClient okHttpClient) {
        this.okHttpClient = okHttpClient;
    }

    public OkHttpClient getClient() {
        return okHttpClient;
    }
}
