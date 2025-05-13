package entita;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

//marcatore
@Entity
@Table(name = "users")
public class Utente {

	
	@Id 
	//da un valore autoincrementante in automatico all'id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(
		    nullable = false,
		    length = 255
		   
		    
		)
	private String nome;
	@Column(
		    nullable = false
		    
		   
		    
		)
	private int eta;
	@Column(nullable = false)
    @NotNull(message = "La data di nascita è obbligatoria")
    @Past(message = "La data di nascita deve essere nel passato")
	private LocalDate data;
	@Column(
		    nullable = false,
		    length = 255
		   
		    
		)
	private String numero;
	  @Column(
			  nullable = false,
			  unique = true
			  ) // JPA: obbligatorio + univoco
	    @Email(message = "Formato email non valido") // Bean Validation
	    @NotBlank(message = "L'email è obbligatoria") // Bean Validation
	  private String email;
	  @Column(nullable = false)
	    @NotBlank(message = "La password è obbligatoria")
	    @Size(min = 8, max = 100, message = "La password deve essere lunga almeno 8 caratteri")
	private String password;
	@Column(
		    nullable = false
		    
		   
		    
		)
	private boolean genere;
	@Column(
		    nullable = false,
		    length = 255
		   
		    
		)
	private String regione;
	@Column(
		    nullable = false
		   
		   
		    
		)
	private boolean isAdmin = false;
	
	
	//costruttore
	public Utente() {
		
		
	}

	//getter e setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isGenere() {
		return genere;
	}

	public void setGenere(boolean genere) {
		this.genere = genere;
	}

	public String getRegione() {
		return regione;
	}

	public void setRegione(String regione) {
		this.regione = regione;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
}
