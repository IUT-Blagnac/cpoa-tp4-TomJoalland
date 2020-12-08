package application.action;

import banque.AgenceBancaire;

public class ActionListeDesComptes implements Action{
	
	String message;
	String code;
	
	public ActionListeDesComptes() {
		// TODO Auto-generated constructor stub
	}
	
	public ActionListeDesComptes(String msg, String mdp) {
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

	@Override
	public void execute(AgenceBancaire ag) throws Exception {
		ag.afficher();
	}

}
