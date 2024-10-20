package linkedin;

import java.util.List;

public class Profile {
    private String id;
    private String companyName;
    private String designation;
    private List<String> skills;

    public Profile(String id, String companyName, String designation, List<String> skills) {
        this.id = id;
        this.companyName = companyName;
        this.designation = designation;
        this.skills = skills;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
