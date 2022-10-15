package com.example;


import org.testng.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   
    App ap1 = new App();
    
    @org.testng.annotations.Test
    void test1(){
      
        boolean status =  ap1.login("admin", "admin");
         Assert.assertEquals(status, true);
    }    
    void test2(){

        boolean status =  ap1.login("admin1234", "admin12");
         Assert.assertEquals(status, false);
    }
}
