public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe", "Group1", 4.8);
        Student student2 = new Student("Alice", "Smith", "Group2", 5.0);

        Aspirant aspirant1 = new Aspirant("Bob", "Johnson", "Group3", 4.5, "Research1");
        Aspirant aspirant2 = new Aspirant("Eva", "Brown", "Group4", 5.0, "Research2");

        Student[] students = {student1, student2, aspirant1, aspirant2};

        for (Student student : students) {
            System.out.println(student.firstName + " " + student.lastName +
                    ": Scholarship - " + student.getScholarship());
        }
    }
}
