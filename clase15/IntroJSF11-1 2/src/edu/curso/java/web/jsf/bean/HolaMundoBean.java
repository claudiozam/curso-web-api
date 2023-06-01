package edu.curso.java.web.jsf.bean;

public class HolaMundoBean {

	private String texto = "";
	private String textSaludoFinal = "";

	public String getTextSaludoFinal() {
		return textSaludoFinal;
	}

	public void setTextSaludoFinal(String textSaludoFinal) {
		this.textSaludoFinal = textSaludoFinal;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String saludar() {
		System.out.println("Ejecutando saludar");
		textSaludoFinal = texto + " - Hola Mundo!!!!";
		return "";
	}


}
