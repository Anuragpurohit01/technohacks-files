#include<stdio.h>
#include<string.h>

int main()
{
    char s[1000];
    int i, n, c=0;

    printf("enter the string: \n");
    gets(s);
    n=strlen(s);

    for(i=0;i<n/2;i++)
    {
        if(s[i]==s[n-i-1])
        c++;

    }
    if(c==i)
    printf("String is palindrome ");
    else
    printf("String is not palindrome");
    return 0;
}