package pl.wisniewsky.model;

import com.google.gson.annotations.SerializedName;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "EkstraPensja")
public class EkstraPensja implements Serializable {
    @Id
    @Column(name = "numLosowania", unique = true, nullable = false)
    @SerializedName("num_losowania")
    private Integer numLosowania;

    @Column(name = "extra")
    private Integer extra;

    @Column(name = "numerki")
    private String numerki;

    @Column(name = "dataLosowania")
    private LocalDateTime dataLosowania;

    @Column(name = "superszansaId")
    private Integer superszansaId;


    public EkstraPensja() {
    }

    public EkstraPensja(Integer numLosowania, Integer extra, String numerki, LocalDateTime dataLosowania, Integer superszansaId) {
        this.numLosowania = numLosowania;
        this.extra = extra;
        this.numerki = numerki;
        this.dataLosowania = dataLosowania;
        this.superszansaId = superszansaId;
    }

    public Integer getNumLosowania() {
        return numLosowania;
    }

    public Integer getExtra() {
        return extra;
    }

    public String getNumerki() {
        return numerki;
    }

    public LocalDateTime getDataLosowania() {
        return dataLosowania;
    }

    public Integer getSuperszansaId() {
        return superszansaId;
    }

    public void setNumLosowania(Integer numLosowania) {
        this.numLosowania = numLosowania;
    }

    public void setExtra(Integer extra) {
        this.extra = extra;
    }

    public void setNumerki(String numerki) {
        this.numerki = numerki;
    }

    public void setDataLosowania(LocalDateTime dataLosowania) {
        this.dataLosowania = dataLosowania;
    }

    public void setSuperszansaId(Integer superszansaId) {
        this.superszansaId = superszansaId;
    }

    @Override
    public String toString() {
        return "EkstraPensja{" +
                "numLosowania=" + numLosowania +
                ", extra=" + extra +
                ", numerki='" + numerki + '\'' +
                ", dataLosowania=" + dataLosowania +
                ", superszansaId=" + superszansaId +
                '}';
    }
}
