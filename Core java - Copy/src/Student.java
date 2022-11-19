



		public class Student {
			
int id;

        String name;

        String address;

        int marks[];

    

public Student(String Name,String Address, int Marks[]) {

                name = Name;

                address= Address; 

                marks=Marks;

        }

        public static void main(String[] args) {

                

                int marks[] = {77,89,69};

                Student student1 = new Student("manu","Hyderabad",marks);

                System.out.println( marks );

        }
			
}
		
	