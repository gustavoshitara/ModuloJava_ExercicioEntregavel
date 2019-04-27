package br.com.digitalhouse;

public class ProfessorAdjunto extends Professor{
    private Integer horasMonitoria;

    public ProfessorAdjunto(String nomeProfessor, String sobrenomeProfessor, Integer tempoCasa, Integer codProfessor, Integer horasMonitoria) {
        super(nomeProfessor, sobrenomeProfessor, tempoCasa, codProfessor);
        this.horasMonitoria = horasMonitoria;
    }

    public Integer getHorasMonitoria() {
        return horasMonitoria;
    }

    public void setHorasMonitoria(Integer horasMonitoria) {
        this.horasMonitoria = horasMonitoria;
    }
}
