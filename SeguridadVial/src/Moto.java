//en este caso ya que vehiculo implementa de iseguridad no hace falta ponerlo ya que sino saldria un error
//extiende de la clase Vehiculo que ya implementa Iseguridad
public class Moto extends Vehiculo  {
	
	private Boolean EspejoRetrovisores;
	private int Velocidad;
	private int VelocidadFinal = 160;

	@Override
	public Boolean EsSeguro() {
		//return null sale primero
		
		return getEspejoRetrovisores() && (getVelocidad() < getVelocidadFinal());
	}

	
	
	public Boolean getEspejoRetrovisores() {
		return EspejoRetrovisores;
	}

	public void setEspejoRetrovisores(Boolean espejoRetrovisores) {
		EspejoRetrovisores = espejoRetrovisores;
	}

	public int getVelocidad() {
		return Velocidad;
	}

	public void setVelocidad(int velocidad) {
		Velocidad = velocidad;
	}


	public int getVelocidadFinal() {
		return VelocidadFinal;
	}



	public void setVelocidadFinal(int velocidadFinal) {
		VelocidadFinal = velocidadFinal;
	}

	
	
	public Moto() {
		
	}
	
	public Moto(int Velocidad){
		
		this.setVelocidad(Velocidad);
		
	}
	
}
