public class StudyProgramme {
    private String name;
    private String description;
    private int numberOfSemesters;
    private int maxAllowedITNs;
    public StudyProgramme(String name, String description, int numberOfSemesters, int maxAllowedITNs) {
        this.name = name;
        this.description = description;
        this.numberOfSemesters = numberOfSemesters;
        this.maxAllowedITNs = maxAllowedITNs;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }
    public int getMaxAllowedITNs() {
        return maxAllowedITNs;
    }
}
