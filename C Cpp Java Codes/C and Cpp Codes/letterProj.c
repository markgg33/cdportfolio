#include<stdio.h>
#include<conio.h>

main(){

    char l;
    printf("Enter Any Letter: ");
    scanf("%c", &l);
    if (l == 'M' || l == 'm')
        printf("MCDONALDS");
    else if(l == 'A' || l == 'a')
        printf("A & W");
    else if(l == 'E' || l == 'e')
        printf("Eats up to you!");
    else
        printf("Invalid Letter");
    return 0;

}
