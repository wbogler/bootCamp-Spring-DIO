package geral;

import java.time.LocalDate;

import geral.subs.BootCamp;
import geral.subs.Curso;
import geral.subs.Dev;
import geral.subs.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso0 = new Curso();
		curso0.setTitulo("JAVA");
		curso0.setDescrição("Curso de Java");
		curso0.setCargaHoraria(10);
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Js");
		curso1.setDescricao("Cursod e JavaScript");
		curso1.setCargaHoraria(40);
		
		Mentoria mentoria0 = new Mentoria();
		mentoria0.setTitulo("Mentoria em Java");
		mentoria0.setDescricao("Mentoria para aprofundamentos me collections");
		mentoria0.setData(LocalDate.now());
		
		BootCamp bootcamp = new BootCamp();
		bootcamp.setNome("BootCamp Java Developer");
		bootcamp.setDescricao("Descrição do bootcamp Java");
		bootcamp.getConteudos().add(curso0);
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(mentoria0);
		
		Dev willian = new Dev();
		willian.setNome("Willian");
		System.out.println(willian.getNome());
		System.out.println("Conteudo inscrito: "+willian.getConteudosinscrito());
		willian.inscreverBootcamp(bootcamp);
		System.out.println("Conteudo inscrito: "+willian.getConteudosinscrito());
		willian.progredir();
		System.out.println("Conteudo inscrito: "+willian.getConteudosinscrito());
		System.out.println("Conteudo concluido"+willian.getConteudosconcluidos());
		System.out.println(willian.cancularTotalXP());
		
		
		Dev ana = new Dev();
		ana.setNome("Ana");
		System.out.println(ana.getNome());
		System.out.println("Conteudo inscrito: "+ana.getConteudosinscrito());
		ana.inscreverBootcamp(bootcamp);
		System.out.println("Conteudo inscrito: "+ana.getConteudosinscrito());
		ana.progredir();
		System.out.println("Conteudo inscrito: "+ana.getConteudosinscrito());
		System.out.println("Conteudo concluido"+ana.getConteudosconcluidos());
		System.out.println(ana.cancularTotalXP());
		

	}

}
