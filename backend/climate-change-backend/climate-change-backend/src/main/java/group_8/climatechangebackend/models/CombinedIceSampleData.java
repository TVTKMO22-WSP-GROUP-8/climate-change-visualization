package group_8.climatechangebackend.models;

import java.util.List;

public class CombinedIceSampleData {
    private List<DE08> de08;
    private List<DSS> dss;
    private List<DE08_2> de08_2;

    // Add getters and setters for each of the fields

    public List<DE08> getDe08() {
        return de08;
    }

    public void setDe08(List<DE08> de08) {
        this.de08 = de08;
    }

    public List<DSS> getDss() {
        return dss;
    }

    public void setDss(List<DSS> dss) {
        this.dss = dss;
    }

    public List<DE08_2> getDe08_2() {
        return de08_2;
    }

    public void setDe08_2(List<DE08_2> de08_2) {
        this.de08_2 = de08_2;
    }
}
