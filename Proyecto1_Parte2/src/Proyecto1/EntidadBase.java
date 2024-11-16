package Proyecto1;

import java.util.ArrayList;
import java.util.List;

public abstract class EntidadBase {
	protected int id;
	protected List<Object> elementos;
	
	public EntidadBase() {
		this.elementos = new ArrayList<>();
	}
	
	public int getId() {
		return id;
		}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public List<Object> getElementos(){
		return elementos;
	}
	
	public void setElemento(List<Object> elementos) {
		this.elementos = elementos;
	}
	
	public void agregarElemento(Object elemento) {
		elementos.add(elemento);
	}
	
	public void eliminarElemento(Object elemento) {
		elementos.remove(elemento);
	}
}
