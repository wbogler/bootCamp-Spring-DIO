package geral.subs;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome; 
	private Set<Conteudo> conteudosinscrito = new LinkedHashSet<>();
	private Set<Conteudo> conteudosconcluidos = new LinkedHashSet<>();
	
	public void inscreverBootcamp(BootCamp bootCamp) {
		this.conteudosconcluidos.addAll(bootCamp.getConteudos());
		bootCamp.getDevsInscritos().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudosinscrito.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosconcluidos.add(conteudo.get());
			this.conteudosinscrito.remove(conteudo.get());
		} else {
			System.out.println("Você não está matriculado em nenhum conteúdo.");
		}
	}
	
	public double cancularTotalXP() {
		return this.conteudosconcluidos
				.stream()
				.mapToDouble(conteudo -> conteudo.calcularXP())
				.sum();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosinscrito() {
		return conteudosinscrito;
	}

	public void setConteudosinscrito(Set<Conteudo> conteudosinscrito) {
		this.conteudosinscrito = conteudosinscrito;
	}

	public Set<Conteudo> getConteudosconcluidos() {
		return conteudosconcluidos;
	}

	public void setConteudosconcluidos(Set<Conteudo> conteudosconcluidos) {
		this.conteudosconcluidos = conteudosconcluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosconcluidos, conteudosinscrito, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosconcluidos, other.conteudosconcluidos)
				&& Objects.equals(conteudosinscrito, other.conteudosinscrito) && Objects.equals(nome, other.nome);
	}
	
	
}
