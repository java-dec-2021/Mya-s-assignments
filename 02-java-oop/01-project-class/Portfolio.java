import java.util.ArrayList;
// Create a Portfolio class 
public class Portfolio{
// that will keep an ArrayList of Project in the field projects
    private ArrayList<Project> projects;
    public char[] showPortfolio;
    // construcor
    public Portfolio(ArrayList<Project> project){
        this.projects = new ArrayList<Project>();
    }
// getters and setters
public ArrayList<Project> getProjects() {
    return projects;
}
public void setProjects(ArrayList<Project> projects) {
    this.projects = projects;
}
// method
public double getPortfolioCost(){
    double total = 0;
    for(Project k : projects){
        total+= k.getInitialCost();
    }
    return total;
}

public void showPortfolio(){
    for(Project show:projects){
        System.out.println(show.elevatorPitch());
    }
    System.out.println("Total Cost; " + this.getPortfolioCost());
}

}