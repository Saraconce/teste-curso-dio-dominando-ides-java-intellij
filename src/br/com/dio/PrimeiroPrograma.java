package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        String nome;
        Livro livro = new Livro(nome:Object numPaginas;
        "O problema dos 3 corpos", numPaginas :300);
        System.out.println(livro);
        System.out.println(numPaginas);
        System.out.println(nome);

        /*int a = 5;
      int b = 3;
      System.out.println("Hello World! " + (a+b));*/
    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;

    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}