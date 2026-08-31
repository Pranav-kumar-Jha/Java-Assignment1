class StudentInfo {
    // Attributes
    int rollNo;
    String name;
    String course;
    int marks;

    // Method to display student information
    void displayInfo() {
        System.out.println("Student Information");
        System.out.println("-------------------");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Course  : " + course);
        System.out.println("Marks   : " + marks);
    }

    public static void main(String args[]) {
        // Creating object
        StudentInfo s = new StudentInfo();

        // Assigning values
        s.rollNo = 101;
        s.name = "Pranav";
        s.course = "MCA";
        s.marks = 85;

        // Calling method
        s.displayInfo();
    }
}