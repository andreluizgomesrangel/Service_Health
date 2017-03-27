package br.com.mobilesaude.resources;

import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "requisicao")
@XmlAccessorType(XmlAccessType.FIELD)
public class Requisicao {

	private long id;
	private long idService;
	private Date time;
	private String details;
	private int response;
	
	private Service service;
	
	private long requisicao;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getIdService() {
		return idService;
	}
	public void setIdService(long idService) {
		this.idService = idService;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date c) {
		this.time = c;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public int getResponse() {
		return response;
	}
	
	public void setResponse(int response) {
		if( response == 200 ){
			setDetails("Service is operating normally");
		}
		if( response == 404 ){
			setDetails("Not found!");
		}
		if( response == 500 ){
			setDetails("Internal Server Error");
		}
		if( response == 503 ){
			setDetails("Service Unavailable");
		}
		if( response == 504 ){
			setDetails("Gateway Time-out");
		}

		
		this.response = response;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public long getRequisicao() {
		return requisicao;
	}
	public void setRequisicao(long requisicao) {
		this.requisicao = requisicao;
	}
	
	
}
