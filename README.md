# LAB - Criando um app de lembretes e tarefas com Kotlin.
O curso pode ser acessado na plataforma da [Digital Innovation One](https://digitalinnovation.one/).

Projeto original de [Ezequiel Messore](https://github.com/EzequielMessore).

## <br />Descrição do Lab.
O objetivo do projeto é criar um App de `To do list` do zero mostrando o processo de desenvolvimento usando Kotlin, uma das linguagens de programação de maior ascensão dos últimos anos. Além disto, desafiar a evolução do App e entregar uma solução mais robusta pensando sempre na melhor experiência do usuário.

## Desafios

Tornar nosso aplicativo um aplicativo resiliente que não perca nossas tarefas salvas quando é encerrado, para isto podemos usar a estratégia de salvar nossos dados localmente.
Podemos fazer isto de duas maneiras usar nossas [Shared Preferences](https://developer.android.com/training/data-storage/shared-preferences?hl=pt-br) ou nosso [SQLite](https://developer.android.com/training/data-storage/sqlite) para utilizar os esses conceitos de uma maneira facilitada devemos usar as seguintes bibliotecas:

- [Room](https://developer.android.com/training/data-storage/room): é um banco de dados que oferece uma camada de abstração sobre o SQLite, e nos ajuda a lidar melhor com a complexidade do mesmo.

- [DataStore](https://developer.android.com/topic/libraries/architecture/datastore?hl=pt-br): é uma solução de armazenamento de dados que permite armazenar pares de chave-valor ou objetos tipados.
