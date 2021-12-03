public class Project{
    // create a project class that has the fields of name and description.
    // attributes
    private String name;
    private String description;
    private double initialCost;

    // instance method
    public String elevatorPitch(){
        // return this.name+ ":" + this.description;
        return name + ":" + description ;
    }

    // constructors
    // this empty constructor is being called when the object is created on line 3 on main method
    // whenever you created a class the empty constructor is being provided automatically
    // when we call line 3 from main method, its going to call empty constructor
    public Project(){
        this.name = "Type a name";
        this.description="Type a description";
    }

    public Project(String name){
        this.name=name;
        this.description = "Desccc";
    }

    public Project(String name, String description){
        this.name=name;
        this.description = description;
    }

    public Project(String name, String description, double initialCost){
        this.name=name;
        this.description = description;
        this.initialCost = initialCost;
    }

    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    
    public double getInitialCost(){
        return initialCost;
    }
    public void setInitialCost(double initialCost){
        this.initialCost=initialCost;
    }

    
    

    

}