package fr.formation.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class DecisionBean {

	public String calcul() {
		return Math.random() < 0.99 ? "success" : "echec";
	}
}
