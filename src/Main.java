import br.com.dio.desafio.dominio.*;

import javax.swing.text.AbstractDocument;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso java");
        curso.setDescricao("Descrição do curso Java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição do curso Js");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev isabele = new Dev();
        isabele.setNome("Isabele");
        isabele.inscreverBootcamp(bootcamp);
        isabele.progredir();
        isabele.progredir();
        System.out.println("Conteudos inscritos" + isabele.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + isabele.getConteudosConcluidos());
        System.out.println("Conteudos Concluidos" + isabele.calcularTotalXp());



        Dev joao = new Dev();
        joao.setNome("Joao");
        joao.inscreverBootcamp(bootcamp);
        joao.progredir();
        System.out.println("Conteudos inscritos" + joao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + joao.getConteudosConcluidos());
        System.out.println("Conteudos Concluidos" + joao.calcularTotalXp());


    }
}
