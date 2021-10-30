# 1) Explique os principais recursos que fazem parte da composição do Android Studio.

-----------------------------------------------------------------------------------------

# 2) Detalhe cada um dos componentes que estão inclusos no contexto de uma aplicação em Android.
## Resposta:

### - Activities são as representantes das telas da aplicação. Associada a uma activity normalmente existe uma view, que define como será feita a exibição visual para o usuário. As activities são responsáveis por gerenciar os eventos de tela e também coordenam o fluxo da aplicação.

### - Os Services são códigos que executam em segundo plano. Normalmente são utilizados para tarefas que demandam um grande tempo de execução.

### - Os Content Providers (provedores de conteúdos) são a maneira utilizada pela plataforma para compartilhar dados entre as aplicações que executam no dispositivo. Um exemplo bem claro disto é a aplicação de gerenciamento de contatos do Android, que é nativa. Aplicações desenvolvidas por terceiros podem utilizar um content provider a fim de ler os contatos armazenados no dispositivo de forma simples.

### - Os Broadcast Receivers são componentes que ficam "escutando" a ocorrência de determinados eventos, que podem ser nativos ou disparados por aplicações. Uma aplicação pode, por exemplo, utilizar um broadcast receiver para ser avisada quando o dispositivo estiver recebendo uma ligação e, com base nessa informação, realizar algum tipo de processamento.

### - Junto os estes componentes, existe o arquivo de manifesto AndroidManifest.xml. Ele é obrigatório e único para cada aplicação. É nele que são feitas as configurações gerais da aplicação e dos componentes que fazem parte dela. E, juntando tudo isto, existe a figura do Android Core, que na verdade não é um componente específico, mas sim a plataforma Android propriamente dita. É ele quem proporciona a interação entre os componentes e as aplicações e torna possível a execução do código.

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

## Resposta: 
### - Na camada Linux Kernel está localizado o sistema operacional da plataforma, que é baseado no Linux. Ela é responsável por serviços de mais baixo nível da plataforma, como gerenciamento de memória e processos, segurança, etc.

### - Na camada Libraries estão as bibliotecas nativas escritas em C/C++ que fazem parte da plataforma. Estão nesta camada APIs como o OpenGL ES (para renderização 3D), SQLite (gerenciador de bancos de dados) e suporte a diversos formatos de áudio e vídeo.

### - A camada Android Runtime dá condições para que as aplicações baseadas na plataforma sejam executadas. Um dos componentes desta camada são as core libraries, que disponibilizam uma API Java utilizada para programação (grande parte das funcionalidades encontradas no Java SE estão disponíveis para o Android). Já o outro componente é a Dalvik Virtual Machine, que é uma máquina virtual para suporte à execução de aplicações.

### - Na camada Application Framework ficam as APIs do Android que são normalmente utilizadas pelas aplicações que executam sobre a plataforma. Os gerenciadores de serviços de telefonia, localização e notificação são alguns exemplos do que este framework disponibiliza.

### - Por fim, a camada Applications representa as aplicações que executam sobre a plataforma. Elas podem ser tanto aplicações nativas - como o gerenciador de contatos, navegador, calendário, etc. - como aplicações criadas por terceiros. Aliás, para o Android não existe distinção entre aplicações nativas e aplicações desenvolvidas por outras pessoas, e é esta característica que garante a ela o alto grau de flexibilidade e extensibilidade da plataforma.

-----------------------------------------------------------------------------------------
# 5) Considerando uma aplicação desenvolvida em Android que possui uma série de diretórios gerados automaticamente, no ato da criação de um aplicativo, detalhe cada um dos diretórios que fazem parte de sua composição.
-----------------------------------------------------------------------------------------
# 6) O processo de desenvolvimento em Android sempre necessita de que sejam realizados downloads de pacotes e dependências que serão trabalhadas no contexto da aplicação. Descreva para que serve o Gradle Scripts e qual a sua importância em um aplicativo Android.

## Resposta: O Gradle é um build system moderno que juntou as melhores características de outros sistemas de build em um só. Ele é roda sobre a JVM, o que permite que você escreva código em Java para executar seus scripts durante o build, o que é perfeito para os programadores Java.Ele funciona baseado em plugins. Isso permite que desenvolvedores de outras linguagens possam criar seus próprios scripts para, durante a compilação, outras tarefas sejam executadas.

-----------------------------------------------------------------------------------------

# 7) Descreva em detalhes o que é um emulador, quais são as suas principais características e qual a sua importância no contexto de uma aplicação Mobile.

## Resposta: O Android Emulator simula dispositivos Android no seu computador. Assim, você pode testar seu aplicativo em diversos dispositivos e níveis da API do Android, sem precisar ter todos os dispositivos físicos. O emulador oferece quase todos os recursos de um dispositivo Android real. É possível simular o recebimento de chamadas telefônicas e mensagens de texto, especificar o local do dispositivo, simular diferentes velocidades de rede, simular rotação e outros sensores de hardware, acessar a Google Play Store e muito mais. O teste do app no emulador é, de certa forma, mais rápido e mais fácil do que fazer isso em um dispositivo físico. Por exemplo, você pode transferir dados mais rapidamente para o emulador do que para um dispositivo conectado via USB.

-----------------------------------------------------------------------------------------
# 8) Explique o que é um evento e detalhe quando ele deve ser utilizado no processo de desenvolvimento de software para dispositivos móveis.
-----------------------------------------------------------------------------------------
# 9) Explique o princípio de funcionamento do depurador do Android Studio e quando ele deve ser utilizado durante o desenvolvimento da aplicação.
