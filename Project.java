class Project {
    private String name;
    private String description;
    private double initialCost;

    // getter
    public double getInitialCost(){
        return initialCost;
    }

    // setter
    public void setInitialCost(double cost){
        initialCost = cost;
    }

    // getter
    public String getName(){
        return name;
    }

    // setter
    public void setName(String name){
        this.name = name;
    }

    // getter
    public String getDescription(){
        return description;
    }

    // setter
    public void setDescription(String desc){
        description = desc;
    }

    public Project(){
    }

    public Project(String name){
        this.name = name;
    }

    public Project(String name, String desc){
        this.name = name;
        description = desc;
    }

    public String elevatorPitch(){
        return name + "(" + initialCost + "): " + description;
    }



}
