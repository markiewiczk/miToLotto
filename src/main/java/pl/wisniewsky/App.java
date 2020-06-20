package pl.wisniewsky;

import pl.wisniewsky.api.GameFetchListener;
import pl.wisniewsky.db.SessionProvider;
import pl.wisniewsky.db.dao.LottoDAO;
import pl.wisniewsky.intervalchecker.GamesIntervalCheckExecutor;
import pl.wisniewsky.intervalchecker.GamesIntervalCheckTask;
import pl.wisniewsky.intervalchecker.TimePeriod;
import pl.wisniewsky.model.Games;
import pl.wisniewsky.model.Lotto;

public class App {

    public static void main(String[] args) {
        SessionProvider sessionProvider = SessionProvider.INSTANCE;
        LottoDAO dao = new LottoDAO(sessionProvider.getSession());

        GamesIntervalCheckTask task = new GamesIntervalCheckTask(new GameFetchListener() {
            @Override
            public void onSuccess(Games games) {
                Lotto gameFromApi = games.getLotto();
//                Lotto gameFromDb = dao.get(games.getLotto().getNumLosowania());
//                System.out.println("gameFromApi >>> " + gameFromApi.toString());
//                if (gameFromDb == null) {
//                    dao.save(gameFromApi);
//                } else {
//                    System.out.println("gameFromDb >>> " + gameFromDb.toString());
//                    gameFromDb.setNumerki(gameFromApi.getNumerki());
                    dao.update(gameFromApi);
//                }
            }

            @Override
            public void onFail(String errorMassage) {
                System.out.println(errorMassage);
            }
        });

        GamesIntervalCheckExecutor executor = new GamesIntervalCheckExecutor();
        executor.checkInInterval(task, TimePeriod.NORMAL);

        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor.stopChecking();
        dao.close();
        sessionProvider.closeFactory();
    }
}
