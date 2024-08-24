//Pivo.c
#include <stdio.h>
int main()
{

    int x = 5;
    int *px;
    px = &x;
    printf("Valor de x: %d\n", *px);

    return 0;
}

// exemplo 1
// Exemplo 1: Ponteiro

#include <stdio.h>

int main() // Declarando função
{
    int x = 10; // Declaração de uma variável inteira
    int *ptr;   // Declaração de um ponteiro para inteiro

    ptr = &x; // O ponteiro ptr armazena o endereço de x

    // Exibindo o valor de x, o endereço de x, e o valor armazenado no ponteiro ptr
    printf("Valor de x: %d\n", x);
    printf("Endereco de x: %p\n", &x);
    printf("Valor armazenado em ptr (endereco de x): %p\n", ptr);
    printf("Valor apontado por ptr (valor de x): %d\n", *ptr);

    // Modificando o valor de x usando o ponteiro ptr
    *ptr = 30;

    // Exibindo o novo valor de x após a modificação
    printf("Novo valor de x: %d\n", x);

    return 0;
}

// exemplo 2
// escrever um codigo usando pivo que calcule o quadrado de um número

#include <stdio.h>
// Função que calcula o quadrado de um número usando ponteiro
void calcularQuadrado(int *n)
{
    *n = (*n) * (*n); // Acessa o valor apontado pelo ponteiro e calcula o quadrado
}

int main()
{
    int numero; // Declaração de uma variável inteira para armazenar o número
    int *ptr;   // Declaração de um ponteiro para inteiro

    // Solicita que o usuário insira um número
    // printf("Digite um numero inteiro: ");

    // scanf("%d", &numero); // Lê o número inserido e o armazena na variável 'numero'

    numero = 40;
    ptr = &numero; // O ponteiro ptr armazena o endereço de 'numero'

    // Chama a função para calcular o quadrado do número usando o ponteiro
    calcularQuadrado(ptr);

    // Exibe o resultado, que agora está armazenado na variável 'numero'
    printf("O quadrado do numero e: %d\n", numero);

    return 0; // Finaliza o programa
}
// escrever um codigo que  calcule a soma de array
#include <stdio.h>

int main()
{
    int arr[] = {1, 2, 3, 4, 5};                // Declaração de um array de inteiros
    int tamanho = sizeof(arr) / sizeof(arr[0]); // Calcula o tamanho do array
    int soma = 0;                               // Variável para armazenar a soma dos elementos
    int *ptr;                                   // Declaração de um ponteiro para inteiro

    ptr = arr; // O ponteiro ptr aponta para o primeiro elemento do array

    // Loop para percorrer todos os elementos do array usando o ponteiro
    for (int i = 0; i < tamanho; i++)
    {
        soma += *(ptr + i); // Soma o valor apontado pelo ponteiro e o índice
    }

    // Exibe o resultado da soma
    printf("A soma dos elementos do array e: %d\n", soma);

    return 0; // Finaliza o programa
}

// escrever um codigo que  calcule a multiplicação de array
#include <stdio.h>

int main()
{
    int arr[] = {1, 2, 3, 4, 5};                // Declaração de um array de inteiros
    int tamanho = sizeof(arr) / sizeof(arr[0]); // Calcula o tamanho do array
    int soma = 1;                               // Variável para armazenar a soma dos elementos
    int *ptr;                                   // Declaração de um ponteiro para inteiro

    ptr = arr; // O ponteiro ptr aponta para o primeiro elemento do array

    // Loop para percorrer todos os elementos do array usando o ponteiro
    for (int i = 0; i < tamanho; i++)
    {
        soma *= *(ptr + i); // Multiplicação o valor apontado pelo ponteiro e o índice
    }

    // Exibe o resultado da soma
    printf("A soma dos elementos do array e: %d\n", soma);

    return 0; // Finaliza o programa
}
/// Escreva uma função que multiplica dois números inteiros usando ponteiros e
/// retorna o resultado por referência.

#include <stdio.h>

// Função que multiplica dois números e retorna o resultado por referência
void multiplicar(int *a, int *b, int *resultado)
{
    *resultado = (*a) * (*b); // Multiplica os valores apontados por 'a' e 'b' e armazena em 'resultado'
}

int main()
{
    int num1, num2, produto; // Declaração de variáveis inteiras

    // Solicita ao usuário que insira dois números inteiros
    printf("Digite o primeiro numero: ");
    scanf("%d", &num1);

    printf("Digite o segundo numero: ");
    scanf("%d", &num2);

    // Chama a função 'multiplicar', passando os endereços das variáveis
    multiplicar(&num1, &num2, &produto);

    // Exibe o resultado da multiplicação
    printf("O produto de %d e %d e: %d\n", num1, num2, produto);

    return 0; // Finaliza o programa
}