package pl.wisniewsky.api;

public class GameApiException extends RuntimeException {
    private final int code;

    public GameApiException(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
