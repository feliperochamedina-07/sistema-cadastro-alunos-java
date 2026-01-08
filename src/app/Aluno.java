package app;

public class Aluno {

    private String nome;
    private int idade;
    private String sexo;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public Aluno(String nome, int idade, String sexo, double nota1, double nota2, double nota3, double nota4) {
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
        setNota4(nota4);
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
    }

    public void setSexo(String sexo) {
        if (sexo != null && !sexo.isEmpty()) {
            this.sexo = sexo;
        }
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        if (nota1 >= 0 ) {
            this.nota1 = nota1;
        }
    }

    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        if (nota2 >= 0 ) {
            this.nota2 = nota2;
        }
    }

    public double getNota3() {
        return nota3;
    }
    public void setNota3(double nota3) {
        if (nota3 >= 0 ) {
            this.nota3 = nota3;
        }
    }

    public double getNota4() {
        return nota4;
    }
    public void setNota4(double nota4) {
        if (nota4 >= 0 ) {
            this.nota4 = nota4;
        }
    }

    public double calcularMedia(){
      return(nota1 + nota2 + nota3 + nota4) / 4;
    }

    public boolean isAprovado(){
        return calcularMedia() >= 60;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Nota1: " + nota1);
        System.out.println("Nota2: " + nota2);
        System.out.println("Nota3: " + nota3);
        System.out.println("Nota4: " + nota4);
        System.out.println("Média: " + calcularMedia());

        if (isAprovado()) {
            System.out.println("Aprovado!");
        }else {
            System.out.println("Reprovado!");
        }
    }
}
