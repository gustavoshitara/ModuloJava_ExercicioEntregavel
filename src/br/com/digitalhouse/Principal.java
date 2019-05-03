package br.com.digitalhouse;

public class Principal {
    public static void main(String[] args) {
        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        digitalHouseManager.registrarProfessorTitular("Paulo","Montes",1,"Android");
        digitalHouseManager.registrarProfessorTitular("Luis","Silva",2,"Matemática");
        digitalHouseManager.registrarProfessorAdjunto("Luisa","Bolsonaro",11,20);
        digitalHouseManager.registrarProfessorAdjunto("João","Marques",12,44);

        digitalHouseManager.registrarCurso("Full Stack",20001,3);
        digitalHouseManager.registrarCurso("Android",20002,2);

        digitalHouseManager.registrarAluno("Maria","Mendes",100);
        digitalHouseManager.registrarAluno("Adriana","Maroni",101);
        digitalHouseManager.registrarAluno("Lucas","Gentil",102);
        digitalHouseManager.registrarAluno("Henrique","Sales",103);
        digitalHouseManager.registrarAluno("Fernando","Fernandes",104);

        digitalHouseManager.alocarProfessores(20001,1,11);
        digitalHouseManager.alocarProfessores(20002,2,12);

        digitalHouseManager.matricularAluno(100,20001);
        digitalHouseManager.matricularAluno(101,20001);
        digitalHouseManager.matricularAluno(102,20002);
        digitalHouseManager.matricularAluno(103,20002);
        digitalHouseManager.matricularAluno(104,20002);

    }
}
