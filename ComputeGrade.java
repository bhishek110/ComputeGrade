public class ComputeGrade {

    public int marks(int mark){
        if(mark >= 90){
            System.out.println("A");
        }elseif(mark>=75 && mark<=89){
            System.out.println("B");
        }elseif(mark >=50 && mark <=74){
            System.err.println("C");
        }else{
            System.err.println("Fail");
        }
    }
}