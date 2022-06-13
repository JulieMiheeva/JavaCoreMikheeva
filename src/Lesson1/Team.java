package Lesson1;

public class Team {

    private String teamName;
    private teamMember [] teamMembers;

    public Team(String teamName, teamMember [] teamMembers) {
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    public String getTeamName() {
        return teamName;
    }

    public teamMember[] getTeamMembers() {
        return teamMembers;
    }
}
