package assignment2;

public class StudentTestMain {
    public static void main(String[] args) {
        Student st = new Student("Sourav", "0344");

        System.out.println("Student Name is : " + st.getStudentName());
        System.out.println("Student Id is : " + st.getStudentId());
        st.setStudentName("pap");
        System.out.println("Student Name is : " + st.getStudentName());
        st.setStudentId("033");
        System.out.println("Student Id is : " + st.getStudentId());
        System.out.println(st.changeStudentName("Pap"));
        System.out.println("Student Name is : " + st.getStudentName());
        st.addCredits(300);
        System.out.println("Credit Points : " + st.getCredits());

    }
}
