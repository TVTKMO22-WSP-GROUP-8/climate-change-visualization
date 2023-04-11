package group_8.climatechangebackend.models;
// GlobalMonthly.java


import javax.persistence.*;

@Entity
@Table(name = "global_monthly")
public class GlobalMonthly {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "time")
    private String time;

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

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
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
