public class Student extends User {
    String matricNo = "BHU/22/02/07/0089";
    String adminNo = "BHU0012345";


    public String registerCourse() {
        if (matricNo.equals("") || adminNo.equals((""))){
            return "you can't register course";
        }else {
            return "Succesful";
        }
    }

    public String uploadResult(String password) {
        return "Result uploaded for " + matricNo + " with password: " + password;
    }
}
