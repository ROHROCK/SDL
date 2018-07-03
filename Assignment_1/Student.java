import java.util.*;

class stud_data{
  String name;
  int roll;
  int age;
    stud_data(String n , int r ,int a){
        name = n;
        roll = r ;
        age = a;
    }
}

public class Student{
  public static void main(String[] args) {
      ArrayList<stud_data> ArrayList_stud = new ArrayList<stud_data>();
      stud_data obj1 = new stud_data("Rohit",9,21);
      stud_data obj2 = new stud_data("Aditya",1,20);
      stud_data obj3 = new stud_data("Nyan",13,20);
      stud_data obj4 = new stud_data("temp",10,22);

      //Add obj
      ArrayList_stud.add(obj1);
      ArrayList_stud.add(obj2);
      ArrayList_stud.add(obj3);
      ArrayList_stud.add(obj4);

      //Display
      for (stud_data ref :ArrayList_stud ) {
          System.out.println("Name: "+ref.name+"\nroll: "+ref.roll+"\nAge: "+ref.roll);
      }
  }
}
