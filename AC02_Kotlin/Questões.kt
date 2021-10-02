/* 2. A classe Aluno possuí os atributos id, nome e curso. Receba todos os
parâmetros no método construtor e exiba-os em console, sem a utilização de
métodos estáticos. */

class Aluno(id: Int, nome: String, curso:String) {
	init {
   		println("ID: $id \nNome: $nome\nCurso:$curso")
	}
}
fun main() {
	var obj = Aluno(1, "Fulano", "Análise e Desenvolvimento de Sistemas")
}
