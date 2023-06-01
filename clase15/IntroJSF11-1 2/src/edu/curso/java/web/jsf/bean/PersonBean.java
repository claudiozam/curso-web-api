package edu.curso.java.web.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.curso.java.web.jsf.bo.Person;
import edu.curso.java.web.jsf.manager.PersonManager;

public class PersonBean { // implements Serializable en el caso de usar el Bean
	
	private String firstName = "";
	private String lastName = "";
	private long age;
	private String sex = "M";
	private String generalMsg = "";
	private String email = "";
	private int idPerson = -1;

	public PersonBean() {
		System.out.println("Creando el objeto PersonBean");
	}
	
	
	public int getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGeneralMsg() {
		return generalMsg;
	}

	public void setGeneralMsg(String generalMsg) {
		this.generalMsg = generalMsg;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public List<SelectItem> getSexList() {
		ArrayList<SelectItem> items = new ArrayList<SelectItem>();
		items.add(new SelectItem("M", "Hombre"));
		items.add(new SelectItem("F", "Mujer"));
		return items;
	}

	public String saveNewPerson() {
		System.out.println("Ejecutando saveNewPerson");

		PersonManager personManager = new PersonManager();
		Person person = new Person();
		person.setAge(0);
		person.setEmail(email);
		person.setFirstName(firstName);
		person.setLastName(lastName);

		try {
			if (idPerson == -1) {
				idPerson = personManager.createNewPerson(person);
				generalMsg = "Nueva persona generada con el Id = " + idPerson;
			} else {
				System.out.println("Ejecutando saveNewPerson pero para update");
				personManager.updatePerson(person);
			}
		} catch (Exception e) {
			generalMsg = "Error en el alta de la persona";
			e.printStackTrace();
		}
		return "viewPerson";
	}

	public String viewPerson() {
		System.out.println("Ejecutando viewPerson");

		PersonManager personManager = new PersonManager();

		ExternalContext context = FacesContext.getCurrentInstance()
				.getExternalContext();

		HttpServletRequest request = (HttpServletRequest) context.getRequest();

		try {
			Person person = personManager.getPerson(Integer.parseInt(request
					.getParameter("idPerson")));
			firstName = person.getFirstName();
			lastName = person.getLastName();
			idPerson = person.getId();
			email = person.getEmail();
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "viewPerson";
	}

	public String editPerson() {
		System.out.println("Ejecutando editPerson");

		PersonManager personManager = new PersonManager();

		try {
			Person person = personManager.getPerson(idPerson);
			firstName = person.getFirstName();
			lastName = person.getLastName();
			idPerson = person.getId();
			email = person.getEmail();
			// etc etc
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "editPerson";
	}

	public List<Person> getPersonList() {
		PersonManager personManager = new PersonManager();
		try {
			return personManager.getPersonList();
		} catch (Exception e) {
			generalMsg = "Error en listado de las personas";
			e.printStackTrace();
		}
		return null;

	}

}
