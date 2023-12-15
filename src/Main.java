
class Student{
    private int id;
    private String name;
    private int age;

   public Student(int id, String name, int age){
    this.id = id;
    this.name = name;
    this.age = age;
   }

  public void setId(int id){
    this.id = id;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setAge(int age){
    this.age = age;
  }

  public int getId(){
    return this.id;
  }

  public String getName(){
    return name;
  }

  public int getAge(){
    return age;
  }

  public void print(){
    System.out.print("youre name is " + this.name + " and yore age is " + age + " and youre id is" + id);
  }
}
public class Main {
    public static void main(String[] args){
        Student obj1 = new Student(121212, "Khalid", 14);
        obj1.print();

    }
}

