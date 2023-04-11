package group_8.climatechangebackend.models;

import javax.persistence.*;

@Entity
@Table(name = "northern_hemisphere_temperature")
public class NorthernHemisphereTemperature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "time")
    private String time;

    @Column(name = "anomaly")
    private Double anomaly;

    @Column(name = "lower_confidence_limit")
    private Double lowerConfidenceLimit;

    @Column(name = "upper_confidence_limit")
    private Double upperConfidenceLimit;

    @Column(name = "frequency") // Add this attribute to distinguish between monthly and annual data
    private String frequency;

    // Getters and setters for all attributes

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getAnomaly() {
        return this.anomaly;
    }

    public void setAnomaly(Double anomaly) {
        this.anomaly = anomaly;
    }

    public Double getLowerConfidenceLimit() {
        return this.lowerConfidenceLimit;
    }

    public void setLowerConfidenceLimit(Double lowerConfidenceLimit) {
        this.lowerConfidenceLimit = lowerConfidenceLimit;
    }

    public Double getUpperConfidenceLimit() {
        return this.upperConfidenceLimit;
    }

    public void setUpperConfidenceLimit(Double upperConfidenceLimit) {
        this.upperConfidenceLimit = upperConfidenceLimit;
    }

    public String getFrequency() {
        return this.frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    // ...
}