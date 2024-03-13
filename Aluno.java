/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

/**
 *
 * @author kennendy
 */
public class Aluno extends Biblioteca01 {
    private String nomeAluno;
    private int idade;
    private String curso;


    public String getNomeAluno() {
        return nomeAluno;
    }


    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

 
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Aluno(String nomeAluno, int idade, String curso) {
        this.nomeAluno = nomeAluno;
        this.idade = idade;
        this.curso = curso;
    }

    public Aluno() {
    }
    
    

}

