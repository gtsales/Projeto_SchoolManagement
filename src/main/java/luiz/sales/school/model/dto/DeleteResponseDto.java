package luiz.sales.school.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteResponseDto {

	private String nome;
	private String cpf;
	
	public DeleteResponseDto responseDelete(String nome, String cpf) {
		
		DeleteResponseDto deleteResponseDto = new DeleteResponseDto(nome, cpf);
		
		return deleteResponseDto;
	}
}
