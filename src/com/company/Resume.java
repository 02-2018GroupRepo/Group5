package com.company;

public class Resume {
    public String education;
    public String experience;
    public String strengths;
    public String name;

    public Resume(String education, String experience, String strengths, String name) {
        this.education = education;
        this.experience = experience;
        this.strengths = strengths;
        this.name = name;
    }

    public static void printResumes(Resume resume, int index) {
        System.out.println(index + ") " + resume.name + "\n");
        System.out.println("Education: " + resume.education);
        System.out.println("Experience: " + resume.experience);
        System.out.println("Strengths: " + resume.strengths + "\n");
    }
}
