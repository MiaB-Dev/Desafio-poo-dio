<h1> Desafio: Aprenda na Prática Programação Orientada a Objetos</h1>

O desafio tem como objetivo, exercitar umas das principais ferramentas da OO: abstração, encapsulamento, herança e polimorfismo, por meio de um projeto Java. 

<p>
<br>
<h2> O Projeto</h2>

<p>
O projeto desenvolvido foi o de um simulador de bootcamps utilizando como base o código da professora Camila Cavalcante com modificações e algumas melhorias, além da implementação da interface gráfica. É possível criar cursos e mentorias que são inseridos em bootcamps, estes por sua vez recebem inscrições de desenvolvedores (devs), que podem ganhar experiência (XP) ao progredir em cada conteúdo. Um dev pode se inscrever em múltiplos bootcamps assim como uma mentoria ou curso pode estar em múltiplos bootcamps.
</p>

<br>
<h2> Requisitos</h2> 
<ul>
  <li>Java 17</li>
  <li>Gradle 8.0.1</li>
</ul>

<br>

## Classes e pacotes
<p>
As classes do projeto estão alocadas em 3 pacotes:

### Desafio.poo
Possui a classe App.java, responsável por executar o programa através da instanciação da classe Menu.

### br.com.dio.desafio.gui
Contém as classes responsáveis pela interface gráfica e as instanciações necessárias para o programa, fazendo também as chamadas dos métodos-base do código. A classe menu apresenta uma tela inicial e permite acessar outras telas (criando instâncias). As classes iniciadas com o prefixo "F" indicam que são formulários para criação de objetos (cursos, mentorias, devs e bootcamps) e para inscrição de devs em bootcamps. Por fim, as classes iniciadas com "Lista" são responsáveis por exibir os dados gravados no programa (a listagem de cursos, por exemplo).

### br.com.dio.desafio.dominio
Pacote contendo as classes que são usadas no back-end do programa. Por exemplo, a classe Bootcamp possui os métodos e atributos necessários para gerenciar bootcamps enquanto as classes Curso, Mentoria e Dev fazem o mesmo para cursos, mentorias e devs, respectivamente. A classe Conteudo é uma classe abstrata de onde as classes Curso e Mentoria herdam atributos e métodos.


## Créditos
Código original: [Camila Cavalcante](https://www.linkedin.com/in/cami-la/ "cami-la").

Imagem da tela principal tem autoria de © <a href='https://www.123rf.com/profile_captainvector'>captainvector</a>, <a href='https://www.123rf.com/free-images/'>123RF Free Images</a>