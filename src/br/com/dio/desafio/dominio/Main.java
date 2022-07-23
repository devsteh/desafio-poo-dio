package br.com.dio.desafio.dominio;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Spring Framework");
        curso2.setDescricao("Descrição curso Spring");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp para estudos de programação na linguagem Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devStephany = new Dev();
        devStephany.setNome("Stephany");
        devStephany.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Stephany: " + devStephany.getConteudosInscritos());
        devStephany.progredir();
        devStephany.progredir();
        devStephany.progredir();
        //System.out.println("Conteudos Inscritos Stephany: " + devStephany.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Stephany: " + devStephany.getConteudosConcluidos());
        System.out.println("XP: " + devStephany.calcularTotalXp());

        Dev devTeste = new Dev();
        devTeste.setNome("Teste");
        devTeste.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Teste: " + devTeste.getConteudosInscritos());
        devTeste.progredir();
        devStephany.progredir();
        System.out.println("Conteúdos Inscritos Teste: " + devTeste.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Teste: " + devTeste.getConteudosConcluidos());
        System.out.println("XP: " + devTeste.calcularTotalXp());

    }

}
