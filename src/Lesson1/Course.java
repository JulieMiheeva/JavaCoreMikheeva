package Lesson1;

import com.sun.source.tree.BreakTree;

public class Course {
    String result;
    private int circle1;
    private int circle2;
    private int circle3;

    public Course(int circle1, int circle2, int circle3) {
        this.circle1 = circle1;
        this.circle2 = circle2;
        this.circle3 = circle3;
    }
    public String doIt(Team team){
        result = "Team: " + team.getTeamName()+ " " + '\n';
        for(teamMember teamMember:team.getTeamMembers()){
         result += "teamMember's name: " + teamMember.getName() + " " + "can run" + " " + teamMember.getCanRun() + '\n';
         int value = teamMember.getCanRun();
         testCircle1(value);
         testCircle2(value);
         testCircle3(value);
        }
        return result;
    }
    private void testCircle1(int value){
        if(value>=circle1) result +="Circle1 - success"+ '\n';
    }
    private void testCircle2(int value){
        if(value>=circle2) result +="Circle2 - success"+ '\n';
    }
    private void testCircle3(int value){
        if(value>=circle3) result +="Circle3 - success"+ '\n';
    }

}
