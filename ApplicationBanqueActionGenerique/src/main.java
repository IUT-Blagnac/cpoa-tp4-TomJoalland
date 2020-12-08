import application.action.ActionListeDesComptes;
import application.action.ActionVoirCompteNumero;
import application.actionlist.ActionListBancaire;
import banque.AgenceBancaire;

public class main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		AgenceBancaire ag = new AgenceBancaire("Jean-Luc", "Funafuti");
		
		//Instance Action
		ActionListeDesComptes listCompte = new ActionListeDesComptes();
		ActionVoirCompteNumero listNumCompte = new ActionVoirCompteNumero();
		
		//Instance ActionListAgenceBancaire
		ActionListBancaire listBanque = new ActionListBancaire();
		
		//Lancer execute()
		try {
			listBanque.execute(ag);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
