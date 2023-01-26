
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student anupap = new Student("Anupap Jaising","1 Happy Ave");
		System.out.print(anupap);
		
		anupap.setAddress("25 Pattanakarn");
		System.out.println(anupap);
		System.out.println(anupap.getName());
		System.out.println(anupap.getAddress());
		
		anupap.addCourseGrade("INT107",87);
		anupap.addCourseGrade("INT108",81);
		anupap.addCourseGrade("MSC-202",92);
		anupap.printGrades();
		
		System.out.printf("The average grade is %.2f%n",anupap.getAverageGrade());

	}

}
