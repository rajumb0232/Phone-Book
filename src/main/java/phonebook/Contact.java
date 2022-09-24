package phonebook;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity  // creates table
public class Contact {
	@Id  //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //generates definite id for each object.
   private int id;
	private String name;
	   private Long Phno;
   public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhno() {
		return Phno;
	}
	public void setPhno(Long phno) {
		Phno = phno;
	}

}
