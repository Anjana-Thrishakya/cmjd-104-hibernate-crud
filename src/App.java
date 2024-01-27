import java.util.ArrayList;
import java.util.List;


import entity.StudentEntity;
import entity.embeded.StudentName;
import repository.StudentRepository;

public class App {
    public static void main(String[] args) throws Exception {
        StudentRepository studentRepository = new StudentRepository();
        
         StudentName studentName = new StudentName("Student 2 First Name", "Student 2 Last Name");
        
         List<String> mobiles = new ArrayList<>();
         mobiles.add("0776787789");
         mobiles.add("0776787739");
        
         StudentEntity entity = new StudentEntity();
         entity.setNic("943324149V");
         entity.setName(studentName);
         entity.setMobiles(mobiles);

         Integer id = studentRepository.saveStudent(entity);
         System.out.println("Student Id : " + id);

        entity = studentRepository.getStudent(1);
        System.out.println(entity.toString());
        entity.setNic("954456789V");
        studentRepository.updateStudent(entity);
        StudentEntity entity2 = studentRepository.getStudent(1);
        System.out.println(entity2.toString());

        studentRepository.deleteStudent(entity2);
    }
}
