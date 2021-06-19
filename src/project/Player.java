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
public class Player {
   

    private int player_id;
    private String player_name;
    private String player_rank;
    private String player_debut; 
    private byte[] pimage;
    private String player_type; 
    private String country_name; 

        public Player(int pid, String pname, String prank, String pdebut, byte[] pimg,String ptype,String cname)
    {
        this.player_id = pid;
        this.player_name = pname;
        this.player_rank = prank;
        this.player_debut = pdebut;
        this.pimage = pimg;
        this.player_type=ptype;
        this.country_name=cname;
    }
        public int getId()
    {
        return player_id;
    }
    
    public String getName()
    {
        return player_name;
    }
    
    public String getRank()
    {
        return player_rank;
    }
    
    public String getAddDate()
    {
        return  player_debut;
    }
    
    public byte[] getImage()
    {
        return pimage;
    }
     public String getType()
    {
        return  player_type;
    }
      public String getCountry()
    {
        return  country_name;
    }
}
