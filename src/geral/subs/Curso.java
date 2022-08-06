package geral.subs;

public class Curso extends Conteudo {
	
	private String titulo;
	private String descrição;
	private int cargaHoraria;
	
	public Curso() {};
	
	@Override
	public double calcularXP() {
		return XP_PADRAO+cargaHoraria;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String título) {
		this.titulo = título;
	}
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso [título=" + getTitulo() + ", descrição=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}

	
	
	

}
