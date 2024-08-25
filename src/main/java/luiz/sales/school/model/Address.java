package luiz.sales.school.model;

import java.io.Serializable;

import lombok.Data;
import luiz.sales.school.model.dto.AddressDto;

@Data
public class Address implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String cep;
	private String uf;
	private String municipio;
	private String bairro;
	private String rua;
	private String numero;
	
	public Address toAddress(AddressDto addressDto){
		
		Address address = new Address();
		
		address.setCep(addressDto.getCep());
		address.setUf(addressDto.getUf());
		address.setMunicipio(addressDto.getMunicipio());
		address.setBairro(addressDto.getBairro());
		address.setRua(addressDto.getRua());
		address.setNumero(addressDto.getNumero());
		
		return address;
	}
}
