package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
   public boolean login(String username, String passwd){
       boolean login_status = false;
     if(username.equals("admin")&& passwd.equals("admin"))
     {
             login_status=true;
            
     }else if(!username.equals("admin")&&!passwd.equals("admin")){
                
                  login_status=false;
     }
            return login_status;
   }

}
