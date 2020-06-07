package org.example.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "Lotto", uniqueConstraints = {@UniqueConstraint(columnNames =  "numLosowania")})
public class Lotto implements Serializable {
    @Id
    @Column(name = "numLosowania", unique = true, nullable = false)
    private Integer numLosowania;

    @Column(name = "numerki")
    private String numerki;

    @Column(name = "dataLosowania")
    private Date dataLosowania;

    @Column(name = "superszansaId")
    private Integer superszansaId;

    public Lotto(){
     }

    public Lotto(Integer numLosowania, String numerki, Date dataLosowania, Integer superszansaId) {
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
}

