package javatraining.Composition;

public class Person {
    private Job job;
    public Person() {
        job = new Job();
        job.setSal(1000L);
    }

    public long getSalary() {
        return job.getSal();
    }
}
