public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(123, "J", 1);
        s1.setAge(5);
        s1.setId(12);
        s1.setName("D");

        System.out.println("Hello the new age is: " + s1.getAge() + " and the new id is: " + s1.getId() + " and the new name is: " + s1.getName());

    }
}

class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    
}
