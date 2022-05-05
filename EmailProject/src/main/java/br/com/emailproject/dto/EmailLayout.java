package br.com.emailproject.dto;

import br.com.emailproject.model.Email;

public class EmailLayout {
	
	private static final String QUEBRA_DE_LINHA_DUPLA = "<br><br>";
	private static final String QUEBRA_DE_LINHA_UNICA = "<br>";
	
	public Email montarEmailAdmin(String destinarario, String assunto) {
		
		
		StringBuilder texto = new StringBuilder();
		
		texto
			.append("A/C Administrador")
			.append(QUEBRA_DE_LINHA_DUPLA);
		
		texto
			.append("Solicito alteração de senha do sistema!")
			.append(QUEBRA_DE_LINHA_DUPLA);
		
		gerarAssinatura(texto);
		
		gerarRodape(texto);
	
		return new Email(destinarario, assunto, texto.toString());
		
	}
	
public Email montarEmailSecretario(String destinarario, String assunto) {
		
		
		StringBuilder texto = new StringBuilder();
		
		texto
			.append("A/C Secretário")
			.append(QUEBRA_DE_LINHA_DUPLA);
		
		texto
			.append("Solicito marcação das férias!")
			.append(QUEBRA_DE_LINHA_DUPLA);
		
		gerarAssinatura(texto);
		
		gerarRodape(texto);
	
		return new Email(destinarario, assunto, texto.toString());
		
	}
	
	private String gerarAssinatura(StringBuilder texto) {
		return texto
				.append("Att:")
				.append(QUEBRA_DE_LINHA_UNICA)
				.append("Alisson")
				.append(QUEBRA_DE_LINHA_DUPLA).toString();
		
	}

	private String gerarRodape(StringBuilder texto) {
		return texto.append("E-mail automático. Favor não responder!").toString();
	}

}
