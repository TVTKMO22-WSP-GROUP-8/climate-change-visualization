package group_8.climatechangebackend.models;

import javax.persistence.*;

@Entity
@Table(name = "c_carbon_dioxide")
public class c_carbonDioxide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "time")
    private String time;

    @Column(name = "carbon_dioxide")
    private double carbonDioxide;

    @Column(name = "carbon_dioxide_uncertainty")
    private double carbonDioxideUncertainty;




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

    public double getcarbonDioxide() {
        return this.carbonDioxide;
    }

    public void setcarbonDioxide(double carbonDioxide) {
        this.carbonDioxide = carbonDioxide;
    }

    public double getcarbonDioxideUncertairy() {
        return this.carbonDioxideUncertainty;
    }

    public void setcarbonDioxideUncentairy(double carbonDioxideUncertainty) {
        this.carbonDioxideUncertainty = carbonDioxideUncertainty;
    }


}