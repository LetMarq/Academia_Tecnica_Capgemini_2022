# Academia_Tecnica_Capgemini_2022

Repositório de Letícia Marques Pinho Tiago para exercícios realizados na Academia Técnica Capgemini 2022 :star:

Todos os exercícios foram resolvidos usando a linguagem Java na IDE Eclipse, portanto os códigos estarão dentro da pasta Exercício :arrow_right: Src :arrow_right: Package :arrow_right: Arquivo

Para a realização dos testes unitários, utilizou-se do pacote **JUnit 4**. Para a instalação do pacote utilizou-se as seguintes instruções: [Instalação JUnit 4](https://www.guru99.com/download-installation-junit.html). Para rodar as aplicações, deverão baixar os pacotes de exercícios e abrir no próprio Eclipse.

| Exercícios |
|--- |
| [Exercício 1](#Exercicio1) | column 2 | column 3 |
| [Exercício 2](#Exercicio2) | row 2 column 2 | row 2 column 3 |
| [Exercício 3](#Exercicio3) | row 2 column 2 | row 2 column 3 |


<div id=Exercicio1></div>
<h2> Exercício 1 </h2>

A função ```returnAsterisco``` recebe o número de linhas desejadas para a escada, e por meio de um laço formata a String corretamente e a retorna.

Para os testes unitários, utilizou-se a função ```assertEquals``` do JUnit para comparar o resultado esperado da String, com a própria função ```returnAsterisco```, e o código passou com sucesso nos testes.

![Teste exercicio 1](https://i.ibb.co/zFdb5mB/imagem-2022-02-18-142453.png)

<div id=Exercicio2></div>
<h2> Exercício 2 </h2>

A função ```passwordCheck``` recebe a senha a ser analisada. Como a senha deve possuir os 5 critérios definidos, criou-se uma variável booleana de valor inicial `false`, e por meio de verficações, altera-se o valor inicial booleano caso a senha possua o critério analisado. Posteriormente a variável `password_last`é incrementada de acordo com os critérios não satisfeitos.

Para os testes unitários, utilizou-se a função ```assertEquals``` do JUnit para comparar o resultado esperado do número mínimo de
caracteres que devem ser adicionados para uma string qualquer ser considerada segura, com a própria função ```passwordCheck```, e o código passou com sucesso nos testes.

![Teste exercicio 2](https://i.ibb.co/mDWFW8W/imagem-2022-02-18-155744.png)

<div id=Exercicio3></div>
<h2> Exercício 3 </h2>

A função `testSubstring` recebe a string a ser analisada, e movimenta duas janelas que percorrem a string de 0 até seu tamanho total (sliding window). 

> Ex: Ovo, primeira janela: o, segunda janela: v, incremento, primeira janela: o, segunda janela: o, incremento, primeira janela: ov, segunda janela: vo. 

> ![Exemplo](https://i.ibb.co/wyL2Djm/imagem-2022-02-18-171203.png)


Já a função `compareStrings` recebe e compara as janelas, e caso uma equivalência entre os caracteres seja encontrada, o caracter é deletado de ambas as strings, e caso ao final ambas possuem tamanho zero, a função retorna `True` pois elas serão um anagrama, caso essa avaliação não seja verdadeira, a função retorna `False`. O código passou com sucesso nos testes.

![Teste exercicio 3](https://i.ibb.co/q0gbFyt/imagem-2022-02-18-160250.png)
