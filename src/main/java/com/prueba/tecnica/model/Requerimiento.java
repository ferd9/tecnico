package com.prueba.tecnica.model;

import java.time.LocalDate;

public class Requerimiento {
    
    private Long idRequerimiento;
    private String nombreSolicitud;
    private String descripcionSolicitud;
    private String anexo;
    private LocalDate fechaSolicitud;
    private Solicitante solicitante;
    private CoordinadorHelpdesk coordinador;
    private AnalistaTI analista;
	/**
	 * @return the idRequerimiento
	 */
	public Long getIdRequerimiento() {
		return idRequerimiento;
	}
	/**
	 * @param idRequerimiento the idRequerimiento to set
	 */
	public void setIdRequerimiento(Long idRequerimiento) {
		this.idRequerimiento = idRequerimiento;
	}
	/**
	 * @return the nombreSolicitud
	 */
	public String getNombreSolicitud() {
		return nombreSolicitud;
	}
	/**
	 * @param nombreSolicitud the nombreSolicitud to set
	 */
	public void setNombreSolicitud(String nombreSolicitud) {
		this.nombreSolicitud = nombreSolicitud;
	}
	/**
	 * @return the descripcionSolicitud
	 */
	public String getDescripcionSolicitud() {
		return descripcionSolicitud;
	}
	/**
	 * @param descripcionSolicitud the descripcionSolicitud to set
	 */
	public void setDescripcionSolicitud(String descripcionSolicitud) {
		this.descripcionSolicitud = descripcionSolicitud;
	}
	/**
	 * @return the anexo
	 */
	public String getAnexo() {
		return anexo;
	}
	/**
	 * @param anexo the anexo to set
	 */
	public void setAnexo(String anexo) {
		this.anexo = anexo;
	}
	/**
	 * @return the fechaSolicitud
	 */
	public LocalDate getFechaSolicitud() {
		return fechaSolicitud;
	}
	/**
	 * @param fechaSolicitud the fechaSolicitud to set
	 */
	public void setFechaSolicitud(LocalDate fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	/**
	 * @return the solicitante
	 */
	public Solicitante getSolicitante() {
		return solicitante;
	}
	/**
	 * @param solicitante the solicitante to set
	 */
	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}
	/**
	 * @return the coordinador
	 */
	public CoordinadorHelpdesk getCoordinador() {
		return coordinador;
	}
	/**
	 * @param coordinador the coordinador to set
	 */
	public void setCoordinador(CoordinadorHelpdesk coordinador) {
		this.coordinador = coordinador;
	}
	/**
	 * @return the analista
	 */
	public AnalistaTI getAnalista() {
		return analista;
	}
	/**
	 * @param analista the analista to set
	 */
	public void setAnalista(AnalistaTI analista) {
		this.analista = analista;
	}

}

