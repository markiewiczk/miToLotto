package pl.wisniewsky.api;

import com.google.gson.*;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import pl.wisniewsky.model.Games;

import java.io.IOException;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class CloudApi implements GamesApi {
    private OkHttpClient httpClient = OkHttp.INSTANCE.getClient();
    private RequestBuilder requestBuilder = new GamesRequestBuilder();
    private Gson gson = new GsonBuilder().registerTypeAdapter(LocalDateTime.class, new JsonDeserializer<LocalDateTime>() {
        @Override
        public LocalDateTime deserialize(JsonElement json, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return ZonedDateTime.parse(json.getAsJsonPrimitive().getAsString()).toLocalDateTime();
        }
    }).create();

    @Override
    public Games getGames() throws IOException, GameApiException {
        Request request = requestBuilder.newRequest();
        Response response = httpClient.newCall(request).execute();
        if (response.isSuccessful()) {
            String json = response.body().string();
            return gson.fromJson(json, Games.class);
        } else {
            throw new GameApiException("Pobieranie dany sie nie powiodlo: " + response.message(), response.code());
        }
    }
}
