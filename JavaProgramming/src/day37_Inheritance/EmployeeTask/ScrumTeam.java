package day37_Inheritance.EmployeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    private String PO;
    private String BA;
    private String SM;

    private ArrayList<Tester> testers = new ArrayList<>();
    private ArrayList<Developer> developers = new ArrayList<>();

    public String getPO() {
        return PO;
    }

    public void setPO(String PO) {
        this.PO = PO;
    }

    public String getBA() {
        return BA;
    }

    public void setBA(String BA) {
        this.BA = BA;
    }

    public String getSM() {
        return SM;
    }

    public void setSM(String SM) {
        this.SM = SM;
    }

    public ArrayList<Tester> getTesters() {
        return testers;
    }

    public void setTesters(ArrayList<Tester> testers) {
        this.testers = testers;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(ArrayList<Developer> developers) {
        this.developers = developers;
    }

    public void addTester(Tester tester) {
        testers.add(tester);
    }

    public void addTester(Tester[] testers) {
        this.testers.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void addDeveloper(Developer[] developers) {
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeTester(Tester tester) {
        testers.remove(tester);
    }

    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    public ScrumTeam(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                '}';
    }
}

