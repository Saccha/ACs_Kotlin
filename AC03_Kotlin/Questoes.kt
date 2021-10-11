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

/*4. Dado o exemplo abaixo, realize a implementação de duas classes concretas
chamadas Aluno e Professor que devem implementar o método imprimir.
Apresente os resultados em console.*/

interface Usuario {
	fun imprimir()
}
class Aluno:Usuario{
	override fun imprimir(){
	println("Implementando uma função")
	}
}
class Professor:Usuario{
	override fun imprimir(){
	println("Implementando outra função")
	}
}
fun main(){
	val user = Aluno()
    val user1 = Professor()
	user.imprimir()
    user1.imprimir()
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

• Métodos estáticos e não estáticos.
	Resposta: Métodos estáticos não requerem uma instância da classe nem podem acessar implicitamente os dados (ou this , self , Me , etc.) de tal instância. 
    Um método estático é distinguido em algumas linguagens de programação 
    com a palavra-chave static colocada em algum lugar na assinatura do método.
  
*/

/*-------------------------------------------------------------------------------------------------------*/

/*8. Explique cada uma das camadas que fazem parte da arquitetura do Android.
Descreva o passo a passo necessário para criar uma nova aplicação

Camada de aplicações:
	-> Onde encontram-se todos os aplicativos que são executados
		sobre o sistema operacional.
        
Camada de bibliotecas:
	-> Possui as bibliotecas C e C++ que são utilizadas pelo sistema.package

Camada de Runtime:
	-> Camada onde é instanciada a máquina virtual Dalvik para
		gerenciamento do desempenho.
        
Camada de kernel do Linux:
	-> O núcleo do sistema operacional Android é derivado do Kernel
		2.6 do Linux herdando várias características da plataforma.
      
------------------------------------------------------------------------------------------------

PARA CRIAR NOVA APLICAÇÃO:

-> Abra o Android Studio e clique em “Start a new Android Studio Project”. 
   Abrirá uma tela para que você escolha o nome do aplicativo, nome da companhia e a localização do projeto. 
   Informe os nomes de sua preferência. Por exemplo: "HelloWorld"
   Marque a caixa “Include Kotlin support” para que o seu projeto possa usar a linguagem Kotlin. 
   
-> Após efetuar as configurações, clique em “Next”. Nesta janela, deixe marcado o item “Phone and Tablet” e selecionando a versão 
  “API 16 Android 4.0.3”, escolha da API 16 para que seu app possa rodar em aproximadamente 100% dos devices com Android 
   como é informado pelo Android Studio 
  "By targeting API 16 and later, your app will run on approximately 100% of devices".

-> Com isso, informamos que nossa aplicação será executada apenas em smartphones e tablets, clique em “Next” novamente. 
   Na próxima tela, você deverá selecionar “Empty Activity” e então clicar em “Next”.package
   
-> Na próxima tela, você pode deixar MainActivity ou escolher o nome que preferir para a atividade principal. Clique em “Finish” e aguarde 
   enquanto o Android Studio carrega todas as bibliotecas necessárias para seu App.
   
-> Todo o código será feito na MainActivity e em nosso arquivo activity_mail.xml que está localizado em: res -> layout.

*/
