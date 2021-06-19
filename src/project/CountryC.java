/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Aditya
 */
public class CountryC {
    private String country_name;
    private int country_rank;
    private byte[] country_flag;
    private String country_type; 
     

        public CountryC(String cname, int crank, byte[] cimg,String ctype)
    {
        this.country_name=cname;
        this.country_rank = crank;
        this.country_flag = cimg;
        this.country_type=ctype;
        
    }
      
    public String getName()
    {
        return country_name;
    }
    
    public int getRank()
    {
        return country_rank;
    }
   
    public byte[] getImage()
    {
        return country_flag;
    }
     public String getType()
    {
        return  country_type;
    }
     
}
