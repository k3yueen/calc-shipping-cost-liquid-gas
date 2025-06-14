//Roza Antonevici
package shippingCompany;

/**
 * Info class stores basic metadata about the student and the project
 * Used for identification and display purposes in the shipping company program
 */

public class Info {
    private String studentName;
    private String matriculationNumber;
    private String group;
    private String creationDate;
    private int totalLinesOfCode;

    public Info(String studentName, String matriculationNumber, String group, String creationDate) {
        this.studentName = studentName;
        this.matriculationNumber = matriculationNumber;
        this.group = group;
        this.creationDate = creationDate;
        this.totalLinesOfCode = 0; // Will be updated as code is added
    }

    public Info(String studentName, String matriculationNumber, String group) {
        this(studentName, matriculationNumber, group, java.time.LocalDate.now().toString());
    }

    // Getters and Setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getMatriculationNumber() {
        return matriculationNumber;
    }

    public void setMatriculationNumber(String matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public int getTotalLinesOfCode() {
        return totalLinesOfCode;
    }

    public void setTotalLinesOfCode(int totalLinesOfCode) {
        this.totalLinesOfCode = totalLinesOfCode;
    }

    public void printInfo() {
        System.out.println("Project Information:");
        System.out.println("Student Name: " + studentName);
        System.out.println("Matriculation Number: " + matriculationNumber);
        System.out.println("Group: " + group);
        System.out.println("Creation Date: " + creationDate);
        System.out.println("Total Lines of Code: " + totalLinesOfCode);
    }
}
