package group_8.climatechangebackend.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DSS { // change class name to DSS and DE08_2 for other classes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String ice_sample;
    private String analysis_date;
    private double mean_ice_depth;
    private double ice_age;
    private double mean_air_age;
    private double co2_mixing_ratio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIce_sample() {
        return ice_sample;
    }

    public void setIce_sample(String ice_sample) {
        this.ice_sample = ice_sample;
    }

    public String getAnalysis_date() {
        return analysis_date;
    }

    public void setAnalysis_date(String analysis_date) {
        this.analysis_date = analysis_date;
    }

    public double getMean_ice_depth() {
        return mean_ice_depth;
    }

    public void setMean_ice_depth(double mean_ice_depth) {
        this.mean_ice_depth = mean_ice_depth;
    }

    public double getIce_age() {
        return ice_age;
    }

    public void setIce_age(double ice_age) {
        this.ice_age = ice_age;
    }

    public double getMean_air_age() {
        return mean_air_age;
    }

    public void setMean_air_age(double mean_air_age) {
        this.mean_air_age = mean_air_age;
    }

    public double getCo2_mixing_ratio() {
        return co2_mixing_ratio;
    }

    public void setCo2_mixing_ratio(double co2_mixing_ratio) {
        this.co2_mixing_ratio = co2_mixing_ratio;
    }
}
