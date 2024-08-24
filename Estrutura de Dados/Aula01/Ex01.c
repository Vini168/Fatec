#include <stdio.h> // Função para trocar os valores de duas variáveis usando ponteiros

int main(){

    int a = 10;
    int b = 11;
    int *x = &a;
    int *y = &b;

    int temp = *x;
    *x = *y;
    *y = temp;

    printf("Valor de x: %d Valor de y:%d \n", *x, *y);

    return 0;

}

