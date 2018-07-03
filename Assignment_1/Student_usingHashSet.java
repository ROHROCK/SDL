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

public class Student_usingHashSet{
  public static void main(String[] args) {
      HashMap<Integer , stud_data> HashMap_stud = new HashMap<Integer , stud_data>();
      stud_data obj1 = new stud_data("Rohit",9,21);
      stud_data obj2 = new stud_data("Aditya",1,20);
      stud_data obj3 = new stud_data("Nyan",13,20);
      stud_data obj4 = new stud_data("temp",10,22);

      //Add obj
      HashMap_stud.put(1,obj1);
      HashMap_stud.put(2,obj2);
      HashMap_stud.put(3,obj3);
      HashMap_stud.put(4,obj4);

      //Display
      for (Map.Entry m :HashMap_stud.entrySet() ) {
            stud_data obj = (stud_data)m.getValue();
            System.out.println(m.getKey()+" Name: "+obj.name+"Roll: "+obj.roll+"Age: "+obj.age);
      }
  }
}
