public class Student extends Person implements Learner{


    private double totalStudyTime;


    public Student(Long id, String name) {
        super(id, name);
    }

    public void learn(double numberOfHours) {
        numberOfHours = totalStudyTime + numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
