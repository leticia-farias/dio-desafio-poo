package br.com.dio.desafio.dominio;

public class Projeto extends Conteudo {
	
	private Curso curso;
	private int nivel;

	@Override
	public double calcularXp() {
		 return XP_PADRAO * nivel;
	}

	public Projeto() {
	}
	
	public Curso getCurso() {
		return curso;
	}
	
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int dificuldadeNivel) {
		this.nivel = dificuldadeNivel;
	}
	
	@Override
    public String toString() {
        return "Projeto{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", curso='" + curso +
                ", nivel=" + nivel +
                '}';
    }

}
