
package projecthotelmanagement;

import java.util.*;
import java.io.*;

public class Write implements Runnable {
    
    Holder hotel_ob;
    Write(Holder hotel_ob)
    {
        this.hotel_ob=hotel_ob;
    }
    @Override
    public void run() {
          try{
            FileOutputStream fout =new FileOutputStream("backup.dat");
            ObjectOutputStream oos =new ObjectOutputStream(fout);
            oos.writeObject(hotel_ob);
        }
        catch(Exception e)
        {
            System.out.println("Error in writing "+e);
        }         
        
    }
    
}
