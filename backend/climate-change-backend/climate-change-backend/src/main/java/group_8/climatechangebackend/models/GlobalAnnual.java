package group_8.climatechangebackend.models;

import javax.persistence.*;

@Entity
@Table(name = "global_annual")
public class GlobalAnnual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "time")
    private int year;

    @Column(name = "anomaly")
    private double anomaly;

    @Column(name = "lower_confidence_limit")
    private double lowerConfidenceLimit;

    @Column(name = "upper_confidence_limit")
    private double upperConfidenceLimit;

    // Add getters and setters

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