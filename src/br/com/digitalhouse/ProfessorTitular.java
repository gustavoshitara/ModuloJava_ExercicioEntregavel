package br.com.digitalhouse;

public class ProfessorTitular extends Professor {
    private String especialidade;

    public ProfessorTitular(String nomeProfessor, String sobrenomeProfessor, Integer tempoCasa, Integer codProfessor, String especialidade) {
        super(nomeProfessor, sobrenomeProfessor, tempoCasa, codProfessor);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
