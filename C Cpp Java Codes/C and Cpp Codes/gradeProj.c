#include<stdio.h>
#include<conio.h>

int main(void){

	int grade;
	printf("Please enter your Grade: ");
	scanf("%d", &grade);
	if(grade > 74 && grade <= 99)
        printf("Passed");
    else if (grade == 100)
        printf("This grade is not applicable for a result!");
    else
        printf("Failed");
    return 0;
}
