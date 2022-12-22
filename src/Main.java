import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws MyExcapition {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("MESSI CRY", 28));
        students.add(new Student("MESSI POOR", 35));
        students.add(new Student("Jhohua", 42));
        students.add(new Student("Erlling", 23));
        students.add(new Student("Foden", 12));
        students.add(new Student("Ericksen", 24));
        students.add(new Student("Mbappe best player", 23));
        for (Student someone : students) {
            System.out.println(someone);
        }
    }
}
