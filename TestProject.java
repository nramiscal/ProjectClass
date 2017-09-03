class TestProject {
    public static void main (String[] args){

        Portfolio port = new Portfolio();
        Project project1 = new Project();
        Project project2 = new Project("Project2");
        Project project3 = new Project("Project3", "Desc3");
        Portfolio port2 = new Portfolio(project2);

        System.out.println(project1.getName());
        System.out.println(project2.getName());
        System.out.println(project3.getName());

        System.out.println(project1.getDescription());
        System.out.println(project2.getDescription());
        System.out.println(project3.getDescription());

        project1.setName("Project1");
        project1.setDescription("Desc1");
        project2.setDescription("Desc2");
        System.out.println(project1.getName());
        System.out.println(project1.getDescription());

        System.out.println(project1.elevatorPitch());
        System.out.println(project2.elevatorPitch());
        System.out.println(project3.elevatorPitch());

        System.out.println(project1.getInitialCost());
        project1.setInitialCost(100.0);
        project2.setInitialCost(200.0);
        project3.setInitialCost(300.0);
        System.out.println(project1.elevatorPitch());

        port.addToPortfolio(project1);
        port.addToPortfolio(project2);
        port.addToPortfolio(project3);
        System.out.println("Total Cost of Portfolio: " + port.getPortfolioCost());
        port.showPortfolio();

        System.out.println("Total Cost of Portfolio2: " + port2.getPortfolioCost());
        port2.showPortfolio();

    }
}
