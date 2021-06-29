package com.servidor.aldazabal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_cli")
	private int codigo;
	@Column(name = "nombre_cli")
	private String nombre;
	@Column(name = "apellido_cli")
	private String apellido;
	@Column(name = "numero_cli")
	private String telefono;
	@Column(name = "email_cli")
	private String email;
	@Column(name = "password_cli")
	private String password;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", email=" + email + ", password=" + password + "]";
	}
	
	
	

}
