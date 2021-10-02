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

/*---------------------------------------------------------------------------------*/

/*3. A classe Aluno possuí os atributos id, nome e curso. Receba todos os
parâmetros no método construtor e exiba-os em console. Adicione um
companion Object com a mensagem chamando método estático, que deve ser
acessado sem realizar a instância direta da classe.*/

class Aluno(id: Int, nome: String, curso:String) {
	companion object Factory {
    	fun chamar(){
      		println("Chamando método estático")
    	}
	}
	init {
   		println("ID: $id \nNome: $nome\nCurso:$curso")
	}
}

fun main() {
    var obj = Aluno(1, "Fulano", "Análise e Desenvolvimento de Sistemas")
    Aluno.chamar()

