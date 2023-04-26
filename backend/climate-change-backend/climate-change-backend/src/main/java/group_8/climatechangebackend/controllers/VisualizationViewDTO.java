// File name: VisualizationViewDTO.java
package group_8.climatechangebackend.controllers;

import java.util.Set;

import group_8.climatechangebackend.models.Dataset;
import group_8.climatechangebackend.models.VisualizationView;

public class VisualizationViewDTO {
    private Integer id;
    private String urlIdentifier;
    private String layout;
    private String description;
    private String name; // Added the 'name' field
    private Set<Dataset> datasets;

    // Add constructors, getters, and setters as needed

    // ...
    // Getter and setter for the 'name' field
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrlIdentifier() {
        return this.urlIdentifier;
    }

    public void setUrlIdentifier(String urlIdentifier) {
        this.urlIdentifier = urlIdentifier;
    }

    public String getLayout() {
        return this.layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Dataset> getDatasets() {
        return this.datasets;
    }

    public void setDatasets(Set<Dataset> datasets) {
        this.datasets = datasets;
    }

    // Add a method to convert a VisualizationView entity to VisualizationViewDTO
    public static VisualizationViewDTO fromEntity(VisualizationView visualizationView) {
        VisualizationViewDTO dto = new VisualizationViewDTO();
        dto.setId(visualizationView.getId());
        dto.setUrlIdentifier(visualizationView.getUrlIdentifier());
        dto.setLayout(visualizationView.getLayout());
        dto.setDescription(visualizationView.getDescription());
        dto.setDatasets(visualizationView.getDatasets());
        return dto;
    }
}
