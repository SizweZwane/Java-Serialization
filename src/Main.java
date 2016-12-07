import java.io.*;

/**
 * Created by HP on 2016/12/07.
 */
public class Main {

    public static void main(String arg[]) throws IOException, ClassNotFoundException {

        // Serialization
        Student[] students = new Student[3];
        students[0] = new Student(201431430, "Sizwe I. Zwane");
        students[1] = new Student(201431123, "Lethabo Motala");
        students[2] = new Student(201535365, "Stranger LoLs");
        //Student student = new Student(201431430, "Sizwe I. Zwane");
        FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(students);
        objectOutputStream.flush();
        System.out.println("Done Saving \n");

        // Deserialization
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("file.txt"));
        Student[] s = (Student[]) objectInputStream.readObject();
        for (Student student : s) {
            System.out.println("Id: " + student.studentId);
            System.out.println("Name and Surname: " + student.studentName + "\n");
        }
        objectInputStream.close();
    }
}
