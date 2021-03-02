class Main {
  public static void main(String[] args) {
    Student student1 = new Student();

    student1.setName("Arnold Speilberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");

    System.out.println("student 1's name is " + student1.getName() + " and their GPA is " + student1.getGPA() + " and their major is " + student1.getMajor());
  }
}