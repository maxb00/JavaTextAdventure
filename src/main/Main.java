package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("Made by Liam Pierce and Alex Hiser (Code), and Max Barlow (Story).")
		RoomHandler RH = new RoomHandler();
		boolean gamerunning = true;
		
		dotype("You sit eating your eggs and toast, as the sun rises over the hill.",20")
		
		 
		
		while (gamerunning){
		//	RH.room()
			
		}
		
	}
	
	public void print(String print){
		System.out.println(print);
	}
	
	
	public void dotype(String long_string,int catchtime){
		for (int i = 0; i <= long_string.length();i++){
			System.out.print(long_string.ChatAt(i));
			try{
				Thread.Sleep(catchtime);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
	}

}
