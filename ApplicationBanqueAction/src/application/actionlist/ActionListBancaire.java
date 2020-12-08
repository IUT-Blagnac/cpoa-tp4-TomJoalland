package application.actionlist;

import application.action.Action;
import application.action.ActionList;
import banque.AgenceBancaire;

public class ActionListBancaire implements ActionList{
	
	String message;
	String code;
	String title;
	String[] listeAction;
	
	public ActionListBancaire() {
		// TODO Auto-generated constructor stub
	}
	
	public ActionListBancaire(String msg, String mdp, String titre, String[] list) {
		this.message = msg;
		this.code = mdp;
		this.title = titre;
		this.listeAction = list;
	}
	
	@Override
	public String actionMessage() {
		return this.message;
	}

	@Override
	public String actionCode() {
		return this.code;
	}

	@Override
	public void execute(AgenceBancaire ag) throws Exception {
		System.out.println("Menu de " + ag.getNomAgence() + " (" + ag.getLocAgence() + ")");
		System.out.println("1 - Liste des comptes de l'agence");
		System.out.println("2 - Voir un compte (par son numéro)");
		System.out.println("3 - voir les comptes d'un Propriétaire (par son nom)");
		System.out.println("4 - Déposer de l'argent sur un compte");
		System.out.println("5 - Retirer de l'argent sur un compte");
		System.out.println("0 - Quitter");
		System.out.print("Choix -> ");
		
	}

	@Override
	public String listTitle() {
		return this.title;
	}

	@Override
	public int size() {
		return this.listeAction.length;
	}

	@Override
	public boolean addAction(Action ac) {
		// TODO Auto-generated method stub
		return false;
	}

}
