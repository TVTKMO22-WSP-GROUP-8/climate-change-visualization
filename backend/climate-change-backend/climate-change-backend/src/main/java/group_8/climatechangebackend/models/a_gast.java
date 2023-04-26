package group_8.climatechangebackend.models;

import javax.persistence.*;

@Entity
@Table(name = "a_gast")
public class a_gast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "time")
    private String time;

    @Column(name = "point_one 2,5")
    private double pointOne;

    @Column(name = "point_two 50")
    private double pointTwo;

    @Column(name = "point_three 97,5")
    private double pointThree;

   

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

    public double getpointOne() {
        return this.pointOne;
    }

    public void setpointOne(double pointOne) {
        this.pointOne = pointOne;
    }

    public double getpointTwo() {
        return this.pointTwo;
    }

    public void setpoint_two(double pointTwo) {
        this.pointTwo = pointTwo;
    }

    public double getpoinThree() {
        return this.pointThree;
    }

    public void setpointThree(double pointThree) {
        this.pointThree = pointThree;
    }
}