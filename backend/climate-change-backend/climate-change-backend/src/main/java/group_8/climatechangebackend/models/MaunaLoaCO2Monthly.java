// File name: MaunaLoaCO2Monthly.java
package group_8.climatechangebackend.models;

import javax.persistence.*;

@Entity
@Table(name = "mauna_loa_co2_monthly")
public class MaunaLoaCO2Monthly {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "year")
    private int year;

    @Column(name ="month")
    private int month;

    @Column(name = "decimal_date")
    private double decimalDate;

    @Column(name = "average")
    private double average;

    @Column(name = "deseasonalized")
    private double deseasonalized;

    @Column(name = "ndays")
    private int nDays;

    @Column(name = "sdev")
    private double sev;

    @Column(name = "unc")
    private double unc;

    //Getters And Setters

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public double getDecimalDate() {
        return this.decimalDate;
    }

    public void setDecimalDate(double decimalDate) {
        this.decimalDate = decimalDate;
    }

    public double getAverage() {
        return this.average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getDeseasonalized() {
        return this.deseasonalized;
    }

    public void setDeseasonalized(double deseasonalized) {
        this.deseasonalized = deseasonalized;
    }

    public int getNDays() {
        return this.nDays;
    }

    public void setNDays(int nDays) {
        this.nDays = nDays;
    }

    public double getSev() {
        return this.sev;
    }

    public void setSev(double sev) {
        this.sev = sev;
    }

    public double getUnc() {
        return this.unc;
    }

    public void setUnc(double unc) {
        this.unc = unc;
    }


}
