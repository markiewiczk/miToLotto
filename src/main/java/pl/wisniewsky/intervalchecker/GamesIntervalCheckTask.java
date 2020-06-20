package pl.wisniewsky.intervalchecker;

import pl.wisniewsky.api.CloudApi;
import pl.wisniewsky.api.GameApiException;
import pl.wisniewsky.api.GameFetchListener;
import pl.wisniewsky.api.GamesApi;
import pl.wisniewsky.model.Games;

import java.io.IOException;
import java.util.TimerTask;

public class GamesIntervalCheckTask extends TimerTask {
    private final GamesApi api = new CloudApi();

    private final GameFetchListener listener;

    public GamesIntervalCheckTask(GameFetchListener listener) {
        this.listener = listener;
    }

    @Override
    public void run() {
        try {
            Games games = api.getGames();
            listener.onSuccess(games);
        } catch (IOException | GameApiException e) {
            listener.onFail(e.getMessage());
        }
    }
}
