
public class RoomHandler{
  static int roomnumbers = 0;
  public RoomHandler(String Roomname,int Roomnumber,Object event){
    roomnumbers = roomnumbers + 1;
    
  }
  
  public void room(Object event){
    int roomending = event();
    
  }
}
