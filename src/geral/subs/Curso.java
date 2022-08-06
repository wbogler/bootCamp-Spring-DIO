package geral.subs;

public class Curso extends Conteudo {
	
	private String titulo;
	private String descri��o;
	private int cargaHoraria;
	
	public Curso() {};
	
	@Override
	public double calcularXP() {
		return XP_PADRAO+cargaHoraria;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String t�tulo) {
		this.titulo = t�tulo;
	}
	public String getDescri��o() {
		return descri��o;
	}
	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso [t�tulo=" + getTitulo() + ", descri��o=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}

	
	
	

}
