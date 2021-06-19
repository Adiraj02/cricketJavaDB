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
public class PAc {
    private int player_id;
    private String player_name;
    private String player_rank;
    private int total_runs; 
    private int total_wickets;
    private int hs; 
    private String bwi; 
    private int inn; 
    private int avg; 
    

        public PAc(int pid, String pname, String prank,int runs,int wickets,int hs,String bwi,int in,int av)
    {
        this.player_id = pid;
        this.player_name = pname;
        this.player_rank = prank;
        this.total_runs = runs;
        this.total_wickets = wickets;
        this.hs=hs;
        this.bwi=bwi;
        this.inn=in;
        this.avg=av;
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
    
    public int getRun()
    {
        return  total_runs;
    }
    
    public int getWicket()
    {
        return total_wickets;
    }
     public int getHS()
    {
        return  hs;
    }
      public String getBWI()
    {
        return  bwi;
    }
      public int getInning()
    {
        return  inn;
    }
      public int getAverage()
    {
        return  avg;
    }
    
}
