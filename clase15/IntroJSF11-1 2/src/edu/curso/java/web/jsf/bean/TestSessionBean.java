package edu.curso.java.web.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

public class TestSessionBean implements Serializable {

	private Date now = new Date();
	private String itemValue = "1";
	private String[] itemValues;
	public String[] getItemValues() {
		return itemValues;
	}

	public void setItemValues(String[] itemValues) {
		this.itemValues = itemValues;
	}

	private String text = "";
	
	public TestSessionBean() {
		System.out.println("Creando el objeto TestSessionBean");
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getItemValue() {
		return itemValue;
	}

	public void setItemValue(String itemValue) {
		this.itemValue = itemValue;
	}
	
	public Date getNow() {
		return now;
	}

	public void setNow(Date now) {
		this.now = now;
	}

	public List<SelectItem> getItemList() {
		ArrayList<SelectItem> items = new ArrayList<SelectItem>();
		items.add(new SelectItem("1", "Uno"));
		items.add(new SelectItem("2", "Dos"));
		items.add(new SelectItem("3", "Tres"));
		items.add(new SelectItem("4", "Cuatro"));
		return items;
	}

	public void testValueChange(ValueChangeEvent value) {
		System.out.println("testValueChange()");
		String selectedValue = (String)value.getNewValue();
		itemValue = selectedValue;
		FacesContext.getCurrentInstance().renderResponse();
	}
	
	public String save() {
		System.out.println("Ejecutando save");
		ExternalContext context = FacesContext.getCurrentInstance()
		.getExternalContext();
		context.getSessionMap().remove("testSessionBean");
		return null;
	}
}
