# Exercícios Java Básico

Este projeto contém duas listas de exercícios desenvolvidos em Java, organizados em pacotes separados (`lista1` e `lista2`). O objetivo é praticar lógica de programação, entrada e saída de dados, e estruturação de projetos.

## Tecnologias utilizadas

- Java 21+
- VS Code com WSL
- SDKMAN para gerenciamento de Java
- Git + GitHub

---

## Organização do Projeto

```
src/
├── lista1/
│   ├── Tabuada.java
│   ├── IMC.java
│   ├── ParImpar.java
│   ├── Divisao.java
│   └── MenuLista1.java
├── lista2/
│   ├── Hello.java
│   ├── Square.java
│   ├── Rectangle.java
│   ├── AgeDifference.java
│   └── MenuLista2.java
└── App.java
```

---

## Lista 1 – Exercícios

1. **Tabuada:** Gera a tabuada de um número informado pelo usuário.
2. **IMC:** Calcula o Índice de Massa Corporal e informa a classificação.
3. **Par ou Ímpar:** Lista os números pares ou ímpares entre dois valores informados (em ordem decrescente).
4. **Divisão:** Recebe números até que um deles não seja divisível pelo número inicial.

---

## Lista 2 – Exercícios

1. **Hello:** Calcula a idade da pessoa a partir do ano de nascimento.
2. **Quadrado:** Calcula a área de um quadrado.
3. **Retângulo:** Calcula a área de um retângulo.
4. **Diferença de Idade:** Mostra a diferença de idade entre duas pessoas.

---

## Como rodar o projeto

> Certifique-se de ter o Java instalado e configurado (via SDKMAN, por exemplo)

1. Clone o repositório:
```bash
git clone https://github.com/fellipedoprado/exercicios-java-basico-impl.git
cd nome-do-projeto
```

2. Compile:
```bash
javac -d bin src/**/*.java
```

3. Execute (exemplo com a `App.java` principal):
```bash
java -cp bin App
```

---

## Autor

Feito por [Fellipe do Prado Arruda](https://github.com/fellipedoprado)
