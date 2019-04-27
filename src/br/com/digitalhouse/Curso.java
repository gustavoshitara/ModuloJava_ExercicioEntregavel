package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nomeCurso;
    private Integer codCurso;
    private ProfessorTitular novoProfTitular;
    private ProfessorAdjunto novoProfAdjunto;
    private Integer maxQtdeAlunos;
    List<Aluno> listaAlunosMatriculados = new ArrayList<>();

    public Curso(){

    }

    public Curso(String nomeCurso,Integer codCurso,ProfessorTitular novoProfTitular,ProfessorAdjunto novoProfAdjunto,Integer maxQtdeAlunos,List<Aluno> listaAlunosMatriculados){
        this.nomeCurso = nomeCurso;
        this.codCurso = codCurso;
        this.novoProfTitular = novoProfTitular;
        this.novoProfAdjunto = novoProfAdjunto;
        this.maxQtdeAlunos = maxQtdeAlunos;
        this.listaAlunosMatriculados = listaAlunosMatriculados;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Integer getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(Integer codCurso) {
        this.codCurso = codCurso;
    }

    public ProfessorTitular getNovoProfTitular() {
        return novoProfTitular;
    }

    public void setNovoProfTitular(ProfessorTitular novoProfTitular) {
        this.novoProfTitular = novoProfTitular;
    }

    public ProfessorAdjunto getNovoProfAdjunto() {
        return novoProfAdjunto;
    }

    public void setNovoProfAdjunto(ProfessorAdjunto novoProfAdjunto) {
        this.novoProfAdjunto = novoProfAdjunto;
    }

    public Integer getMaxQtdeAlunos() {
        return maxQtdeAlunos;
    }

    public void setMaxQtdeAlunos(Integer maxQtdeAlunos) {
        this.maxQtdeAlunos = maxQtdeAlunos;
    }

    public List<Aluno> getListaAlunosMatriculados() {
        return listaAlunosMatriculados;
    }

    public void setListaAlunosMatriculados(List<Aluno> listaAlunosMatriculados) {
        this.listaAlunosMatriculados = listaAlunosMatriculados;
    }

    @Override
    public boolean equals(Object novoCurso) {

        if(!(novoCurso instanceof Curso)){
            return false;
        }

        if(((Curso) novoCurso).getCodCurso() == this.codCurso){
            return true;
        }

        return false;

    }

    public Boolean adicionarUmAluno(Aluno umAluno){
        if(listaAlunosMatriculados.size() < this.maxQtdeAlunos){
            listaAlunosMatriculados.add(umAluno);
            return true;
        }else{
            return false;
        }
    }
}
