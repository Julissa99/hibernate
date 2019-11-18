package ug.hibernate.Guerrero;


import java.util.Date;



public class Principal{

	
	
	public  static void  imprimir(String mensaje){
		System.out.println(mensaje);
		
	}
	
	
	
	public static void main(String[] args){
		
		crear();
		update();
		delete();
		
		
	}
	
	
	
	/*this.id = id;
		this.nombre = nombre;
		this.instrumento = instrumento;
		this.lugarNacimiento = lugarNacimiento;
		this.fechaNac = fechaNac;
		this.biografia = biografia;*/
	
	public static void crear(){
		DaoMusico daoMusico = new DaoMusico();
		@SuppressWarnings("deprecation")
		Musico musico1 = new Musico(0,"enrique ","violin","argentina",new Date("1950/11/20"),"era alguien imperativo");		
		daoMusico.setup();
		daoMusico.crear(musico1);
		
		@SuppressWarnings("deprecation")
		Musico musico2 = new Musico(0,"romeo ","guitarra","argentina",new Date("1950/11/20"),"era alguien imperativo");		
		daoMusico.crear(musico2);
		
		
	}
	
	
	
	
	public static void update(){

		DaoMusico daoMusico = new DaoMusico();
		daoMusico .setup();
		Musico musico =daoMusico.read(1);
		musico.setNombre("xd");
		daoMusico.update(musico);
		
		
	}
	

	public static void delete(){
		DaoMusico daoMusico = new DaoMusico();
		daoMusico .setup();
		daoMusico .delete(2);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
