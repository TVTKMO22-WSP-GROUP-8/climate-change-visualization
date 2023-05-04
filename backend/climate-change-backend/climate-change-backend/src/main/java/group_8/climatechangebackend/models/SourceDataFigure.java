package group_8.climatechangebackend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "source_data_figure_1")
public class SourceDataFigure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "time")
    private int time;

    @Column(name = "2_5_percents")
    private double lowerBound;

    @Column(name = "50_percents")
    private double median;

    @Column(name = "97_5_percents")
    private double upperBound;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(double lowerBound) {
        this.lowerBound = lowerBound;
    }

    public double getMedian() {
        return median;
    }

    public void setMedian(double median) {
        this.median = median;
    }

    public double getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(double upperBound) {
        this.upperBound = upperBound;
    }

}
