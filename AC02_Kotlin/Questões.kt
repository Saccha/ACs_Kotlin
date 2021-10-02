/*1. Crie uma variável global que indique o percentual de reajuste de um
determinado produto, que deve ser calculado a partir do método main definido
na função. Calcule o novo salário e exiba-o em console.*/

var salarioReajuste: Double = 6.5
var salarioAtual : Double = 2500.00

fun main(){
    var novoSalario = salarioAtual + (salarioAtual * salarioReajuste / 100 )
    println("$novoSalario")

}

/*---------------------------------------------------------------------------------*/

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
    
/*---------------------------------------------------------------------------------*/

/*6. Cria uma classe chamada Aluno com os atributos ID do aluno, nome do Aluno
e semestre. Passe 10 notas por meio da utilização de um ArrayList inicializadas
no método construtor e imprima cada um dos valores em console a partir de uma
nova função.*/

class Aluno(id: Int, nome: String, notas: List<Double>){
    init {
        println("ID: $id \nNome aluno: $nome \nnotas: $notas")
    }
}

fun main(){
    val lista_notas = arrayListOf<Double>()
    lista_notas.add(10.0)
    lista_notas.add(5.0)
    lista_notas.add(9.0)
    lista_notas.add(6.0)
    lista_notas.add(7.5)
    lista_notas.add(4.5)
    lista_notas.add(3.0)
    lista_notas.add(8.0)
    lista_notas.add(9.2)
    lista_notas.add(6.5)

    var aluno1 = Aluno(1,"Fulano da Vida", lista_notas)
}
