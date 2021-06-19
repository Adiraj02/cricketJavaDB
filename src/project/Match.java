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
public class Match {
    private int match_id;
    private String mdate;
    private  String teams;
    private String venue; 
   
    public Match(int a, String b,String c, String d)
    {
        this.match_id = a;
        this.mdate = b;
        this.teams = c;
        this.venue = d;
        
    }
    
    public int getId()
    {
        return match_id;
    }
    
    public String getDate()
    {
        return mdate;
    }
    
    public String getTeams()
    {
        return teams;
    }
    
    public String getVenue()
    {
        return venue;
    }
    
}
