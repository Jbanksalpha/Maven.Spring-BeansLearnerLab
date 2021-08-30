public interface Teacher {
    private void teach(Learner learner, double numberOfHours) {}

    private void lecture(Iterable<? extends Learner> learners, double numberOfHours) {}
}
