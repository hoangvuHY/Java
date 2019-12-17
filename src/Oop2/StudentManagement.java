package Oop2;

public class StudentManagement {

    Student[] students;
    public int h = 0;

    public StudentManagement() {
        this.students = new Student[100];
        this.h = 0;
    }

    public static boolean sameGroup(Student s1, Student s2) {
        if ((s1.getGroup()).equals(s2.getGroup())) {
            return true;
        } else return false;
    }

    public void addStudent(Student newStudent) {
        if (h == 100) {
            System.out.println("ERROR");
        } else {
            students[h] = newStudent;
            h++;
        }
    }

    /*    public String studentsByGroup() {
            String s = "";
            for(int i = 0; i< h; i++){
                if(s.indexOf(students[i].getGroup()) == -1){
                    s += students[i].getGroup()+ "\n" + students[i].getInfo() + "\n";

                    for(int j = i + 1; j < h; j++){
                        if( sameGroup(students[i], students[j]) == true){
                            s += students[j].getInfo() + "\n";
                        }
                    }
                }
            }
            if(s.equals("") == true)
                return null;
            return s;
        }*/
    public String studentsByGroup() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < h; i++) {
            if (!s.toString().contains(students[i].getGroup())) {
                s.append(students[i].getGroup()).append("\n").append(students[i].getInfo()).append("\n");
                for (int j = i + 1; j < h; j++) {
                    if (sameGroup(students[i], students[j])) {
                        s.append(students[j].getInfo()).append("\n");
                    }
                }
            }
        }
        if (s.toString().equals(""))
            return null;
        return s.toString();
    }

    /*public void removeStudent(String id) {
        for (int i = 0; i < h; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < h - 1; j++) {
                    students[j] = students[j + 1];
                }
                h--;
                break;
            }
        }
    }*/
    public void removeStudent(String id) {
        for (int i = 0; i < h; i++) {
            if (students[i].getId().equals(id)) {
                if (h - 1 - i >= 0) System.arraycopy(students, i + 1, students, i, h - 1 - i);
                h--;
                break;
            }
        }
    }

    public static void main(String[] args) {

    }
}