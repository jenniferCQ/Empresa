package com.CamonesQuirozJ.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_empleado")
public class Empleado {

	@Id
	@Column(name="id_empleado")
	public int codigo;
	
	@Column(name="nom_empleado")
	public String nombre;
	
	@Column(name="ape_empleado")
	public String apePaterno;
	
	@Column(name="apeMaterno")
	public String apeMaterno;
	
	@Column(name="id_area")
	public int idarea;

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApePaterno() {
		return apePaterno;
	}

	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}

	public String getApeMaterno() {
		return apeMaterno;
	}

	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}
}
