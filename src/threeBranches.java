import java.util.Scanner;
public class threeBranches {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        DoStuff command = new DoStuff();
        System.out.println("Welcome to the virtual John F Kennedy Administration Museum! Please select the number for which topic you would like to learn about.\n1. John F. Kennedy\n2. Congress\n3." +
                " The Supreme Court\n4. Our evaluation\n5. Leave Museum");
        String m_Subject = userInput.nextLine();
        while (!m_Subject.equals("5")) {
            if (m_Subject.equals("1")) {
                System.out.println("What would you like to learn about JFK?\n1. Background Information\n2. Election Performance\n3. Policies and Achievements\n4. Presidential Power Expansion\n5. Explore the rest of the museum");
                String jFK = userInput.nextLine();
                JFK(jFK);
                museumPrint();
                m_Subject = userInput.nextLine();
            } else if (m_Subject.equals("2")) {
                System.out.println("What would you like to learn about JFK's Congress?\n1. Political Party Majority\n2. Congressional Leaders\n3. Important bills passed\n4. Explore the rest of the museum");
                String congress = userInput.nextLine();
                congress(congress);
                museumPrint();
                m_Subject = userInput.nextLine();

            } else if (m_Subject.equals("3")) {
                System.out.println("What would you like to learn about JFK's Supreme Court?\n1. Chief Justices\n2. Justice Appointments\n3. Important Court Decisions\n4. Explore rest of museum");
                String supremeCourt = userInput.nextLine();
                while (!supremeCourt.equals("4")) {
                    command.setSupremePrint(supremeCourt);
                    System.out.println(command.getSupremePrint());
                    System.out.println("What would you like to learn about JFK's Supreme Court?\n1. Chief Justices\n2. Justice Appointments\n3. Important Court Decisions\n4. Explore rest of museum");
                    supremeCourt = userInput.nextLine();
                    if (supremeCourt.equals("4")) {
                        supremeCourt = "4";
                    }
                }
                museumPrint();
                m_Subject = userInput.nextLine();

            } else if (m_Subject.equals("4")) {
                System.out.println("Which one of our opinions would you like to hear?\n1. Presidential Grade\n2. Did the president accomplish his policy agenda?\n3. Did the legislation passed make America better?\n4. Did the Supreme Court effectively use it's power of Judicial Review?\n5. Explore the rest of the museum");
                String evaluation = userInput.nextLine();
                while (!evaluation.equals("5")) {
                    command.setEvaluation(evaluation);
                    System.out.println(command.getEvaluation());
                    System.out.println("Which one of our opinions would you like to hear?\n1. Presidential Grade\n2. Did the president accomplish his policy agenda?\n3. Did the legislation passed make America better?\n4. Did the Supreme Court effectively use it's power of Judicial Review?\n5. Explore the rest of the museum");
                    evaluation = userInput.nextLine();
                    if (evaluation.equals("5")) {
                        evaluation = "5";
                    }
                }
                museumPrint();
                m_Subject = userInput.nextLine();

            } else {
                System.out.println("The number you entered was invalid. Please select the number corresponding to one of the topics you would like to learn about: \n1. John F. Kennedy\n2. Congress\n3. " +
                        "The Supreme Court\n4. Our evaluation\n5. Leave Museum ");
                m_Subject = userInput.nextLine();
            }
        }
        System.out.println("Hope you enjoyed your stay at the John F Kennedy Administration Museum! Come back soon!");
        System.out.println("\nBy: Joey Hennessy, Shashank Kankati, Jeremy Long");

    }//end of main

    public static void museumPrint() {
        System.out.println("Here are your options for exploring the museum:\n1. John F Kennedy\n2. Congress\n3. Supreme Court\n4. Our Evaluation\n5. Leave Museum");
    }

    public static void JFK(String jFK) {
        Scanner userInput = new Scanner(System.in);
        while (!jFK.equals("5")) {
            if (jFK.equals("1")) {
                System.out.println("Print JFK Background information\n");
            } else if (jFK.equals("2")) {
                System.out.println("Print JFK Election Performance(Going to need to find how to get pictures)\n");
            } else if (jFK.equals("3")) {
                System.out.println("Print JFK Policy Achievements\n");
            } else if (jFK.equals("4")) {
                System.out.println("Print how JFK Expanded Presidential power\n");
            } else {
                System.out.println("The value you entered was invalid, please select one of the following subjects to learn about JFK's presidency:\n1. Background Information\n2. Election Performance\n3. Policies and Achievements\n4. Presidential Power Expansion\n5. Explore the rest of the museum");
                jFK = userInput.nextLine();
                if (jFK.equals("5")) {
                    return;
                }
            }
            System.out.println("Please select which of the following subjects you would like to learn about JFK.\n1. Background Information\n2. Election Performance\n3. Policies and Achievements\n4. Presidential Power Expansion\n5. Explore the rest of the museum");
            jFK = userInput.nextLine();
        }
    }

    public static void congress(String congress) {
        Scanner userInput = new Scanner(System.in);
        while (!congress.equals("4")) {
            if (congress.equals("1")) {
                System.out.println("Print Political Party majority info\n");
            } else if (congress.equals("2")) {
                System.out.println("Print Congressional Leaders info\n");
            } else if (congress.equals("3")) {
                System.out.println("Print 5 most important bills passed\n");
            } else {
                System.out.println("The number you entered was invalid, please select one of the following subjects to learn about JFK's congress:\n1. Political Party Majority\n2. Congressional Leaders\n3. Important Bills Passed\n4. Explore the rest of the museum");
                congress = userInput.nextLine();
                if (congress.equals("4")) {
                    return;
                }
            }
            System.out.println("Please select which of the following subjects you would like to learn about JFK's congress. \n1. Political Party Majority\n2. Congressional Leaders\n3. Important Bills Passed\n4. Explore the rest of the museum");
            congress = userInput.nextLine();
        }
    }
}



