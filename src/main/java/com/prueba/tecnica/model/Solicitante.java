package com.prueba.tecnica.model;

public class Solicitante {
    private Long idSolicitante;
    private String nombres;
    private String apellidos;
    private String area;
	/**
	 * @return the idSolicitante
	 */
	public Long getIdSolicitante() {
		return idSolicitante;
	}
	/**
	 * @param idSolicitante the idSolicitante to set
	 */
	public void setIdSolicitante(Long idSolicitante) {
		this.idSolicitante = idSolicitante;
	}
	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}
	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}
    
}
