package week_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question_12_24 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\OKAN\\Desktop\\workspace\\inar-java\\src\\week_12\\Salary.text");

        Scanner input = new Scanner(file);
        int numberOfAssistant = 0;
        int numberOfAssociates = 0;
        int numberOfFull = 0;
        double AssistantSalary = 0;
        double AssociatesSalary = 0;
        double FullSalary = 0;



        String line = "";
        while (input.hasNext()) {
            line += input.nextLine();
            if (line.contains("Assistant")) {
                numberOfAssistant++;
                AssistantSalary += getSalary(line);
            } else if (line.contains("Associate")) {
                numberOfAssociates++;
                AssociatesSalary += getSalary(line);
            } else {
                numberOfFull++;
                FullSalary += getSalary(line);
            }
        }
        printTable(AssistantSalary,AssociatesSalary,FullSalary,numberOfAssistant,numberOfAssociates,numberOfFull);

    }

    private static void printTable(double AssistantSalary, double AssociateSalary,double FullSalary,
                                   int numberOfAssistant,int numberOfAssociate,int numberOfFull) {
        System.out.println("Total salary for assistant professors: " + AssistantSalary);
        System.out.println("Total salary for associate professors: " + AssociateSalary);
        System.out.println("Total salary for full professors: " + FullSalary);
        System.out.println("Total salary for all faculty: " + (AssistantSalary + AssistantSalary +
                FullSalary));
        System.out.println("Average salary for assistant professor: " + AssistantSalary / numberOfAssistant);
        System.out.println("Average salary for associate professor: " + AssociateSalary / numberOfAssociate);
        System.out.println("Average salary for full professor: " + FullSalary / numberOfFull);
        System.out.println("Average salary for all faculty: " + (AssistantSalary + AssociateSalary +
                FullSalary) / (numberOfAssistant + numberOfAssociate + numberOfFull));


    }

    public static double getSalary(String line){
        String [] words = line.split(" ");
        String salary = words[3];
        return Double.parseDouble(salary);
        }








}
