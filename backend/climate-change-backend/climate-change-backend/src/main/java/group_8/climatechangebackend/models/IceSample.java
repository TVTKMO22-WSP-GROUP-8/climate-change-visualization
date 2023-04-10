package group_8.climatechangebackend.models;
// IceSample.java

import javax.persistence.*;

@Entity
@Table(name = "ice_samples")
public class IceSample {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "source")
    private String source;

    @Column(name = "ice")
    private String ice;

    @Column(name = "sample")
    private String sample;

    @Column(name = "analysis")
    private String analysis;

    @Column(name = "mean_ice_depth")
    private Double meanIceDepth;

    @Column(name = "ice_age")
    private Double iceAge;

    @Column(name = "mean_air_age")
    private Double meanAirAge;

    @Column(name = "co2_mixing_ratio")
    private Double co2MixingRatio;

    // Add getters and setters here

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getIce() {
        return this.ice;
    }

    public void setIce(String ice) {
        this.ice = ice;
    }

    public String getSample() {
        return this.sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public String getAnalysis() {
        return this.analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public Double getMeanIceDepth() {
        return this.meanIceDepth;
    }

    public void setMeanIceDepth(Double meanIceDepth) {
        this.meanIceDepth = meanIceDepth;
    }

    public Double getIceAge() {
        return this.iceAge;
    }

    public void setIceAge(Double iceAge) {
        this.iceAge = iceAge;
    }

    public Double getMeanAirAge() {
        return this.meanAirAge;
    }

    public void setMeanAirAge(Double meanAirAge) {
        this.meanAirAge = meanAirAge;
    }

    public Double getCo2MixingRatio() {
        return this.co2MixingRatio;
    }

    public void setCo2MixingRatio(Double co2MixingRatio) {
        this.co2MixingRatio = co2MixingRatio;
    }

}