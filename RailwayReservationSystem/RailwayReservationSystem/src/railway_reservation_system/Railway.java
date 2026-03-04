package railway_reservation_system;


import java.util.Scanner;

public class Railway 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		boolean start=true;
		
		while(start)
		{
			System.out.println("Select Options: \n 1.Book Ticket \n 2.Update Destination \n 3.Find Ticket \n 4.Cancel Ticket \n 5.Find All \n 6.Exit");
			System.out.println("Select Your Choice: ");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				{
					RailwayInsert.insert();
				}
				break;
				case 2:
				{
					RailwayUpdate.update();
				}
				break;
				case 3:
				{
					RailwayFind.find();
				}
				break;
				case 4:
				{
					RailwayDelete.cancel();
				}
				break;
				case 5:
				{
					RailwayFindALL.findAll();
				}
				break;
				case 6:
				{
					start = false;
					System.out.println("Thank You ...");
				}
				break;
				default:
				{
					System.out.println("Please Enter Valid Choice.....");
				}
			}
				
		}
	}
		
}


