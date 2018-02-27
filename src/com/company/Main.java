package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Initialize resume object for each group member
        Resume tylerResume = new Resume("BS Nutrition", "Calendly - Salesforce Admin", "Node.js, Express, Apex", "Tyler Campbell");

        Resume calderResume = new Resume("Digital Crafts Buckhead Graduate 2017, BBA Mercer University", "Web Developer Contract Roles ~1 Year", "Working Experience with Javascript, React, Python, Node, SQL", "Calder Marshall");

        Resume amberResume = new Resume("Bachelors of Science in Mathematics", " Mathematics Teacher", "C++, Matlab, Solving complicated Math problems, Communication skills", "Amber Marshall");

        Resume JuniorResume = new Resume("Masters in Cyber Security", "Systems support, networking and administration", "Good people skills, attention to details", "Junior");

        Resume juhoResume = new Resume("Bachelor in Computer Science", "Associate Drill Sergeant (ROKA)", "Java, HTML, CSS, C++, JavaScript", "Juho Lee");

        Resume andrewResume = new Resume("Bachelor of Science in Information Technology", "Information Systems Analyst", "SQL, JavaScript, C#, HTML, CSS, PHP", "Andrew Johnson");

        //Store all resumes in collection
        ArrayList<Resume> resumeList = new ArrayList<Resume>();
        resumeList.add(tylerResume);
        resumeList.add(calderResume);
        resumeList.add(amberResume);
        resumeList.add(ngonidzasheResume);
        resumeList.add(juhoResume);
        resumeList.add(andrewResume);

        System.out.println("\n");
        System.out.println("Team Name: Amber & the Brogrammers\n");
        //Loop through each group member's resume and log information to console
        for (int i = 0; i < resumeList.size(); i++) {
            Resume.printResumes(resumeList.get(i), i + 1);
        }


//        System.out.println("Team Name: Amber & the Brogrammers\n");
//        System.out.println("1) " + tylerResume.name + "\n");
//        System.out.println("Education: " + tylerResume.education);
//        System.out.println("Experience: " + tylerResume.experience);
//        System.out.println("Strengths: " + tylerResume.strengths + "\n");
//
//        System.out.println("2) " + calderResume.name + "\n");
//        System.out.println("Education: " + calderResume.education);
//        System.out.println("Experience: " + calderResume.experience);
//        System.out.println("Strengths: " + calderResume.strengths);
//
//        System.out.println("3) " + amberResume.name + "\n");
//        System.out.println("Education: " + amberResume.education);
//        System.out.println("Experience: " + amberResume.experience);
//        System.out.println("Strengths: " + amberResume.strengths + "\n");
//
//        System.out.println("4) " + juhoResume.name + "\n");
//        System.out.println("Education: " + juhoResume.education);
//        System.out.println("Experience: " + juhoResume.experience);
//        System.out.println("Strengths: " + juhoResume.strengths + "\n");
//
//        System.out.println("5) " + ngonidzasheResume.name + "\n");
//        System.out.println("Education: " + ngonidzasheResume.education);
//        System.out.println("Experience: " + ngonidzasheResume.experience);
//        System.out.println("Strengths: " + ngonidzasheResume.strengths + "\n");
//
//        System.out.println("5) " + andrewResume.name + "\n");
//        System.out.println("Education: " + andrewResume.education);
//        System.out.println("Experience: " + andrewResume.experience);
//        System.out.println("Strengths: " + andrewResume.strengths + "\n");



    }
}
