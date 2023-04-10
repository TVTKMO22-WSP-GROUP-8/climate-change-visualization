// NorthernHemisphere2000.java
package group_8.climatechangebackend.models;

import javax.persistence.*;

@Entity
@Table(name = "northern_hemisphere_2000")
public class NorthernHemisphere2000 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int year;
    private double T;
    private double LF;
    private double LFMinus;
    private double LFPlus;
    private double AMinus;
    private double APlus;
    private double ABMinus;
    private double ABPlus;

    // Add getters and setters

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

    public double getT() {
        return this.T;
    }

    public void setT(double T) {
        this.T = T;
    }

    public double getLF() {
        return this.LF;
    }

    public void setLF(double LF) {
        this.LF = LF;
    }

    public double getLFMinus() {
        return this.LFMinus;
    }

    public void setLFMinus(double LFMinus) {
        this.LFMinus = LFMinus;
    }

    public double getLFPlus() {
        return this.LFPlus;
    }

    public void setLFPlus(double LFPlus) {
        this.LFPlus = LFPlus;
    }

    public double getAMinus() {
        return this.AMinus;
    }

    public void setAMinus(double AMinus) {
        this.AMinus = AMinus;
    }

    public double getAPlus() {
        return this.APlus;
    }

    public void setAPlus(double APlus) {
        this.APlus = APlus;
    }

    public double getABMinus() {
        return this.ABMinus;
    }

    public void setABMinus(double ABMinus) {
        this.ABMinus = ABMinus;
    }

    public double getABPlus() {
        return this.ABPlus;
    }

    public void setABPlus(double ABPlus) {
        this.ABPlus = ABPlus;
    }
}
