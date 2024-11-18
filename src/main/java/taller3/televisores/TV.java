
package taller3.televisores;

public class TV {
	public static int numTV;
	private	Marca marca;
	private int canal = 1;
	private int precio= 500;
	private boolean estado;
	private int volumen= 1;
	private Control control;
	
	public 	TV(Marca marca, boolean estado) {
		this.marca=marca;
		this.estado=estado;
		numTV++;
		
	}
	public void setMarca(Marca marca) {
		this.marca=marca;
	} 
	public Marca getMarca () {
		return this.marca;
	}
	public void setCanal(int ncanal) {
		if(estado==true) {
			if(ncanal>1 && ncanal<120) {
				canal=ncanal;
			}else {
				return;
			}
			
		}else {
			return;
		}
	}
	public int getCanal() {
		return canal;
		
	}
	public void setPrecio(int nprecio) {
		precio=nprecio;
	} 
	public int getPrecio () {
		return precio;
	}
	public void setVolumen(int nvolumen) {
		if (estado==true) {
			
		
			if(nvolumen<7 && nvolumen>0) {
				volumen=nvolumen;
		}	else {
				return;
		}
		}else {
			return;
		}
		
		
	}
	public int getVolumen() {
		return volumen;
		
	}
	public void setControl(Control ncontrol) {
		control=ncontrol;
	}
	public Control getControl() {
		return control;
	}
	public static void setNumTV(int nuevo) {
		numTV=nuevo;
	}
	public static int getNumTV() {
		return numTV;
		
	}
	public void turnOn() {
		estado=true;
	}
	public void turnOff() {
		estado=false;
	}
	public boolean getEstado() {
		return estado;
	}
	public void canalUp() {
		if(estado==true) {
			if (canal==120) {
				return;
			}else {
				canal+=1;
			}
		}else {
			return;
		}
	}
	public void canalDown() {
		if(estado==true) {
			if (canal==1) {
				return;
			}else {
				canal-=1;
			}
		
		}else {
			return;
		}
		
	}
	public void volumenUp() {
		if(estado==true) {
			if(volumen >=7) {
				return;
			}else {
				volumen+=1;
			}
		}else {
			return;
		}
	}
	public void volumenDown() {
		if(estado==true) {
			if(volumen<=0) {
				return;
			}else {
				volumen-=1;
			}
		}else {
			return;
		}
	}
}
