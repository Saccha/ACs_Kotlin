# 1) Explique os principais recursos que fazem parte da composição do Android Studio.

-----------------------------------------------------------------------------------------

# 2) Detalhe cada um dos componentes que estão inclusos no contexto de uma aplicação em Android.

-----------------------------------------------------------------------------------------

# 3) Explique o que é o ciclo de vida de uma Activity e quais métodos podem ser utilizados.
## Resposta: A Activity é um componente de aplicação com um ciclo de vida específico. Quando o usuário acessa a aplicação, navega pelas opções, sai ou retorna para a mesma, as atividades que a compõem passam por uma série de estados do ciclo de vida. Sempre que a Activity muda de estado, o Android aciona um método (callback) correspondente.
## Métodos:
### - onCreate(): Chamado quando a atividade é criada pela primeira vez.
### - onStart(): Chamado logo antes de a atividade se tornar visível ao usuário.
### - onResume(): Chamado logo antes de a atividade iniciar a interação com o usuário. Nesse ponto, a atividade está em plena execução, recebendo e reagindo a ações do usuário da aplicação.
### - onPause(): Chamado quando o sistema está prestes a retomar outra atividade.                 
### - onStop(): Chamado quando a atividade não está mais visível ao usuário. Isso pode acontecer porque ela está sendo destruída ou porque outra atividade (uma existente ou uma nova) foi retomada e está cobrindo-a.
### - onRestart(): Chamado depois que atividade tiver sido interrompida, logo antes de ser reiniciada. 
### - onDestroy(): Chamado antes de a atividade ser destruída. É a última chamada que a atividade receberá. 



-----------------------------------------------------------------------------------------
# 4) Descreva cada uma das camadas que fazem parte de uma aplicação Android.
-----------------------------------------------------------------------------------------
# 5) Considerando uma aplicação desenvolvida em Android que possui uma série de diretórios gerados automaticamente, no ato da criação de um aplicativo, detalhe cada um dos diretórios que fazem parte de sua composição.
-----------------------------------------------------------------------------------------
# 6) O processo de desenvolvimento em Android sempre necessita de que sejam realizados downloads de pacotes e dependências que serão trabalhadas no contexto da aplicação. Descreva para que serve o Gradle Scripts e qual a sua importância em um aplicativo Android.
## Resposta: O Gradle é um build system moderno que juntou as melhores características de outros sistemas de build em um só. Ele é roda sobre a JVM, o que permite que você escreva código em Java para executar seus scripts durante o build, o que é perfeito para os programadores Java.Ele funciona baseado em plugins. Isso permite que desenvolvedores de outras linguagens possam criar seus próprios scripts para, durante a compilação, outras tarefas sejam executadas.

-----------------------------------------------------------------------------------------
# 7) Descreva em detalhes o que é um emulador, quais são as suas principais características e qual a sua importância no contexto de uma aplicação Mobile.
-----------------------------------------------------------------------------------------
# 8) Explique o que é um evento e detalhe quando ele deve ser utilizado no processo de desenvolvimento de software para dispositivos móveis.
-----------------------------------------------------------------------------------------
# 9) Explique o princípio de funcionamento do depurador do Android Studio e quando ele deve ser utilizado durante o desenvolvimento da aplicação.
