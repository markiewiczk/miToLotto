package pl.wisniewsky.api;


import pl.wisniewsky.model.Games;

public interface GameFetchListener {
    void onSuccess(Games games);

    void onFail(String errorMassage);
}
