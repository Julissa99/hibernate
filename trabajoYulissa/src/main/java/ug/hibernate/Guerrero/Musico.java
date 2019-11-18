package ug.hibernate.Guerrero;
import java.util.Date;
import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="musicos")
public class Musico{
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name ="idMusico")
	private long id;
	
	private String  nombre;
	
	private String instrumento;
	
	@Column(name ="lugar_nacimiento")
	private String lugarNacimiento;
	
	
	@Column(name ="fecha_nac")
	private Date fechaNac;
	
	
	private String biografia;


	
	
	public Musico() {
		
	}




	public Musico(long id, String nombre, String instrumento, String lugarNacimiento, Date fechaNac, String biografia) {
		this.id = id;
		this.nombre = nombre;
		this.instrumento = instrumento;
		this.lugarNacimiento = lugarNacimiento;
		this.fechaNac = fechaNac;
		this.biografia = biografia;
	}  
	
	
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getInstrumento() {
		return instrumento;
	}


	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}


	public String getLugarNacimiento() {
		return lugarNacimiento;
	}


	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}


	public Date getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}


	public String getBiografia() {
		return biografia;
	}


	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}


	
	
	

	
	
	
}
