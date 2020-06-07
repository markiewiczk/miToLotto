package org.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.MissingFormatArgumentException;

@Entity
@Table (name = "MiniLotto")
public class MiniLotto {
    @Id
    @Column(name = "numLosowania", unique = true, nullable = false)
    private Integer numLosowania;

    @Column(name = "numerki")
    private String numerki;

    @Column(name = "dataLosowania")
    private Date dataLosowania;

    @Column(name = "superszansaId")
    private Integer superszansaId;

    public MiniLotto() {
        }

    public MiniLotto(String numerki, Integer numLosowania, Date dataLosowania, Integer superszansaId) {
        this.numerki = numerki;
        this.numLosowania = numLosowania;
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

    public Integer getSuperszansaId() {
        return superszansaId;
    }

    public void setSuperszansaId(Integer superszansaId) {
        this.superszansaId = superszansaId;
    }

    @Override
    public String toString() {
        return "MiniLotto{" +
                "numerki='" + numerki + '\'' +
                ", numLosowania=" + numLosowania +
                ", dataLosowania=" + dataLosowania +
                ", superszansaId=" + superszansaId +
                '}';

    }
}
