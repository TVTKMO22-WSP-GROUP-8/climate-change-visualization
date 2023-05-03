package group_8.climatechangebackend.models;

import javax.persistence.*;

@Entity
@Table(name = "de08_2")
public class IceCore2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Analysis;
    private double MeanIceDepth;
    private int IceAge;
    private int MeanAirAge;
    private double CO2MixingRatio;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnalysis() {
        return this.Analysis;
    }

    public void setAnalysis(String Analysis) {
        this.Analysis = Analysis;
    }

    public double getMeanIceDepth() {
        return this.MeanIceDepth;
    }

    public void setMeanIceDepth(double MeanIceDepth) {
        this.MeanIceDepth = MeanIceDepth;
    }

    public int getIceAge() {
        return this.IceAge;
    }

    public void setIceAge(int IceAge) {
        this.IceAge = IceAge;
    }

    public int getMeanAirAge() {
        return this.MeanAirAge;
    }

    public void setMeanAirAge(int MeanAirAge) {
        this.MeanAirAge = MeanAirAge;
    }

    public double getCO2MixingRatio() {
        return this.CO2MixingRatio;
    }

    public void setCO2MixingRatio(double CO2MixingRatio) {
        this.CO2MixingRatio = CO2MixingRatio;
    }

}
