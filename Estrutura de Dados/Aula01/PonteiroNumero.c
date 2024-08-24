#include <stdio.h> //Necessário para printf

int main() {
    int x = 5;
    int *p = & x; //Declarando ponteiro * e endereço da variável &
    printf("Valor de x: %d \n", *p);

    return 0;
}