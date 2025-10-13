package com.nt.sbeans;


public class App {
	
	public int sum(int x,int y)
	{
		return x+y;
	}
    public static void main(String[] args) {
    	
    	App app=new App();
    	System.out.println("resukt"+app.sum(3, 5));
        
    }
}
