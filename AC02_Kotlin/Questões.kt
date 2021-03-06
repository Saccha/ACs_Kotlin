/*1. Crie uma variável global que indique o percentual de reajuste de um
determinado produto, que deve ser calculado a partir do método main definido
na função. Calcule o novo salário e exiba-o em console.*/

val preco = 2.99f
	fun main(){
        val preco = 4.99f
        val desconto = 0.5f
        println(preco - preco * desconto)
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

/*4. Crie três classes chamadas, Aluno, Turma e Professor. Na função main, crie
um atributo chamado obj instanciando uma das classes, valide se o atributo é do
tipo da Classe Aluno, Turma ou Professor e exiba em console o tipo de dado que
ele pertence.*/

class Turma(id: Int, nome: String, qtdAlunos:Int) {
	init {
       println("-----------------------------------")
       println("ID: $id \nNome da Turma: $nome\nQuantidade de alunos: $qtdAlunos")
    }
}

class Aluno(id: Int, nome: String, curso:String) {
	init {
        println("-----------------------------------")
   		println("ID: $id \nNome do Aluno: $nome\nCurso: $curso")
	}
}

class Professor(id: Int, nome: String, curso:String) {
	init {
        println("-----------------------------------")
   		println("ID: $id \nNome do Professor: $nome\nCurso: $curso")
        println("-----------------------------------")
	}
}

fun main() {
	var obj1 = Turma(48743298, "Análise e Desenvolvimento de Sistemas", 40)
    var obj2 = Aluno(28736173,"Fulano","Análise e Desenvolvimento de Sistemas")
    var obj3 = Professor(18728191,"Fabio","Análise e Desenvolvimento de Sistemas")
}

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

/*---------------------------------------------------------------------------------*/

/*7. Inicialize a classe Carro modelo do tipo de dado String, ano do tipo de dado
inteiro e velocidade do tipo de dado inteiro. Na classe Carro, o atributo ano deve
ser iniciado com o valor 1900. Na função main crie 3 instâncias da classe Carro,
nomeadas como c0, c1 e c2. Inicialize o atributo ano de c2 com o valor 2020. Em
seguida exiba o ano do carro acessado por meio do objeto c1 e o ano do carro
acessado por meio do objeto c2.*/

class Carro(modelo: String, ano: Int, velocidade: Int){
    var modelo: String
    var ano = 1900
    var velocidade: Int

    init {
        this.modelo =  modelo
        this.ano = ano
        this.velocidade = velocidade
    }
}

fun main(){
    var c0 = Carro("Peugeot", 1900, 200)
    var c1 = Carro("HB20", 1991, 200)
    var c2 = Carro(modelo = "Fusca", ano = 2020, velocidade = 250)
    println("Ano do carro 0: ${c0.ano} \nAno do carro 1: ${c1.ano} \nAno do carro 2: ${c2.ano}")

    var carros = arrayListOf(c0, c1, c2)

}

/*---------------------------------------------------------------------------------*/


/*8.Crie uma expressão lambda que realiza a divisão de 2 valores e exiba os
resultados em console.*/

fun main() {
   val div = { x: Int, y: Int -> x / y }
   println(div(100,15))
}
