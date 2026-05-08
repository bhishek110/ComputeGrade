public class ComputeGrade {

    public String marks(int mark) {

        if(mark >= 90) {
            return "A";
        }
        else if(mark >= 75) {
            return "B";
        }
        else if(mark >= 50) {
            return "C";
        }
        else {
            return "Fail";
        }
    }
}