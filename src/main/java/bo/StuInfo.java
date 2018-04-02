package bo;

public class StuInfo {
    int id_stu;
    int age;

    public StuInfo(int id_stu, int age) {
        this.id_stu = id_stu;
        this.age = age;
    }

    public int getId_stu() {
        return id_stu;
    }

    public void setId_stu(int id_stu) {
        this.id_stu = id_stu;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
