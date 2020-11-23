public class DoStuff {
    private String supremeCourt;
    private String evaluation;

    public DoStuff() {
        supremeCourt = "";
        evaluation = "";
    }

    public void setSupremePrint(String uSupreme) {
        if(uSupreme.equals("1")){
            supremeCourt = "Print Chief Justice info\n";
        } else if (uSupreme.equals("2")) {
            supremeCourt = "Print Justices Appointed info\n";
        } else if (uSupreme.equals("3")){
            supremeCourt = "Print 5 most important court decisions\n";
        } else {
            supremeCourt = "The number you entered was invalid. Please enter one of the options below";
            //supremeCourt =  "The number you entered was invalid, please select one of the following subjects to learn about JFK's congress:\n1. Political Party Majority\n2. Congressional Leaders\n3. Important Bills Passed\n4. Explore the rest of the museum";
        }
    }

    public String getSupremePrint() {
        return supremeCourt;
    }

    public void setEvaluation(String uEvaluation) {
        if (uEvaluation.equals("1")) {
            evaluation = "Print letter grade rating info\n";
        } else if (uEvaluation.equals("2")) {
            evaluation = "Print Policy Agenda Accomplishments info\n";
        } else if (uEvaluation.equals("3")) {
            evaluation = "Print Did Legislation passed make america better info\n";
        } else if (uEvaluation.equals("4")) {
            evaluation = "Print Judicial Review opinion\n";
        } else {
            //evaluation = "The number you entered was invalid, please select which one of our opinions you would like to hear.\n1. Our Letter Grade for JFK's Administration\n2. Did JFK accomplish his policy agenda?\n3. Did the Legislation passed make America better?\n4. Did the Supreme Court Successfully use their Judicial Review power?\n5. Explore rest of museum";
            evaluation = "The number you entered was invalid. Please enter one of the options below";
        }
    }

    public String getEvaluation() {
        return evaluation;
    }

}
