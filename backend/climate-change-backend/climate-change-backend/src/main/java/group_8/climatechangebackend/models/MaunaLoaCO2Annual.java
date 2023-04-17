package group_8.climatechangebackend.models;

import javax.persistence.*;

@Entity
@Table(name = "mauna_loa_co2_annual")
public class MaunaLoaCO2Annual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "year")
    private int year;

    @Column(name = "mean")
    private double mean;

    @Column(name = "unc")
    private double unc;

    //Getters and Setters
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMean() {
        return this.mean;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public double getUnc() {
        return this.unc;
    }

    public void setUnc(double unc) {
        this.unc = unc;
    }


}
