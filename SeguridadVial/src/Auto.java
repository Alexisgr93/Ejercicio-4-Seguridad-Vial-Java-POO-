//en este caso ya que vehiculo implementa de iseguridad no hace falta ponerlo ya que sino saldria un error
//extiende de la clase Vehiculo que ya implementa Iseguridad

public class Auto extends Vehiculo{
	
	
	//La velocidad de un auto se calcula como un factor de velocidad de 100 Km/hr
	private int Velocidad = 100;//se genera un get and setter
	
	//su velocidad final no supera los 140 Km/hr.
	private int VelocidadMaxima = 140;//se genera un get and setter
	
	//más un plus de velocidad propio de cada uno.
	private int PlusVelocidad;//se genera un get and setter
	
	//Un auto es seguro si tiene rueda de auxilio
	private Boolean RuedaDeAuxilio;//se genera un get and setter
	
	
	
	//hay que apretar cuando se genera el error y sale tal cual pero con un RETURN NULL!! por el Booleano creado en ISeguridad
	@Override
	public Boolean EsSeguro() {
		// TODO Auto-generated method stub
		//return null;
		//Metodo para obtener un return false o true
		//cuando se generan los atributos se modifica el return para agregar las variables
		// si tiene rueda de auxilio y la velocidad final es menor a la velocidad maxima (true) de lo contrario seria false
		return getRuedaDeAuxilio() && (getVelocidadFinal() < this.VelocidadMaxima);
	}
	
	
	
	
	//get and setter generados automaticamente de Velocidad
	public int getVelocidad() {
		return Velocidad;
	}


	public void setVelocidad(int velocidad) {
		Velocidad = velocidad;
	}
	
		
		
	
	//get and setter generados automaticamente de VelocidadMaxima	
	public int getVelocidadMaxima() {
		return VelocidadMaxima;
	}


	public void setVelocidadMaxima(int velocidadMaxima) {
		VelocidadMaxima = velocidadMaxima;
	}
		
		
		
		
	//get and setter generados automaticamente de PlusVelocidad
	public int getPlusVelocidad() {
		return PlusVelocidad;
	}

	public void setPlusVelocidad(int plusVelocidad) {
		PlusVelocidad = plusVelocidad;
	}	
		
	
	
	
	//get and setter generados automaticamente de RuedaDeAuxilio
	public Boolean getRuedaDeAuxilio() {
		return RuedaDeAuxilio;
	}

	public void setRuedaDeAuxilio(Boolean ruedaDeAuxilio) {
		RuedaDeAuxilio = ruedaDeAuxilio;
	}
		
	
	
	
	//se genera el metodo de Auto vacio
	public Auto() {
		
	}
	
	
	public Auto (int PlusVelocidad){
		this.setPlusVelocidad(PlusVelocidad);
	}
	
	
	
	
	// se genera un metodo para obtener la suma de las velocidades para luego realizar la comparacion en el Boolean EsSeguro()
	public int getVelocidadFinal() {
		
		return getVelocidad() + getPlusVelocidad();
		
	}


}
