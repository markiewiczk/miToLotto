package pl.wisniewsky.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Joker")
public class Joker implements Serializable {
    @Id
    @Column(name = "numLosowania", unique = true, nullable = false)
    private Integer numLosowania;

    @Column(name = "numerki")
    private String numerki;

    @Column(name = "dataLosowania")
    private Date dataLosowania;

    @Column(name = "superszansaId")
    private Integer superszansaId;

    @Column(name = "joker")
    private Integer joker;

    public Joker() {
    }

    public Joker(Integer numLosowania, String numerki, Date dataLosowania, Integer superszansaId, Integer joker) {
        this.numLosowania = numLosowania;
        this.numerki = numerki;
        this.dataLosowania = dataLosowania;
        this.superszansaId = superszansaId;
        this.joker = joker;
    }

    public Integer getNumLosowania() {
        return numLosowania;
    }

    public String getNumerki() {
        return numerki;
    }

    public Date getDataLosowania() {
        return dataLosowania;
    }

    public Integer getSuperszansaId() {
        return superszansaId;
    }

    public Integer getJoker() {
        return joker;
    }

    public void setNumLosowania(Integer numLosowania) {
        this.numLosowania = numLosowania;
    }

    public void setNumerki(String numerki) {
        this.numerki = numerki;
    }

    public void setDataLosowania(Date dataLosowania) {
        this.dataLosowania = dataLosowania;
    }

    public void setSuperszansaId(Integer superszansaId) {
        this.superszansaId = superszansaId;
    }

    public void setJoker(Integer joker) {
        this.joker = joker;
    }

    @Override
    public String toString() {
        return "Joker{" +
                "numLosowania=" + numLosowania +
                ", numerki='" + numerki + '\'' +
                ", dataLosowania=" + dataLosowania +
                ", superszansaId=" + superszansaId +
                ", joker=" + joker +
                '}';
    }
}
