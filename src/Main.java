import java.util.*;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

    class Student {
        private String name;
        private int course;
        private int marks;

        public Student(String name,  int course, int marks) {
            this.name = name;
            this.course = course;
            this.marks = marks;
        }
        public String getName() {
            return name;
        }
        public double getMarks() {
            return marks;
        }
        public int getCourse() {
            return course;
        }
        public void setCourse(int course) {
            this.course = course;
        }
        @Override
        public String toString() {
            return "name='" + name + '\'' +
                    ", course=" + course +
                    ", grades=" + marks;
        }
    }

        public class Main {

            public static void DeleteStudents() {
                DeleteStudents(null);
            }

            public static void DeleteStudents(Set<Student> students) {
                Iterator<Student> iterator = students.iterator();
                while (iterator.hasNext()) {
                    Student student = iterator.next();
                    if (student.getMarks() < 3.0) {
                        iterator.remove();
                }
            }
        }

            public static void promoteStudents(Set<Student> students) {
                for (Student student : students) {
                    if (student.getMarks() >= 3.0) {
                    student.setCourse(student.getCourse() + 1);
                        System.out.println(student);
                }
            }
        }


    public static void main(String[] args) {
        Set<Student> Student = new HashSet<>();

       //System.out.println("Начальная группа");

       Student.add(new Student("Иванов", 1, 1));
       Student.add(new Student("Петров", 2,  8));
       Student.add(new Student("Сидоров", 3, 10));

        System.out.println("Итоговая группа");

        DeleteStudents(Student);
        promoteStudents(Student);

    }
    }

