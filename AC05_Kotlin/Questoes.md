# 1) Explique o que são Layouts e quais são os tipos existentes para serem trabalhados no contexto de uma aplicação Mobile.
## Resposta: O layout define a estrutura de uma interface do usuário no aplicativo, como acontece na atividade. Todos os elementos do layout são criados usando a hierarquia de objetos View e ViewGroup. A View geralmente desenha algo que o usuário pode ver e com que pode interagir. Já um ViewGroup é um contêiner invisível que define a estrutura do layout para View e outros objetos ViewGroup Os objetos View geralmente são chamados de "widgets" e podem ser uma das muitas subclasses, como Button ou TextView. Os objetos ViewGroup geralmente são chamados de layouts e podem ser de um dos muitos tipos que fornecem uma estrutura de layout diferente, como LinearLayout ou ConstraintLayout . Um layout pode ser declarado de duas maneiras:
### - Declarar elementos da IU em XML. O Android fornece um vocabulário XML direto que corresponde às classes e subclasses de visualização, como as de widgets e layouts. Também é possível usar o Layout Editor do Android Studio para criar o layout XML usando uma interface de arrastar e soltar.

### - Instanciar elementos do layout no momento da execução. O aplicativo pode criar objetos View e ViewGroup (e processar suas propriedades) programaticamente. Ao declarar a IU no XML, é possível separar a apresentação do seu aplicativo do código que controla o comportamento dele. O uso de arquivos XML também facilita conseguir layouts diferentes para diferentes orientações e tamanhos de tela. Isso é discutido em Compatibilidade com diferentes tamanhos de tela.

-------------------------------------------------------------------------------------------------------------------------------------------

# 2) Apresente as principais diferenças do Linear Layout para o Relative Layout e quando é mais apropriado a utilização de cada um deles.

## Resposta: LinearLayout é um grupo de visualizações que alinha todos os filhos em uma única direção vertical ou horizontal. Você pode especificar a direção do layout com o atributo android:orientation.Todos os filhos de um LinearLayout são empilhados um após o outro. Portanto, uma lista vertical terá somente um filho por linha, independentemente da largura, e uma lista horizontal terá altura de apenas uma linha (a altura do filho mais alto, mais preenchimento). Um LinearLayout respeita margens entre filhos e a gravidade (alinhamento à direita, no centro ou à esquerda) de cada filho.

## O Relative Layout é o tipo de layout utilizado no Android para se posicionar os elementos em relação a outro. Por exemplo, se temos um Text View e o desenvolvedor posicionar o botão a sua esquerda, no XML pode-se fazer referência a esse para que o elemento de tela seja posicionado em um determinado lugar de acordo com sua posição.Meios baseados na relação de pontos de vista de seus pais e outros pontos de vista.as visualizações são alinhadas com seu pai, o próprio RelativeLayout ou outras exibições. Por exemplo, declaramos que a descrição está alinhada com a parte inferior do RelativeLayout e que o título está posicionado acima da descrição e ancorado na parte superior do pai. Com a descrição GONE, o RelativeLayout não sabe onde posicionar o Edge inferior do título. Para resolver esse problema, você pode usar um parâmetro de layout muito especial chamado alignWithParentIfMissing .



-------------------------------------------------------------------------------------------------------------------------------------------
# 3) Desenvolva um aplicativo que receba 5 notas de um aluno durante o semestre letivo. Calcule a média final do aluno. Caso a nota do aluno tenha sido maior ou igual a 6, exibir uma mensagem indicando que ele foi aprovado. Entre 3 a 5.9, exibir uma mensagem indicando que ele está de exame. Menor do que 3, exibir uma mensagem indicando que o aluno foi reprovado.

-------------------------------------------------------------------------------------------------------------------------------------------

# 4) Crie um formulário utilizando o Relative Layout para o cadastro de um funcionário. O formulário deve conter as seguintes propriedades
## • ID do funcionário (TextView e EditText)
## • Nome do funcionário (TextView e EditText)
## • Cargo do funcionário (TextView e EditText)
## • Data de admissão do funcionário (TextView e EditText)
## • Endereço do funcionário (TextView e EditText)
## • Botões para Inserir, Alterar, Excluir e Consultar as informações relacionadas ao cadastro.

-------------------------------------------------------------------------------------------------------------------------------------------
## -----> Exercícios extras, não obrigatórios; mas que podem ser cobrados na avaliação. <-----


# 5) Considerando o cenário descrito no Exercício 4, realize o CRUD de funcionários, criando uma tabela em banco de dados com cada uma das propriedades descritas no Exercício 4. O ID do funcionário deve ser gerado automaticamente e ter incremento de um elemento para cada novo cadastro, em que:
## • Para a inclusão do funcionário o ID não deve ser preenchido na interface gráfica.
## • Para a alteração do cadastro de um funcionário, o filtro de busca sempre será o ID do mesmo. Ou seja, o usuário informará na interface gráfica o ID desejado para alteração.
## • Para a exclusão do cadastro de um funcionário, o filtro de busca sempre será o ID do mesmo. Todos os campos, exceto o ID do funcionário deverão ser alterados no banco de dados.
## • Para a consulta do funcionário, a pesquisa deve apresentar todos os dados de todos os funcionários que estão cadastrados em base, seguindo a mesma linha do exemplo apresentado em aula.

-------------------------------------------------------------------------------------------------------------------------------------------

# 6) Explique o princípio de funcionamento do SQLite e qual a sua importância no processo de desenvolvimento Mobile.

## Resposta: Salvar dados em um banco de dados é ideal para dados estruturados ou que se repetem, por exemplo, os dados de contato. Esta página supõe que você esteja familiarizado com os bancos de dados SQL em geral e ajuda a começar a trabalhar com bancos de dados SQLite no Android. As APIs necessárias para usar um banco de dados no Android estão disponíveis no pacote android.database.sqlite.Um dos princípios mais importantes dos bancos de dados SQL é o esquema: uma declaração formal de como o banco de dados é organizado. O esquema é refletido nas declarações SQL usadas na criação do banco de dados. É aconselhável criar uma classe de acompanhamento, conhecida como classe de contrato, que especifica explicitamente o layout do esquema de forma sistemática e autodocumentada.Uma classe de contrato é o contêiner das constantes que definem nomes para URIs, tabelas e colunas. A classe de contrato permite usar as mesmas constantes em outras classes no mesmo pacote. Isso permite que você altere o nome de uma coluna em um local e que a mudança se propague por todo o código.Uma boa forma de organizar uma classe de contrato é colocar definições que sejam globais para todo o banco de dados no nível raiz da classe. Em seguida, crie uma classe interna para cada tabela. Cada classe interna enumera as colunas da tabela correspondente.
