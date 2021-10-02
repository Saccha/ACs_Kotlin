/*1. Inicialize o ano de nascimento e o ano atual. Calcule e mostre a sua idade e
quantos anos terá daqui a 25 anos.*/

fun main(args:Array<String>) {
    var idadeAtual: Int = 23
    val idadeFutura = idadeAtual + 25
    println("A sua idade daqui a 25 anos será: $idadeFutura anos. ")
    
}

/*------------------------------------------------------------------------------------*/

/*2. Inicialize o dia, mês e ano de nascimento e apresente cada uma das variáveis
em console. Apresente também os valores concatenados no formato
DD/MM/YYYY.*/

fun main(){
    println(data("02","09","2021"))
}

fun data(dia:String, mes:String , ano: String): String {
    return ("$dia / $mes / $ano")
}

/*------------------------------------------------------------------------------------*/

/*3. Receba os valores em x e y. Efetua a troca de seus valores e mostre seus
conteúdos.*/

fun main(args: Array<String>) {
	var valorX:Int = 5
	var valorY:Int = 7
	var aux:Int

	aux = valorX
	valorX = valorY
	valorY = aux

	println("Valor de X: $valorX Valor de Y: $valorY")
}

/*------------------------------------------------------------------------------------*/

/*4. Receba o valor de um depósito em poupança. Calcule e mostre o valor após
1 mês de aplicação sabendo que rende 1,3% a. m.*/

fun main(args:Array<String>){
    var deposito:Double = 764.50
    var poupanca = deposito + (deposito * 0.013)
    println("O valor do depósito após 1 mês de aplicação é: " + poupanca)
}

/*------------------------------------------------------------------------------------*/

/*5. Inicialize o salário atual, calcule o novo salário acrescido de 20%.*/

fun main(args:Array<String>){
	var salarioAtual: Double = 1868.76
    var novoSalario = salarioAtual + (salarioAtual * 0.20 )
    println("O salário atual com 20% de acréscimo será de: $novoSalario")

}

/*------------------------------------------------------------------------------------*/

/*6. Inicialize 3 variáveis de tipos de dados inteiros, compare se alguma delas é
maior do que 1000 ou menor do que 100. Exiba qual é a variável que está dentro
do range.*/

fun main(args:Array<String>){
    var n1:Int = 500 
    var n2:Int = 3000
    var n3:Int = 450
    if(n1 < 100 || n1 > 1000){
        println(n1)
    }else if (n2 < 100 || n2 > 1000){
        println(n2)
    }else{
        println(n3)
    }
              
}

/*------------------------------------------------------------------------------------*/

/*7. Inicialize dois valores, calcule e apresente a diferença do maior pelo menor.*/

fun main(args:Array<String>){
    println(diferenca(140,120))
}
fun diferenca(n1: Int,n2: Int):Int {
    if (n1 > n2){
        return n1 - n2
    }
    else {
        return n2 - n1
    }
}

/*------------------------------------------------------------------------------------------*/

/*8. Inicialize as notas dos alunos, N1, N2 e N3. Verifique se a média das três é
maior do que 6. Se sim, exiba uma mensagem indicando que o aluno foi
aprovado. Senão Inicialize uma nova nota N4 e verifique se o aluno foi aprovado.*/

fun main(args:Array<String>){
    var N1:Double = 6.0
    var N2:Double = 7.0
    var N3:Double = 8.0
    var N4:Double = 6.5
    var total: Double = (N1+N2+N3)/3
    
    if(total >= 6){
        println("APROVADO")
    }else{
        total = (total + N4)/2
        if(total>=6){
            println("APROVADO")
        }else{
            println("REPROVADO")          
        }
    }
    println(total)
}

/*------------------------------------------------------------------------------------------*/

/*9. Inicialize uma variável contendo o salário atual e outra variável contendo a
opção que será acessada no menu. Para opção 1 deve ser acrescido 30% no
salário, para opção 2 deve ser acrescido 40% no salário, para opção 3 deve ser
acrescido 50% no salário e para a opção 4 deve ser acrescido 60% no salário.
Exiba o valor reajustado.*/

fun main(args:Array<String>){
    var salarioAtual = 3499.00
    var dado = 2
    var salarioNovo = when(dado){
        1 -> salarioAtual + (salarioAtual * 0.30)
        2 -> salarioAtual + (salarioAtual * 0.40)
        3 -> salarioAtual + (salarioAtual * 0.50)
        4 -> salarioAtual + (salarioAtual * 0.60)
        else -> "ERRO"
    }
        
     println(salarioNovo)
}

