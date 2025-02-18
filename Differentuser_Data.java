import java.util.Scanner;
class  Differentuser_Data
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Mobile Number");
		long mobilenumber = sc.nextLong();

		System.out.println("Enter your age");
		int age = sc.nextInt();

		System.out.println("Enter your blood type");
		String blood = sc.next();

		System.out.println("Enter your height");
		double height = sc.nextDouble();

		System.out.println("Enter your name");
		String name = sc.next();

		System.out.println("*********************************");

		System.out.println(mobilenumber);
		System.out.println(age);
		System.out.println(blood);
		System.out.println(height);
		System.out.println(name);
	}
}
