package group_8.climatechangebackend.models;

import javax.persistence.*;

@Entity
@Table(name = "emissions_by_subsector")
public class EmissionsBySubsector {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sub_sector")
    private String subSector;

    @Column(name = "share_of_global_greenhouse_gas_emissions")
    private Double shareOfGlobalGreenhouseGasEmissions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubSector() {
        return subSector;
    }

    public void setSubSector(String subSector) {
        this.subSector = subSector;
    }

    public Double getShareOfGlobalGreenhouseGasEmissions() {
        return shareOfGlobalGreenhouseGasEmissions;
    }

    public void setShareOfGlobalGreenhouseGasEmissions(Double shareOfGlobalGreenhouseGasEmissions) {
        this.shareOfGlobalGreenhouseGasEmissions = shareOfGlobalGreenhouseGasEmissions;
    }
}
