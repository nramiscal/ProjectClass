import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projects = new ArrayList<Project>();

    // getter
    public ArrayList<Project> getPortfolio(){
        return projects;
    }

    // setter
    public void addToPortfolio(Project proj){
        projects.add(proj);
    }

    // constructor
    public Portfolio(){
    }

    public Portfolio(Project proj){
        addToPortfolio(proj);
    }

    public double getPortfolioCost(){
        double totalCost = 0.0;
        for (Project project: projects){
            totalCost += project.getInitialCost();
        }
        return totalCost;
    }

    public void showPortfolio(){
        double totalCost = getPortfolioCost();
        for (Project project: projects){
            System.out.println(project.elevatorPitch());
        }
        System.out.println("Total Cost: " + totalCost);
    }


}
