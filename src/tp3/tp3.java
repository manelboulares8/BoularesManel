package tp3;
public class tp3{
	private int jours;
	private int mois;
	private int annee;
	public tp3(int annee) {
		this.annee=annee;
		this.jours=1;
		this.mois=1;
	}
	public tp3(int jours, int mois, int annee) {
		this(annee);
        this.jours = jours;
        this.mois = mois;
        
	}
	@Override
	public String toString() {
    	return(jours+"/"+mois+"/"+annee);
    }
	public int getJours() {
        return jours;
    }

    public void setJours(int jours) {
        this.jours = jours;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
    private boolean estBissextile(int annee) {
        return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
    }
    
    private int joursDansLeMois(int mois, int annee) {
        switch (mois) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31; 
            case 4: case 6: case 9: case 11:
                return 30; 
            case 2:
                return estBissextile(annee) ? 29 : 28; 
            default:
                return 0; 
        }
    }
    public void ajouterUnJour() {
        if (jours < joursDansLeMois(mois, annee)) {
            jours++; 
        } else {
            jours = 1; 
            if (mois < 12) {
                mois++; 
            } else {
                mois = 1; 
                annee++; 
            }
        }
    }
    public void ajouterPlusieursJours(int n) {
    	for (int i = 0; i < n; i++) {
            ajouterUnJour(); 
        }
    
    }
    public void ajouterUnMois() {
    	if(this.mois<12) {
    		this.mois++;
    	}
    	else {
    		this.mois=1;
    		this.annee++;
    	}
    }
    
}
