package entita;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

//marcatori
@Entity
@Table(name = "items")
public class Prodotto {
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
		    nullable = false,
		    length = 255
		   
		    
		)
	private String tipo;
	@Column(precision = 10, scale = 2,
		    nullable = false
		   
		    
		)
	private BigDecimal prezzo;
	
	@Column(
		    nullable = false
		   
		   
		    
		)
	private String filename;
	@Column(
		    nullable = false
		    
		   
		    
		)
	private String fileType;
	 
	@Lob
	private byte[] data;
	@Column(
		    nullable = false
		  
		   
		    
		)
	private int disp_magazzino;
	
	//costruttore
	public Prodotto() {
		
	}

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public int getDisp_magazzino() {
		return disp_magazzino;
	}

	public void setDisp_magazzino(int disp_magazzino) {
		this.disp_magazzino = disp_magazzino;
	}
	
	//getter e setter
}
