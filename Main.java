import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student( 1, "Иванов", "Иван", "Иванович");
        Student student2 = new Student(2, "Петухов", "Иван", "Сергевич");
        Student student3 = new Student(3, "Гусев", "Ренат", "Андреевич");
        Student student4 = new Student(4, "Сидоров", "Алексей", "Потапович");
        Student student5 = new Student(5, "Иродов", "Андрей", "Генадьевич");

        StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);
        studentGroup.addStudent(student5);

        StudentGroup studentGroup1 = new StudentGroup(new ArrayList<>());
        studentGroup1.addStudent(student3);
        studentGroup1.addStudent(student4);
        studentGroup1.addStudent(student1);

        StudentGroup studentGroup2 = new StudentGroup(new ArrayList<>());
        studentGroup1.addStudent(student1);
        studentGroup1.addStudent(student5);

        Stream stream1 = new Stream(new ArrayList<>()); 
        stream1.AddStudentGroup(studentGroup);

        Stream stream2 = new Stream(new ArrayList<>()); 
        stream2.AddStudentGroup(studentGroup1);
        stream2.AddStudentGroup(studentGroup2);


        StreamComparator streamComparator = new StreamComparator();
        streamComparator.compare(stream1, stream2);

        // printListStudent(stream2);

        // StudentGroupIterator iterator = new StudentGroupIterator(studentGroup.getStudentList());
        // printListStudent(studentGroup);
        
        // StudentGroupService service = new StudentGroupService(studentGroup);
        // printListStudent(service.getSortedStudentGroup());

        System.out.println(student5.compareTo(student1));
        
    }

    static void printListStudent(Stream stream){
        /*цикл для Iteratora */
        // while (iterator.hasNext())
        //    System.out.println(iterator.next());

        /*цикл для Iterable */
        for (StudentGroup object : stream){
            System.out.println(object);
        }
    }
}