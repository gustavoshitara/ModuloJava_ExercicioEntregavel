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

    public Curso(String nomeCurso,Integer codCurso,Integer maxQtdeAlunos,ProfessorTitular novoProfTitular,ProfessorAdjunto novoProfAdjunto,List<Aluno> listaAlunosMatriculados){
        this.nomeCurso = nomeCurso;
        this.codCurso = codCurso;
        this.maxQtdeAlunos = maxQtdeAlunos;
        this.novoProfTitular = null;
        this.novoProfAdjunto = null;
        this.listaAlunosMatriculados = null;
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

    public void excluirAluno(Aluno umAluno){
        for(Aluno aluno:listaAlunosMatriculados){
            if(aluno.equals(umAluno)){
                listaAlunosMatriculados.remove(aluno);
            }
        }
    }
}
