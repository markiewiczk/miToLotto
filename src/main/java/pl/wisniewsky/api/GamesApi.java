package pl.wisniewsky.api;


import pl.wisniewsky.model.Games;

import java.io.IOException;

public interface GamesApi {
    Games getGames() throws IOException, GameApiException;
}
