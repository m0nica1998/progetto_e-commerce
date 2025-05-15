package entita;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

//marcatori
@Entity
@Table(name = "items")
public class Ordine {

	@Id 
	//da un valore autoincrementante in automatico all'id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(precision = 10, scale = 2,
		    nullable = false
		   
		    
		)
	private BigDecimal prezzo;
	
	@Column(nullable = false)
    @NotNull(message = "La data di nascita è obbligatoria")
    @Past(message = "La data di nascita deve essere nel passato")
	private LocalDate data;
	
	//costruttore
	public Ordine() {
		
	}

	//getter e setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
}
