package Lesson1;

import java.util.Arrays;

public class RunClass {
    public static void main(String[] args) {
        teamMember teamMember1 = new teamMember("Ben", 100);
        teamMember teamMember2 = new teamMember("Tim", 50);
        teamMember teamMember3 = new teamMember("Sam", 62);
        teamMember teamMember4 = new teamMember("Jack", 80);
        teamMember[] teamMember = {teamMember1, teamMember2, teamMember3,  teamMember4};
        Team team = new Team("Winners", teamMember);

        Course course = new Course(50,20,80);
        String result = course.doIt(team);
        System.out.println(result);
    }
}
