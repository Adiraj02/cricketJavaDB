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
public class CAc {
    private int cid;
    private String country_name;
    private int country_rank;
    private String country_achievement; 
   
    public CAc(int cid, String cname,int rank, String ach)
    {
        this.cid = cid;
        this.country_name = cname;
        this.country_rank = rank;
        this.country_achievement = ach;
        
    }
    
    public int getId()
    {
        return cid;
    }
    
    public String getName()
    {
        return country_name;
    }
    
    public int getRank()
    {
        return country_rank;
    }
    
    public String getAchievement()
    {
        return  country_achievement;
    }
     
}
