package pl.wisniewsky.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Lotto")
public class Lotto implements Serializable {
    @Id
    @Column(name = "numLosowania", unique = true, nullable = false)
    private Integer numLosowania;

    @Column(name = "numerki")
    private String numerki;

    @Column(name = "dataLosowania")
    private Date dataLosowania;

    @Column(name = "superszansaId")
    private int superszansaId;

    public Lotto() {
    }

    public Lotto(Integer numLosowania, String numerki, Date dataLosowania, int superszansaId) {
        this.numLosowania = numLosowania;
        this.numerki = numerki;
        this.dataLosowania = dataLosowania;
        this.superszansaId = superszansaId;
    }

    public String getNumerki() {
        return numerki;
    }

    public void setNumerki(String numerki) {
        this.numerki = numerki;
    }

    public Integer getNumLosowania() {
        return numLosowania;
    }

    public void setNumLosowania(Integer numLosowania) {
        this.numLosowania = numLosowania;
    }

    public Date getDataLosowania() {
        return dataLosowania;
    }

    public void setDataLosowania(Date dataLosowania) {
        this.dataLosowania = dataLosowania;
    }

    public int getSuperszansaId() {
        return superszansaId;
    }

    public void setSuperszansaId(int superszansaId) {
        this.superszansaId = superszansaId;
    }

    @Override
    public String toString() {
        return "Lotto{" +
                "numerki='" + numerki + '\'' +
                ", numLosowania=" + numLosowania +
                ", dataLosowania=" + dataLosowania +
                ", superszansaId=" + superszansaId +
                '}';
    }
}
