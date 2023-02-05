package Assignment_2;

public class Student {
    private String studentId;
    private String studentName;
    private int creditPoints;

    public Student(String studentName, String studentId){
        this.studentName = studentName;
        this.studentId = studentId;
    }


    public void setStudentName(String studentName){
        if(studentName.length() >= 4){
            this.studentName = studentName;
        }
        else{
            throw new IllegalArgumentException("Name is not valid ! You must be enter minimum 4 character");
        }
    }
    public void setStudentId(String studentId){
        if(studentId.length() >= 3){
            this.studentId = studentId;
        }
        else{
            throw new IllegalArgumentException("Id is not valid ! You must be enter minimum 3 character");
        }
    }

    //qs. b combination
    public void  getLoginName(){};

    //qs.c
    public String changeStudentName(String newName){
        return this.studentName = newName;
    }
    //qs.d
    public String getStudentName(){
        return studentName;
    }
    public String getStudentId(){
        return studentId;
    }
    //qs.e
    public int addCredits(int newPoints){
        return creditPoints += newPoints;
    }
    //qs.f
    public int getCredits(){
        return creditPoints;
    }
}

