import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import pl.wisniewsky.db.SessionProvider;
import pl.wisniewsky.db.dao.LottoDAO;
import pl.wisniewsky.model.Lotto;

import java.net.URL;
import java.util.ResourceBundle;

public class MainSceneController implements Initializable {
    @FXML
    Button loadButton;

    @FXML
    TextField idField;

    @FXML
    Label resultLabel;

    private LottoDAO dao;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SessionProvider sessionProvider = SessionProvider.INSTANCE;
        dao = new LottoDAO(sessionProvider.getSession());

    }

    public void doMagic(MouseEvent mouseEvent) {
        Lotto lotto = dao.get(Integer.parseInt(idField.getText()));
        resultLabel.setText(lotto.toString());
    }
}
