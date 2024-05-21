import java.util.Scanner;
public class Final_Basic
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int choice,order,qty;double price,amt=0,tamt=0,gst;char ans;
        System.out.println("***********Hello and welcome to Good Vibes fast food restaurant**********************");
        System.out.println("Where we serve food with good vibes :)");
        while(true)
        {
        System.out.println("\nEnter : \n1. View the Menu\n2. Order Food\n3. Exit");
        System.out.println("Enter Your Choice : ");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1 : System.out.println("S.no\tItem\t\tPrice");
                     System.out.println("1\tPav bhaji \t80.00");
                     System.out.println("2\tItalian Pizza\t250.00");
                     System.out.println("3\tArabiata Pasta\t200.00");
                     System.out.println("4\tCheese Burger\t40.00");
                     System.out.println("5\tJain Burger\t35.00");
                     System.out.println("6\tFrench Fries\t75.00");
                     System.out.println("7\tCurly Fries\t85.00");
                     System.out.println("8\tThumbs up\t30.00");
                     System.out.println("9\tCoca cola\t25.00");
                     System.out.println("10\tSprite\t\t25.00");break;
            case 2 : while(true)
                    {
                        System.out.println("\nEnter your Order : ");
                        order=sc.nextInt();
                        switch(order)
                        {
                            case 1 : System.out.println("Your Order : Pav bhaji");
                                     System.out.println("Enter Quantity : ");
                                     qty=sc.nextInt();
                                     price=80;
                                     amt+=(price*qty);
                                     break;
                            case 2 : System.out.println("Your Order : Italian Pizza");
                                     System.out.println("Enter Quantity : ");
                                     qty=sc.nextInt();
                                     price=250;
                                     amt+=(price*qty);
                                     break;
                            case 3 : System.out.println("Your Order : Arabiata Pasta");
                                     System.out.println("Enter Quantity : ");
                                     qty=sc.nextInt();
                                     price=200;
                                     amt+=(price*qty);
                                     break;
                            case 4 : System.out.println("Your Order : Cheese Burger");
                                     System.out.println("Enter Quantity : ");
                                     qty=sc.nextInt();
                                     price=40;
                                     amt+=(price*qty);
                                     break;
                            case 5 : System.out.println("Your Order : Jain Burger");
                                     System.out.println("Enter Quantity : ");
                                     qty=sc.nextInt();
                                     price=35;
                                     amt+=(price*qty);
                                     break;
                            case 6 : System.out.println("Your Order : French Fries");
                                     System.out.println("Enter Quantity : ");
                                     qty=sc.nextInt();
                                     price=75;
                                     amt+=(price*qty);
                                     break;
                            case 7 : System.out.println("Your Order : Curly Fries");
                                     System.out.println("Enter Quantity : ");
                                     qty=sc.nextInt();
                                     price=85;
                                     amt+=(price*qty);
                                     break;
                            case 8 : System.out.println("Your Order : Thumbs Up");
                                     System.out.println("Enter Quantity : ");
                                     qty=sc.nextInt();
                                     price=30;
                                     amt+=(price*qty);
                                     break;
                            case 9 : System.out.println("Your Order : Coca cola");
                                     System.out.println("Enter Quantity : ");
                                     qty=sc.nextInt();
                                     price=25;
                                     amt+=(price*qty);
                                     break;
                            case 10 : System.out.println("Your Order : Sprite");
                                     System.out.println("Enter Quantity : ");
                                     qty=sc.nextInt();
                                     price=25;
                                     amt+=(price*qty);
                                     break;
                            default : System.out.println("Invalid Choice ");
                        }
                        System.out.println("Do you want to order more good food ? (y/n) : ");
            ans=sc.next().charAt(0);
            if(ans=='n')
            {
                if(amt<301)
                {
                    System.out.println("Amount of Items : "+amt);
                    System.out.println("Discount of 2%\nGST : 5%");
                    tamt=(amt+(0.05*amt))-(0.02*amt);
                System.out.println("Total Amount : "+tamt);
                System.out.println("Thank you for shopping with us.\nHave a great day :)");
                }
                else if(amt>=301 && amt<=600)
                {
                     System.out.println("Amount of Items : "+amt);
                    System.out.println("Discount of 4%\nGST : 5%");
                    tamt=(amt+(0.05*amt))-(0.04*amt);
                System.out.println("Total Amount : "+tamt);
                System.out.println("Thank you for shopping with us.\nHave a great day :)");
                }
                else if(amt>=601)
                {
                     System.out.println("Amount of Items : "+amt);
                    System.out.println("Discount of 8%\nGST : 5%");
                    tamt=(amt+(0.05*amt))-(0.08*amt);
                System.out.println("Total Amount : "+tamt);
                System.out.println("Thank you for shopping with us.\nHave a great day :)");
                }
                break;
            }
                    }break;
                    
                  
            case 3 : System.exit(0);break;
            default : System.out.println("Invalid Choice");
        }
        }
    }
}