
public class Conductor implements ISeguridad{

	private Vehiculo vehiculo;
	private boolean registro;
	
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
	
	public boolean getRegistro() {
		return registro;
	}
	public void setRegistro(boolean registro) {
		this.registro = registro;
	}
	
	
	//se genera cuando se implemeta ISeguridad
	@Override
	public Boolean EsSeguro() {
		// return null   <--genera por defecto 
		//si registro es verdadero y vehiculo
		return getRegistro() && this.vehiculo.EsSeguro();
	}
	
}
