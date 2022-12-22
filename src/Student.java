
public class Student {
    private String name;
    private int age;


    public Student(String name, int age) throws MyExcapition {
        if (age<=0){
            throw new MyExcapition("Wrong!!!!");
        }

        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

