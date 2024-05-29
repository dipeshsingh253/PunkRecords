#include <stdio.h>

struct student_details
{
    char name[30];
    int rollnumber;
    char address[100];
    char course[10];
} students[2];


int main()
{
    for (int i = 0; i < 2; i++)
    {
        printf("Enter Name: \n");
        scanf("%s",students[i].name);
        printf("Enter Rollnumber: \n");
        scanf("%d", &students[i].rollnumber);
        printf("Enter Address: \n");
        scanf("%s",students[i].address); //this won't read address with whitespaces.
        printf("Enter Course: \n");
        scanf("%s",students[i].course);
        
    }

    for (int i = 0; i < 2; i++)
    {
        printf("Strudent Details: %d \n",i+1);
        printf("Name: %s \n Rollnumber: %d \n Address: %s \n Course: %s \n", students[i].name,students[i].rollnumber,students[i].address,students[i].course);
    }
    
    
    return 0;
}

