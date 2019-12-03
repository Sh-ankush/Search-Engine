import java.util.Scanner;
class MenuRestro
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int flags;
double amt=0;
do
{
System.out.printf("Enter your choice :%n1)-->DOSA %n2)-->SAMOSA %n3)-->IDLI %n4)-->WADA PAV %n5)-->SANDWICDH %n6)-->CUTLET %n7)-->ICECREAM %n8)-->BURGER %n9)-->PIZZA %n10)-->GENERATE BILL");
flags = sc.nextInt();
switch(flags)
{
case 1:
{
System.out.println("Please enter quantity of Dosa (Rs 20 per plate) ");
amt = amt + 20*sc.nextInt();
break;
}

case 2:
{
System.out.println("Please enter quantity  of samosa (Rs 10 per pc)");
amt = amt + 10*sc.nextInt();
break;
}

case 3:
{
System.out.println("Please enter quantity of idli (Rs 10 per plate)");
amt = amt  + 10*sc.nextInt();
break;
}
case 4:
{
System.out.println("Please enter quantity of wada pav(Rs 10 per pc)");
amt = amt  + 10*sc.nextInt();
break;
}

case 5:
{
System.out.println("Please enter quantity of sandwich(Rs 10 per pc)");
amt = amt  + 10*sc.nextInt();
break;
}

case 6:
{
System.out.println("Please enter quantity of cutlet(Rs 25 per pc)");
amt = amt  + 25*sc.nextInt();
break;
}

case 7:
{
System.out.println("Please enter quantity of Icecream(Rs 1000 per pc)");
amt = amt  + 1000*sc.nextInt();
break;
}

case 8:
{
System.out.println("Please enter quantity of Burger(Rs 150 per pc)");
amt = amt  + 150*sc.nextInt();
break;
}

case 9:
{
System.out.println("Please enter quantity of Pizza(Rs 250 per pc)");
amt = amt + 250*sc.nextInt();
break;
}


case 10:
{
System.out.println("TOTAL BILL = Rs "+amt);
System.exit(0);
}

}
}while(flags!= 10);
}

}