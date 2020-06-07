package pl.wisniewsky.model;

import com.google.gson.annotations.SerializedName;

public class Games {

    @SerializedName("Lotto")
    private Lotto lotto;

    @SerializedName("Mini")
    private Mini mini;

    @SerializedName("Joker")
    private Joker joker;

    @SerializedName("LottoPlus")
    private LottoPlus lottoPlus;

    public Lotto getLotto() {
        return lotto;
    }

    public void setLotto(Lotto lotto) {
        this.lotto = lotto;
    }

    public Mini getMini() {
        return mini;
    }

    public void setMini(Mini mini) {
        this.mini = mini;
    }

    public Joker getJoker() {
        return joker;
    }

    public void setJoker(Joker joker) {
        this.joker = joker;
    }

    public LottoPlus getLottoPlus() {
        return lottoPlus;
    }

    public void setLottoPlus(LottoPlus lottoPlus) {
        this.lottoPlus = lottoPlus;
    }
}
