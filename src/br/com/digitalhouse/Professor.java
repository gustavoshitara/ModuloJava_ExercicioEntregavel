package br.com.digitalhouse;

public class Professor {
    private String nomeProfessor;
    private String sobrenomeProfessor;
    private Integer tempoCasa;
    private Integer codProfessor;

    public Professor(){

    }

    public Professor(String nomeProfessor,String sobrenomeProfessor,Integer tempoCasa,Integer codProfessor){
        this.nomeProfessor = nomeProfessor;
        this.sobrenomeProfessor = sobrenomeProfessor;
        this.tempoCasa = tempoCasa;
        this.codProfessor = codProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getSobrenomeProfessor() {
        return sobrenomeProfessor;
    }

    public void setSobrenomeProfessor(String sobrenomeProfessor) {
        this.sobrenomeProfessor = sobrenomeProfessor;
    }

    public Integer getTempoCasa() {
        return tempoCasa;
    }

    public void setTempoCasa(Integer tempoCasa) {
        this.tempoCasa = tempoCasa;
    }

    public Integer getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(Integer codProfessor) {
        this.codProfessor = codProfessor;
    }

    @Override
    public boolean equals(Object novoProfessor) {

        if(!(novoProfessor instanceof Professor)){
            return false;
        }

        if(((Professor) novoProfessor).getCodProfessor() == this.codProfessor){
            return true;
        }

        return false;

    }
}
