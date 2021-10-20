package com.basic;

public class Faculty extends Person{
//Faculty: firstname,lastname,exp,sme
private int expYear;
private String sme;


public Faculty(String fname,String lname ,int expYear, String sme) {
	super(fname,lname);
	this.expYear = expYear;
	this.sme = sme;
	System.out.println("Faculty param ctor ");
}


@Override
public String toString() {
	return "Faculty ["+super.toString()+" expYear=" + expYear + ", sme=" + sme + "]";
}

public void showEventResult()
{
	System.out.println("------Faculty's Event Result------");
}
	
	
}
