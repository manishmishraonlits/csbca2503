public class Krishnandan
{
    public static void main(String[] args) {
        ProjectSynopsis krishProjectSynopsis = new ProjectSynopsis();
        krishProjectSynopsis.setTitle("Parking Lot Management System");
        krishProjectSynopsis.setProblemStatement("Most of the parking lots in my city are manually managed ...");
        String[] objectives = {
            "1. To decrease rush at the parking lot.",
            "2. To expedite the parking charge process.",
        };

        krishProjectSynopsis.setObjectives(objectives);
        krishProjectSynopsis.setScope("Scope of the project goes here...");
        krishProjectSynopsis.display();
    }
}