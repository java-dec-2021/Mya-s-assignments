import java.util.ArrayList;
public class ProjectTest {
    public static void main(String[] args) {
        // Project project1 =new Project();
        // System.out.println(project1.getName());
        // System.out.println(project1.getDescription());
        // System.out.println(project1.elevatorPitch());

        // Project project2 =new Project("Robot");
        // System.out.println(project2.getName());
        // System.out.println(project2.getDescription());
        // System.out.println(project2.elevatorPitch());

        // Project project3 =new Project("Alexa", "play a song");
        // System.out.println(project3.getName());
        // System.out.println(project3.getDescription());
        // System.out.println(project3.elevatorPitch());

        Project project4 =new Project("Deb", "machine", 500);
        System.out.println(project4.getName());
        System.out.println(project4.getDescription());

        ArrayList<Project> project = new ArrayList<Project>();
        project.add(project4);

        Portfolio x= new Portfolio(project);
        x.showPortfolio();


        
    }
    
}