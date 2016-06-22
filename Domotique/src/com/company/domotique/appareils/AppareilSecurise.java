package com.company.domotique.appareils;

public class AppareilSecurise extends AppareilThermostate {
 protected boolean isSecuriteEnclenchee= false;
 
 
 public boolean isSecuriteEnclenchee() {
		return isSecuriteEnclenchee;
	}
	public void setSecuriteEnclenchee(boolean isSecuriteEnclenchee) {
		this.isSecuriteEnclenchee = isSecuriteEnclenchee;
	}
	
	public AppareilSecurise(String pMarque, String pModele, int pPuissance, int pValeurThermostatMax,
			int pIncPuissance, boolean pisSecuriteEnclenchee) {
		super(pMarque, pModele, pPuissance, pValeurThermostatMax, pIncPuissance);
        
		// TODO Auto-generated constructor stub
		this.setSecuriteEnclenchee(pisSecuriteEnclenchee);
	
	
	}
 
public void demarrer() {
				if (!isSecuriteEnclenchee){
				super.demarrer();
				}else{
			System.err.println("erreur securité ");
			}
	}
	
 public void desenclencheSecurite(){
	 this.isSecuriteEnclenchee=false;
		 
	}
		
 public void enclencheSecurite(){ 
	 this.isSecuriteEnclenchee=true;
	 
	 
 }
@Override
public String toString() {
	return super.toString()+"AppareilSecurise [isSecuriteEnclenchee=" + isSecuriteEnclenchee + "]";
}
  

public void ouvirPorte(){
	
	this.enclencheSecurite();
	
}
public void fermerPorte(){
	
	this.desenclencheSecurite();
	
	
}
 
}
