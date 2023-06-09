// File name: NorthernHemisphereAnnual.java
package group_8.climatechangebackend.models;

import javax.persistence.*;

@Entity
@Table(name = "northern_hemisphere_annual")
public class NorthernHemisphereAnnual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "time")
    private Integer time;

    @Column(name = "anomaly")
    private double anomaly;

    @Column(name = "lower_confidence_limit")
    private double lowerConfidenceLimit;

    @Column(name = "upper_confidence_limit")
    private double upperConfidenceLimit;

    // Add getters and setters

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTime() {
        return this.time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public double getAnomaly() {
        return this.anomaly;
    }

    public void setAnomaly(double anomaly) {
        this.anomaly = anomaly;
    }

    public double getLowerConfidenceLimit() {
        return this.lowerConfidenceLimit;
    }

    public void setLowerConfidenceLimit(double lowerConfidenceLimit) {
        this.lowerConfidenceLimit = lowerConfidenceLimit;
    }

    public double getUpperConfidenceLimit() {
        return this.upperConfidenceLimit;
    }

    public void setUpperConfidenceLimit(double upperConfidenceLimit) {
        this.upperConfidenceLimit = upperConfidenceLimit;
    }
}