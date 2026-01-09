package app;

public class Aluno {

    private String nome;
    private int idade;
    private Sexo sexo;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public Aluno(String nome, int idade, Sexo sexo, double nota1,
                 double nota2, double nota3, double nota4) {
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
        setNota4(nota4);
    }

    // Setters com validação
    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
    }

    public void setSexo(Sexo sexo) {
        if (sexo != null) {
            this.sexo = sexo;
        }
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 100) this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 100) this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        if (nota3 >= 0 && nota3 <= 100) this.nota3 = nota3;
    }

    public void setNota4(double nota4) {
        if (nota4 >= 0 && nota4 <= 100) this.nota4 = nota4;
    }

    // Getters
    public double getNota1() { return nota1; }
    public double getNota2() { return nota2; }
    public double getNota3() { return nota3; }
    public double getNota4() { return nota4; }

    // Calcula média
    public double calcularMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    // Verifica aprovação
    public boolean isAprovado() {
        return calcularMedia() >= 60;
    }

    // Sobrescreve toString para exibir aluno profissionalmente
    @Override
    public String toString() {
        return """
               Nome: %s
               Idade: %d
               Sexo: %s
               Notas: [%.2f, %.2f, %.2f, %.2f]
               Média: %.2f
               Situação: %s
               """.formatted(
                nome, idade, sexo,
                nota1, nota2, nota3, nota4,
                calcularMedia(),
                isAprovado() ? "Aprovado" : "Reprovado"
        );
    }
}
