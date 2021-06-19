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
public class MatchReport {
    private int match_id;
    private String result;
    private  String mom;
   
    public MatchReport(int a, String b,String c)
    {
        this.match_id = a;
        this.result = b;
        this.mom = c;
        
    }
    
    public int getId()
    {
        return match_id;
    }
    
    public String getResult()
    {
        return result;
    }
    
    public String getMOM()
    {
        return mom;
    }
   
}
