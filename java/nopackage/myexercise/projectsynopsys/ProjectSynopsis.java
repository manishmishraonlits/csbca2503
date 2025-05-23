class ProjectSynopsis {
    private String title;
    private String problemStatement;
    private String[] objectives;
    private String scope;

    public ProjectSynopsis() {}

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setProblemStatement(String problemStatement) {
        this.problemStatement = problemStatement;
    }

    public String getProblemStatement() {
        return problemStatement;
    }

    public void setObjectives(String[] objectives) {
        this.objectives = objectives;
    }

    public String[] getObjectives() {
        return objectives;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getScope() {
        return scope;
    }

    public void display() {
        System.out.println("BCA III");
        System.out.println("SESSION - 2022-25");
        System.out.println("PROJECT SYNOPSYS");
        System.out.println("-------------------------------------------");
        System.out.println("Title: " + title);
        System.out.println("Problem Statement: " + problemStatement);
        System.out.println("Ojbectives:");
        for (String objective : objectives) {
            System.out.println(objective);
        }
        System.out.println("Scope: ");
        System.out.println(scope);
    }
}