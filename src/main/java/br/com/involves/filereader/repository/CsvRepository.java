package br.com.involves.filereader.repository;

import java.util.List;
import java.util.Map;

import br.com.involves.filereader.dto.Cidade;

public class CsvRepository {

	public static final String ID_IBGE = "ibge_id";
	public static final String UF = "uf";
	public static final String NOME = "name";
	public static final String CAPITAL = "capital";
	public static final String LONGITUDE = "lon";
	public static final String LATITUDE = "lat";
	public static final String NOME_SEM_ACENTO = "no_accents";
	public static final String NOME_ALTERNATIVO = "alternative_names";
	public static final String MICROREGIAO = "microregion";
	public static final String MESOREGIAO = "mesoregion";
	
	private Map<Integer, String> header;
	private List<Cidade> cidades;

	public CsvRepository(Builder builder) {
		this.header = builder.header;
		this.cidades = builder.cidades;
	}

	public static class Builder {
		private Map<Integer, String> header;
		private List<Cidade> cidades;

		public CsvRepository build() {
			return new CsvRepository(this);
		}
		
		public Builder header(Map<Integer, String> header) {
			this.header = header;
			return this;
		}

		public Builder cidades(List<Cidade> cidades) {
			this.cidades = cidades;
			return this;
		}

	}

	public Map<Integer, String> getHeader() {
		return header;
	}

	public void setHeader(Map<Integer, String> header) {
		this.header = header;
	}

	public List<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}

}