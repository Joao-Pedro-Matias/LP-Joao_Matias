![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| Presence{ Presença >=75%? }
        verification --> |Não| B[/ Reprovado /]
        Presence --> |Sim| A[/Aprovado/]
        Presence --> |Não| C[/Reprovado/]
        A --> finish([Fim])
        B --> finish
        C --> finish
   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
      start(( Início)) --> input1[\ Digite o número 1 \]
      input1 --> input2[\ Digite o número 2 \]
      input2 --> operation[N1 + N2]
      operation --> result[/ Resultado /]
      result --> finish([ Fim ])
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
      start(( início )) --> input[\ Número \]
      input --> verification1{ Número = 0}
      verification1 --> |Sim| result1[/ Neutro /]
      verification1 --> |Não| verification2{ Número > 0 }
      verification2 --> |Sim| result2[/ Positivo /]
      verification2 --> |Não| result3[/ Negativo /]
      result1 --> finish([ Fim ])
      result2 --> finish
      result3 --> finish

   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> age[\ Idade \]
      age --> verification1{ Idade > 16}
      verification1 --> |Sim| verification2{ Idade > 18 } 
      verification1 --> |Não| result1[/ Não pode votar /]
      verification2 --> |Sim| result2[/ Deve votar /]
      verification2 --> |Não| result3[/ Pode votar /]
      result1 --> finish([ Fim])
      result2 --> finish
      result3 --> finish
      
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start(( Início)) --> number1[\ Número 1\]
      number1 --> number2[\ Número 2\]
      number2 --> verification{ N1 > N2}
      verification --> |Sim| result1[/ O número 1 é maior /]
      verification --> |Não| verification2{N1 = N2}
      verification2 --> |Sim| result2[\ Números Iguais \]
      verification2 --> |Não| result3[/ o número 2 é maior/]
      result1 --> finish([Fim])
      result2 --> finish
      result3 --> finish

   
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start(( Inicío)) --> number1[\ Número 1 \]
      number1 --> number2[\ Número 2 \]
      number2 --> number3[\ Número 3 \]
      number3 --> verification{N1=N2 or N1=N3<br> or N2=N3}

      verification --> |Sim| verification1{N1=N2 and N1=N3}
      verification1 --> |Sim| result[/ Todos os números são iguais /]
      verification1 --> |Não| verification2{N1=N2}
      
      verification2 --> |Sim| verification3{N1>N3}
      verification3 --> |Sim| result1[/ O número 1 e o número 2 são os maiores /]
      verification3 --> |Não| result6[/ O número 3 é o maior /]

      verification2 --> |Não| verification4{N1=N3}      
      verification4 --> |Sim| verification5{N1>N2}
      verification5 --> |Sim| result2[/ O número 1 e o número 3 são os maiores /]
      verification5 --> |Não| result5[/ O número 2 é o maior /]

      verification4 --> |Não| verification6{N2>N1}
      verification6 --> |Sim| result3[/ O número 2 e o número 3 são os maiores /]
      verification6 --> |Não| result4[/ O número 1 é o maior /]
      
   
      verification --> |Não| verification7{N1>N2 and N1>N3}
      verification7 --> |Sim| result7[/ O número 1 é o maior /]
      verification7 --> |Não| verification8{N2>N3}
      verification8 --> |Sim| result8[/ O número 2 é o maior /]
      verification8 --> |Não| result9[/ O número 3 é o maior /]
      
      result --> finish([Fim])
      result1 --> finish
      result2 --> finish
      result3 --> finish
      result4 --> finish
      result5 --> finish
      result6 --> finish
      result7 --> finish
      result8 --> finish
      result9 --> finish
   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
      Start(( Início)) --> number[\ Número \]
      number --> verification{n ∈ N and n>1}
      verification --> |Não| verification1{n=1 or n=0}
      verification1 --> |Sim| result[/ Resultado=1 /]
      verification1 --> |Não| result1[/ Número não pertence<br>aos números naturais/]
      
      verification --> |Sim| operation[x=n]
      operation --> verification2{n=2}
      verification2 --> |Sim| result2[/ Resultado=x /]
      verification2 --> |Não| operation3[n--]
      operation3 --> operation2[x=n*x]
      operation2 --> verification2
      
      result --> finish([Fim])
      result1 --> finish
      result2 --> finish
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2
   
   ```mermaid
   flowchart TD
      start(( Início )) --> number[\ Número \]
      number --> verification{ N ∈ Z}
      verification --> |Não| result[/Número não pertence aos números inteiros/] 
      
      verification --> |Sim| operation[ N % 2]
      operation --> verification1{ Resultado = 1 }
      verification1 --> |Sim| result1[/ Número Ímpar /]
      verification1 --> |Não| result2[/ Número Par /]

      result --> finish([ Fim ])
      result1 --> finish
      result2 --> finish

   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> number[\ Número \]
      number --> verification{n ∈ N}      
      verification --> |Não| result[/Não pertence aos números naturais/]

      verification --> |Sim| verification1{n=0 or n=1}
      verification1 --> |Sim| result2[/ Número não é primo /]
      verification1 --> |Não| verification2{ N=2 }
      
      
      verification2 --> |Sim| result1[/ Número primo /]
      verification2 --> |Não| operation[ N : 2 = x ]
      operation --> verification3{x ∈ Z}
      verification3 --> |Sim| result2
      verification3 --> |Não| operation1[x + .5 = x]
      operation1 --> operation2[ x-- ]
      operation2 --> verification4{  N : x ∈ Z}
      verification4 --> |Sim| result2
      verification4 --> |Não| verification5{ x = 3 }
      verification5 --> |Sim| result1
      verification5 --> |Não| operation2
      
      result --> finish([ Fim ])
      result1 --> finish
      result2 --> finish
    
   
   ```