package application.action;

import java.util.Scanner;

import banque.AgenceBancaire;
import banque.Compte;

public class ActionVoirCompteNumero implements Action{
	
	String message;
	String code;
	
	public ActionVoirCompteNumero() {
		// TODO Auto-generated constructor stub
	}
	
	public ActionVoirCompteNumero(String msg, String mdp) {
		this.message = msg;
		this.code = mdp;
	}
	
	@Override
	public String actionMessage() {
		return this.message;
	}

	@Override
	public String actionCode() {
		return this.code;
	}

	@SuppressWarnings("resource")
	@Override
	public void execute(AgenceBancaire ag) throws Exception {
		Scanner lect ;
		lect = new Scanner (System.in );
		System.out.print("Num compte -> ");
		String numero = lect.next();
		Compte c = ag.getCompte(numero);
		if (c==null) {
			System.out.println("Compte inexistant ...");
		} else {
			c.afficher();
		}
		
	}

}
