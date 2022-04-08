package array;

public class Exg8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student1[]arr;
arr=new Student1[5];
arr[0]=new Student1(1,"Swathi");
arr[1]=new Student1(2,"Chaitra");
arr[1]=new Student1(3,"Aishu");
arr[1]=new Student1(2,"Thanu");
arr[1]=new Student1(2,"Varshitha");
for (int i=0;i<arr.length;i++)
	System.out.println("Element at"+i+":"arr[i].roll_no+""+arr[i].name);
}

}
