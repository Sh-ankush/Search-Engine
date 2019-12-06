#include <stdio.h>

int main()
{

    int ch;
    int a = 0;
    int x,y;
    int res;
    while(!a)
    {
        printf("\nPlease select an option :");
        printf("\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. EXIT\n");

        scanf("%d", &ch);

        switch(ch)
        {
            case 1:
            {
                    printf("Please enter two numbers to add :");
                    scanf("%d%d",&x,&y);
                    res = x+y;
                    printf("%d\n",res);
            }
            break;
            case 2:
            {
                    printf("Please enter two numbers to subtract :");
                    scanf("%d%d",&x,&y);
                    res = x-y;
                    printf("%d\n",res);
            }
            break;
            case 3:
            {
                    printf("Please enter two numbers to multiply :");
                    scanf("%d%d",&x,&y);
                    res = x*y;
                    printf("%d\n",res);
            }
            break;
            case 4:
            {
                    printf("Please enter numerator to divide :");
                    scanf("%d",&x);
                    printf("Please enter denominator to divide :");
                    scanf("%d",&y);
                    if(y==0)
                    {
                        printf("Undifined value:");
                    }
                    else
                    {
                    res = x+y;
                    printf("%d\n",res);
                    }

            }
            break;
            case 5:
            {
                    a=1;
            }
            break;
        }
    }




}