/*--------------------------------------------------------------------------*/

/*10. Calcule e mostre o quadrado dos números entre 40 e 200 dos números
inteiros pares.*/

fun main(args:Array<String>){
    var inicio: Int = 40
    var limite:Int = 200
    for(valor in inicio..limite){
        if(valor % 2 == 0){
            var quadrado:Int
            quadrado = valor * valor
    		println("$quadrado")
        }
    }
}

/*--------------------------------------------------------------------------*/

/*11. Calcule e mostre a soma dos números pares e quantidade de números
ímpares entre 1 e 800.*/

fun main(args: Array<String>) {
  var par:Int
  var impar:Int
  par = 0
  impar = 0
  for (i in 1..800){    
    if(i%2==0)
      par = par + 1
    else
      impar = impar + 1   
    }

println("Foram $par números pares e $impar números ímpares")
}

/*------------------------------------------------------------------------------------------*/

/*12. Inicialize um número que conterá o final da iteração. Apresente em console
todos os valores de 1 ao número inicializado que são divisíveis por 5.*/

fun main(args:Array<String>){
   	var x:Int = 1
	while (x < 100){
		if(x % 5 == 0){
			println("Os números divisiveis por 5 : $x")
		}
		x++
	}

}

/*------------------------------------------------------------------------------------------*/

/*13. Inicialize um vetor de 10 posições e exiba cada um dos elementos em
console.*/
fun main(args:Array<String>){
    println(array())
}

fun array() {
var vetor1 = IntArray(10){10*(it+1)}
for ((indice, valor) in vetor1.withIndex()){
    println("Elemento [$indice] é $valor")
	}
}

/*------------------------------------------------------------------------------------------*/

/*14. Passe 4 parâmetros nulos para uma função e verifique quais dos valores
fornecidos não são nulos, exibindo-os em console. Realize 4 chamadas simples
a partir da função main, em que uma delas deve conter a especificação do valor
para um dado parâmetro.*/

fun main(args: Array<String>) {
    var str: String? = "Csharp" 
    str?.length 
    var str1: String? = "Kotlin"
    str1?.length
    var str2: String? = "Java"
    val nome1:String? = null
    nome1.let {
        println("nome is $nome1")
    }
    val nome:String? = null
    nome?.let {
        println("nome is $nome")
    }
    var nome2: Any
    var nome3: Any
}



/*------------------------------------------------------------------------------------------*/

/*15. Explique o funcionamento do código abaixo*/
import java.util.Arrays
fun main(){
	val nums = arrayOf(1, 2, 3, 4, 5)
	println(nums.get(0))
	nums.set(0, 0)
	println(Arrays.toString(nums))
	val nums2 = nums.plus(1)
	println(Arrays.toString(nums2))
	val slice = nums.sliceArray(1..3)
	println(Arrays.toString(slice))
	println(nums.first())
	println(nums.last())
	println(nums.indexOf(5))
}


/*RESPOSTA*

O código acima inicia um array com 5 posições
o metodo get() retorna o elemento no indice especificado
o metodo set() insere um elemento passado como parametrono indice especificado
Ao printar o array, o java retorna o código hash do mesmo,porém ao importar a classe java.util.Arrays podemos converter os elementos para string e realizar o print
O metodo plus() adiciona um elemento ao fim do array
o metodo sliceArray() retorna um array delimitado pelos parametros passados 
Os metodos first e last retornam respectivamente o primeiro e ultimo elemento do array, o metodo indexOf retorna o elemento no indice passado como parametro

*/

/*------------------------------------------------------------------------------------------*/


/* 16) Explique cada um dos conceitos abaixo aplicáveis no Kotlin:
• Kotlin Unit
É um tipo de retorno de uma função que não retorna nenhum valor. Função sem retorno.


• Operadores ternários
Operador Ternário (?:) verifica uma condição e retorna um dentre dois valores pré-definidos em sua estrutura.

• Modularização e principais vantagens
Dividir o programa em módulos para facilitar a manutenção e leitura do código.

• Formas de passagem de parâmetros em Kotlin
Parâmetro variável 	ex:  fun average (vararg numbers:Int)
Parâmetro padrão 	ex:  fun printName (name: String = "Anônimo")

• Operações Seguras
Adicionar “?” no parâmetro para que seja permitido receber o valor Null e evitar NullPointerExceptions.

• Tipagem do Kotlin (fracamente tipada ou fortemente tipada)
Fortemente tipada. As operações entre valores de tipos diferentes, resultará em erros ou exceções

*/
