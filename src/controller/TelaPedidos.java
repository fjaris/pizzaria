package controller;

import javafx.event.ActionEvent;
import view.Telas;

public class TelaPedidos {
	public void adicionais(ActionEvent event) {
		  try {
			  Telas.adicionais();
		  } catch (Exception e) {
			  e.printStackTrace();
		  }
	  }
	  
	  public void estoque(ActionEvent event) {
		  try {
			  Telas.estoque();
		  } catch (Exception e) {
			  e.printStackTrace();
		  }
	  }
	  
	  public void clientes(ActionEvent event) {
		  try {
			  Telas.clientes();
		  } catch (Exception e) {
			  e.printStackTrace();
		  }
	  }
	  
	  public void pizzas(ActionEvent event) {
		  try {
			  Telas.pizzas();
		  } catch (Exception e) {
			  e.printStackTrace();
		  }
	  }
}
