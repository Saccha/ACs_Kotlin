/*1. Crie uma classe ENUM contendo 4 notas dos alunos durante o semestre
letivo. Exiba cada uma das propriedades em console. Repare que as notas
devem ser inicializadas como Double.*/

enum class Aluno(val notas: Double) {
	nota1(5.6),
	nota2(7.5),
	nota3(8.5),
    nota4(10.0),
}

fun main() {
	var result1 = Aluno.nota1
    var result2 = Aluno.nota2
    var result3 = Aluno.nota3
    var result4 = Aluno.nota4
	println(result1.notas)
    println(result2.notas)
    println(result3.notas)
    println(result4.notas)
}

/*-------------------------------------------------------------------------------------------------------*/

/*3. Crie uma nova classe com base no exemplo abaixo chamada Cat e
implemente o método definido na classe Animal. Apresente valores em console
da mesma forma que ocorre na Classe Dog, para a nova classe implementada.*/

open class Animal() {
open var colour: String = "White"
}
class Dog: Animal() {
override var colour: String = "Black"
fun sound() {
println("Dog makes a sound of woof woof")
}
}
class Cat: Animal() {
override var colour: String = "White"
fun sound() {
println("Cat makes a sound of meow")
}
}
fun main(){
var animal1: Dog = Dog()
var animal2: Cat = Cat()
animal1.sound()
animal2.sound()
}

/*-------------------------------------------------------------------------------------------------------*/

/*7. Explique cada um dos conceitos abaixo:
• Classe:
	Resposta: Uma classe é um bloco de construção de software fundamental, encontrado na grande maioria das linguagens 
    orientadas a objetos e, dessa forma, também presente em Kotlin. Elas são usadas para criar novos tipos de dados, 
    utilizando uma estrutura composta por métodos e variáveis que podem possuir os seus próprios tipos.
    
• Objeto:
	Resposta:Objetos são muito semelhantes às classes.
    -> Eles podem ter propriedades, métodos e um bloco init.
	-> Essas propriedades ou métodos podem ter modificadores de visibilidade.
	-> Eles não podem ter construtores (primários ou secundários).
	-> Eles podem estender outras classes ou implementar uma interface.
	
• Herança:
	Resposta: Herança é um dos três pilares da orientação a objetos.É através desse recurso que podemos estender ou modificar o 
    comportamento de um código existente, promovendo a reutilização. Nesse processo a classe existente é chamada de superclasse e a classe a ser criada se 
    chama classe derivada ou subclasse.

• Interface:
	Resposta: As interfaces no Kotlin podem conter declarações de métodos abstratos, bem como implementações de métodos. O que os torna diferentes das classes 
    abstratas é que as interfaces não podem armazenar um estado. 
    Eles podem ter propriedades, mas precisam ser abstratas ou fornecer implementações de acessador.
    
• Classe Abstrata
	Resposta:Uma classe abstrata, assim como os seus métodos abstratos, é open por padrão. Ao herdar de uma classe abstrata, todos os métodos abstratos da superclasse devem ser 
    implementados na subclasse, a não ser que a mesma também 
    seja abstrata. Caso contrário, um erro será emitido pelo compilador
    
• Polimorfismo
	Resposta:polimorfismo é o princípio pelo qual duas ou mais classes derivadas da mesma superclasse 
    podem invocar métodos que têm a mesma assinatura,mas comportamentos distintos

• Métodos estáticos e não estáticos.*/
