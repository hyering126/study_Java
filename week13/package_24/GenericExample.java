package week13.package_24;

public class GenericExample {
    public static void main(String[] args) {
        // 모든 사람이 신청 가능
        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        // 학생만 신청 가능
        // Course.registerCourse2(new Applicant<Person>(new Person())); X
        // Course.registerCourse2(new Applicant<Worker>(new Worker())); X
        Course.registerCourse2(new Applicant<Student>(new Student()));
        Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));

        // 직장인 및 일반인만 신청 가능
        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        // Course.registerCourse1(new Applicant<Student>(new Student())); X
        // Course.registerCourse1(new Applicant<HighStudent>(new HighStudent())); X
        // Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent())); X

    }
}
