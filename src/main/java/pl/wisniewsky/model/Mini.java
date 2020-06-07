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
@Table(name = "Mini")
public class Mini implements Serializable {
    @Id
    @Column(name = "numLosowania", unique = true, nullable = false)
    @SerializedName("num_losowania")
    private Integer numLosowania;

    @Column(name = "numerki")
    private String numerki;

    @Column(name = "dataLosowania")
    private LocalDateTime dataLosowania;

    @Column(name = "superszansaId")
    private Integer superszansaId;

    public Mini() {
    }

    public Mini(String numerki, Integer numLosowania, LocalDateTime dataLosowania, Integer superszansaId) {
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

    public LocalDateTime getDataLosowania() {
        return dataLosowania;
    }

    public void setDataLosowania(LocalDateTime dataLosowania) {
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
        return "Mini{" +
                "numerki='" + numerki + '\'' +
                ", numLosowania=" + numLosowania +
                ", dataLosowania=" + dataLosowania +
                ", superszansaId=" + superszansaId +
                '}';
    }
}
