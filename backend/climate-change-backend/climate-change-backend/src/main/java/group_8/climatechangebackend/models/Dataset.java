package group_8.climatechangebackend.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "datasets")
public class Dataset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String description;

    // Many-to-many relationship with VisualizationView
    @ManyToMany(mappedBy = "datasets", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private Set<VisualizationView> visualizationViews = new HashSet<>();

    // Add other fields, getters, and setters as needed

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<VisualizationView> getVisualizationViews() {
        return visualizationViews;
    }

    public void setVisualizationViews(Set<VisualizationView> visualizationViews) {
        this.visualizationViews = visualizationViews;
    }
}
