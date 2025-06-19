public class Test {
    public static void main(String[] args) {
        Student student = new Student("Bob" , "b21" , "B");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student , view);

        controller.updateView();

        controller.setStudentName("Alice");
        controller.setStudentGrade("A");
        controller.setStudentId("A21");

        System.out.println(" \n After updating student details : ");
        controller.updateView();
    }
}
