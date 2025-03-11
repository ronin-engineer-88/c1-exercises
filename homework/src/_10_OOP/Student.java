package _10_OOP;

public class Student {
    private String studentId;
    private String fullName;
    private String address;
    private String email;
    private String phoneNumber;

    // Constructor không có tham số
    public Student() {
    }

    // Constructor có tham số
    public Student(String studentId, String fullName, String address, String email, String phoneNumber) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getter và Setter
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Hành động của sinh viên
    public void study() {
        System.out.println(fullName + " is studying.");
    }

    public void doHomework() {
        System.out.println(fullName + " is doing homework.");
    }

    public void payTuition() {
        System.out.println(fullName + " has paid tuition.");
    }

    public void takeExam() {
        System.out.println(fullName + " is taking an exam.");
    }

    public void printInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Full Name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public static void main(String[] args) {
        // Tạo danh sách sinh viên
        Student student1 = new Student("B22DCCN175", "Nguyen Van An", "Hanoi", "nva@gmail.com", "0123456789");
        Student student2 = new Student("B21DCCN102", "Tran Thi Linh", "Ho Chi Minh", "ttl@gmail.com", "0987654321");

        // Thực hiện các hành động
        student1.study();
        student1.doHomework();
        student1.payTuition();
        student1.takeExam();
        student1.printInfo();

        System.out.println("\n----------------------\n");

        student2.study();
        student2.doHomework();
        student2.payTuition();
        student2.takeExam();
        student2.printInfo();
    }
}

/*
Biểu diễn thông tin của Sinh viên gồm các đặc điểm sau:
1. Thông tin về sinh viên gồm: họ đệm tên, địa chỉ, email, số điện thoại, mã sinh viên(cả chữ và số, ví dụ B22DCCN175).
2. Hành động của sinh viên gồm: đi học, làm bài tập, nộp học phí, làm bài kiểm tra và cho biết thông tin đầy đủ của bản thân, các hàm
     tạo có và không có tham số, các phương thức get/set.
Nhập vào thông tin của một số đối tượng sinh viên sau đó cho sinh viên đó đi học, làm bài tập, nộp học phí,
     cung cấp thông tin đầy đủ của sinh viên đó khi thực hiện các chức năng vừa rồi.
*/
