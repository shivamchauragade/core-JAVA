
package project;


import java.util.Scanner;
import java.util.Random;
class Ticket
{
   int S;
   int people;
   int date;
   int ticketN;
   int adult,child;
   String origin;
   String destination;
   String type;
   int Rs;
   int a,b;
   String c;

   public void setPlat(int ticketN,String origin,int people,int date,int a,int b,String c)
   {
    this.ticketN=ticketN;
    this.origin=origin;
    this.people=people;
    this.date=date;
    this.a=a;
    this.b=b;
    this.c=c;
   }
   public void SetTicket(int a,int b, String c,int date,int ticketN,int adult,int child,String origin,String destination,String type)
   {
    this.a=a;
    this.b=b;
    this.c=c;
    this.date=date;
    this.ticketN=ticketN;
    this.adult=adult;
    this.child=child;
    this.origin=origin;
    this.destination=destination;
    this.type=type;
   }
   public void getPlatform()
   {
        Rs=50*people;
        System.out.println("--------------------------------------------------------------------");
        System.out.println("                     ** PLATFORM TICKET **                    ");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("|                                                                   ");
        System.out.println("| TIME:"+a+":"+b +c+"                     TICKET NO.:"+ticketN+"    ");
        System.out.println("|                                                                   ");
        System.out.println("| ORIGIN : "+origin+"                                               ");
        System.out.println("| PERSON : "+people+"                                               ");
        System.out.println("| FIFTY RUPEES PER PERSON                RS : "+Rs+"/-              "); 
        System.out.println("| Date of Journey :"+date+" Nov 2021                                "); 
        System.out.println("| VALID TILL 3 HOURS AS PER TICKET TIME                             ");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("\n\n\n");
   }
   public void getTicket(String origin)
   { 
      if("Nagpur".equals(origin) && "Pune".equals(destination))
      {
        int Distance=713;
        if(null != type)
          switch (type) {
              case "General":
                  Rs=350*adult+170*child;
                  break;
              case "Sleeper":
                  Rs=550*adult+370*child;
                  break;
              case "3A":
                  Rs=1200*adult+800*child;
                  break;
              case "2A":
                  Rs=1800*adult+1300*child;
                  break;
              default:
                  break;
          }
        
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                     ** HAPPY JOURNEY **                               ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|                                                                            ");
        System.out.println("| TIME:"+a+":"+b +c+"                                 TICKET NO.: "+ticketN   );
        System.out.println("|                                                                            ");
        System.out.println("| ORIGIN : "+origin+" Junction                                               ");
        System.out.println("| DESTINATION : "+destination+" Junction                                     ");
        System.out.println("| ADULT : "+adult+"                                   Distance:"+Distance+"KM");
        System.out.println("| CHILD : "+child+"                                   RS : "+Rs+"/-          "); 
        System.out.println("| Date of Journey :"+date+" Nov 2021                  Type:"+type             );
        System.out.println("| VALID TILL 24 HOURS AS PER TICKET TIME                                     ");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("\n\n\n");
      }
   
      else if("Nagpur".equals(origin) && "Mumbai".equals(destination))
      {
        int Distance=824;
        if("General".equals(type))
        {
             Rs=380*adult+185*child; 
        }
        else if("Sleeper".equals(type))
        {
            Rs=580*adult+380*child; 
        }
        else if("3A".equals(type))
        {
            Rs=1300*adult+800*child; 
        }
        else if("2A".equals(type))
        {
            Rs=1800*adult+1200*child;
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                     ** HAPPY JOURNEY **                               ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|                                                                            ");
        System.out.println("| TIME:"+a+":"+b +c+"                                 TICKET NO.: "+ticketN   );
        System.out.println("|                                                                            ");
        System.out.println("| ORIGIN : "+origin+" Junction                                               ");
        System.out.println("| DESTINATION : "+destination+" Junction                                     ");
        System.out.println("| ADULT : "+adult+"                                   Distance:"+Distance+"KM");
        System.out.println("| CHILD : "+child+"                                   RS : "+Rs+"/-          "); 
        System.out.println("| Date of Journey :"+date+" Nov 2021                  Type:"+type             );
        System.out.println("| VALID TILL 24 HOURS AS PER TICKET TIME                                     ");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("\n\n\n");
      }
      else if("Pune".equals(origin) && "Mumbai".equals(destination))
      {
        int Distance=149;
        if("General".equals(type))
        {
             Rs=100*adult+50*child; 
        }
        else if("Sleeper".equals(type))
        {
            Rs=300*adult+150*child; 
        }
        else if("3A".equals(type))
        {
            Rs=900*adult+400*child; 
        }
        else if("2A".equals(type))
        {
            Rs=1400*adult+800*child;
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                     ** HAPPY JOURNEY **                               ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|                                                                            ");
        System.out.println("| TIME:"+a+":"+b +c+"                                 TICKET NO.: "+ticketN   );
        System.out.println("|                                                                            ");
        System.out.println("| ORIGIN : "+origin+" Junction                                               ");
        System.out.println("| DESTINATION : "+destination+" Junction                                     ");
        System.out.println("| ADULT : "+adult+"                                   Distance:"+Distance+"KM");
        System.out.println("| CHILD : "+child+"                                   RS : "+Rs+"/-          "); 
        System.out.println("| Date of Journey :"+date+" Nov 2021                  Type:"+type             );
        System.out.println("| VALID TILL 24 HOURS AS PER TICKET TIME                                     ");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("\n\n\n");
      }
      else if("Mumbai".equals(origin) && "Pune".equals(destination))
      {
        int Distance=149;
        if("General".equals(type))
        {
             Rs=100*adult+50*child; 
        }
        else if("Sleeper".equals(type))
        {
            Rs=300*adult+150*child; 
        }
        else if("3A".equals(type))
        {
            Rs=900*adult+400*child; 
        }
        else if("2A".equals(type))
        {
            Rs=1400*adult+800*child;
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                     ** HAPPY JOURNEY **                               ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|                                                                            ");
        System.out.println("| TIME:"+a+":"+b +c+"                                 TICKET NO.: "+ticketN   );
        System.out.println("|                                                                            ");
        System.out.println("| ORIGIN : "+origin+" Junction                                               ");
        System.out.println("| DESTINATION : "+destination+" Junction                                     ");
        System.out.println("| ADULT : "+adult+"                                   Distance:"+Distance+"KM");
        System.out.println("| CHILD : "+child+"                                   RS : "+Rs+"/-          "); 
        System.out.println("| Date of Journey :"+date+" Nov 2021                  Type:"+type             );
        System.out.println("| VALID TILL 24 HOURS AS PER TICKET TIME                                     ");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("\n\n\n");
      }
      else if("Pune".equals(origin) && "Nagpur".equals(destination))
      {
          int Distance=713;
        if("General".equals(type))
        {
            Rs=350*adult+170*child; 
        }
        else if("Sleeper".equals(type))
        {
            Rs=550*adult+370*child; 
        }
        else if("3A".equals(type))
        {
            Rs=1200*adult+800*child; 
        }
        else if("2A".equals(type))
        {
            Rs=1800*adult+1300*child;
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                     ** HAPPY JOURNEY **                               ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|                                                                            ");
        System.out.println("| TIME:"+a+":"+b +c+"                                 TICKET NO.: "+ticketN   );
        System.out.println("|                                                                            ");
        System.out.println("| ORIGIN : "+origin+" Junction                                               ");
        System.out.println("| DESTINATION : "+destination+" Junction                                     ");
        System.out.println("| ADULT : "+adult+"                                   Distance:"+Distance+"KM");
        System.out.println("| CHILD : "+child+"                                   RS : "+Rs+"/-          "); 
        System.out.println("| Date of Journey :"+date+" Nov 2021                  Type:"+type             );
        System.out.println("| VALID TILL 24 HOURS AS PER TICKET TIME                                     ");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("\n\n\n");
        
      }
      else if("Mumbai".equals(origin) && "Nagpur".equals(destination))
      {
        int Distance=824;
        if("General".equals(type))
        {
             Rs=380*adult+185*child; 
        }
        else if("Sleeper".equals(type))
        {
            Rs=580*adult+380*child; 
        }
        else if("3A".equals(type))
        {
            Rs=1300*adult+800*child; 
        }
        else if("2A".equals(type))
        {
            Rs=1800*adult+1200*child;
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                     ** HAPPY JOURNEY **                               ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|                                                                            ");
        System.out.println("| TIME:"+a+":"+b +c+"                                 TICKET NO.: "+ticketN   );
        System.out.println("|                                                                            ");
        System.out.println("| ORIGIN : "+origin+" Junction                                               ");
        System.out.println("| DESTINATION : "+destination+" Junction                                     ");
        System.out.println("| ADULT : "+adult+"                                   Distance:"+Distance+"KM");
        System.out.println("| CHILD : "+child+"                                   RS : "+Rs+"/-          "); 
        System.out.println("| Date of Journey :"+date+" Nov 2021                  Type:"+type             );
        System.out.println("| VALID TILL 24 HOURS AS PER TICKET TIME                                     ");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("\n\n\n");
      }
      else if("Nagpur".equals(origin) && "Delhi".equals(destination))
      {
        int Distance=1068;
        if("General".equals(type))
        {
             Rs=450*adult+225*child; 
        }
        else if("Sleeper".equals(type))
        {
            Rs=650*adult+420*child; 
        }
        else if("3A".equals(type))
        {
            Rs=1500*adult+800*child; 
        }
        else if("2A".equals(type))
        {
            Rs=2000*adult+1100*child;
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                     ** HAPPY JOURNEY **                               ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|                                                                            ");
        System.out.println("| TIME:"+a+":"+b +c+"                                 TICKET NO.: "+ticketN   );
        System.out.println("|                                                                            ");
        System.out.println("| ORIGIN : "+origin+" Junction                                               ");
        System.out.println("| DESTINATION : "+destination+" Junction                                     ");
        System.out.println("| ADULT : "+adult+"                                   Distance:"+Distance+"KM");
        System.out.println("| CHILD : "+child+"                                   RS : "+Rs+"/-          "); 
        System.out.println("| Date of Journey :"+date+" Nov 2021                  Type:"+type             );
        System.out.println("| VALID TILL 24 HOURS AS PER TICKET TIME                                     ");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("\n\n\n");
      }
      else if("Delhi".equals(origin) && "Nagpur".equals(destination))
      {
        int Distance=1068;
        if("General".equals(type))
        {
             Rs=450*adult+225*child; 
        }
        else if("Sleeper".equals(type))
        {
            Rs=650*adult+420*child; 
        }
        else if("3A".equals(type))
        {
            Rs=1500*adult+800*child; 
        }
        else if("2A".equals(type))
        {
            Rs=2000*adult+1100*child;
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                     ** HAPPY JOURNEY **                               ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|                                                                            ");
        System.out.println("| TIME:"+a+":"+b +c+"                                 TICKET NO.: "+ticketN   );
        System.out.println("|                                                                            ");
        System.out.println("| ORIGIN : "+origin+" Junction                                               ");
        System.out.println("| DESTINATION : "+destination+" Junction                                     ");
        System.out.println("| ADULT : "+adult+"                                   Distance:"+Distance+"KM");
        System.out.println("| CHILD : "+child+"                                   RS : "+Rs+"/-          "); 
        System.out.println("| Date of Journey :"+date+" Nov 2021                  Type:"+type             );
        System.out.println("| VALID TILL 24 HOURS AS PER TICKET TIME                                     ");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("\n\n\n");
      }
      else if("Mumbai".equals(origin) && "Delhi".equals(destination))
      {
        int Distance=1368;
        if("General".equals(type))
        {
              Rs=675*adult+330*child; 
        }
        else if("Sleeper".equals(type))
        {
            Rs=870*adult+420*child; 
        }
        else if("3A".equals(type))
        {
            Rs=1700*adult+900*child; 
        }
        else if("2A".equals(type))
        {
            Rs=2300*adult+1300*child;
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                     ** HAPPY JOURNEY **                               ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|                                                                            ");
        System.out.println("| TIME:"+a+":"+b +c+"                                 TICKET NO.: "+ticketN   );
        System.out.println("|                                                                            ");
        System.out.println("| ORIGIN : "+origin+" Junction                                               ");
        System.out.println("| DESTINATION : "+destination+" Junction                                     ");
        System.out.println("| ADULT : "+adult+"                                   Distance:"+Distance+"KM");
        System.out.println("| CHILD : "+child+"                                   RS : "+Rs+"/-          "); 
        System.out.println("| Date of Journey :"+date+" Nov 2021                  Type:"+type             );
        System.out.println("| VALID TILL 24 HOURS AS PER TICKET TIME                                     ");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("\n\n\n");
      }
      else if("Pune".equals(origin) && "Delhi".equals(destination))
      {
        int Distance=1472;
        if("General".equals(type))
        {
              Rs=700*adult+350*child; 
        }
        else if("Sleeper".equals(type))
        {
            Rs=900*adult+420*child; 
        }
        else if("3A".equals(type))
        {
            Rs=1800*adult+1000*child; 
        }
        else if("2A".equals(type))
        {
            Rs=2500*adult+1300*child;
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                     ** HAPPY JOURNEY **                               ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|                                                                            ");
        System.out.println("| TIME:"+a+":"+b +c+"                                 TICKET NO.: "+ticketN   );
        System.out.println("|                                                                            ");
        System.out.println("| ORIGIN : "+origin+" Junction                                               ");
        System.out.println("| DESTINATION : "+destination+" Junction                                     ");
        System.out.println("| ADULT : "+adult+"                                   Distance:"+Distance+"KM");
        System.out.println("| CHILD : "+child+"                                   RS : "+Rs+"/-          "); 
        System.out.println("| Date of Journey :"+date+" Nov 2021                  Type:"+type             );
        System.out.println("| VALID TILL 24 HOURS AS PER TICKET TIME                                     ");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("\n\n\n");
      }
      else if("Delhi".equals(origin) && "Mumbai".equals(destination))
      {
        int Distance=1368;
        if("General".equals(type))
        {
              Rs=675*adult+330*child; 
        }
        else if("Sleeper".equals(type))
        {
            Rs=870*adult+420*child; 
        }
        else if("3A".equals(type))
        {
            Rs=1700*adult+900*child; 
        }
        else if("2A".equals(type))
        {
            Rs=2300*adult+1300*child;
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                     ** HAPPY JOURNEY **                               ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|                                                                            ");
        System.out.println("| TIME:"+a+":"+b +c+"                                 TICKET NO.: "+ticketN   );
        System.out.println("|                                                                            ");
        System.out.println("| ORIGIN : "+origin+" Junction                                               ");
        System.out.println("| DESTINATION : "+destination+" Junction                                     ");
        System.out.println("| ADULT : "+adult+"                                   Distance:"+Distance+"KM");
        System.out.println("| CHILD : "+child+"                                   RS : "+Rs+"/-          "); 
        System.out.println("| Date of Journey :"+date+" Nov 2021                  Type:"+type             );
        System.out.println("| VALID TILL 24 HOURS AS PER TICKET TIME                                     ");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("\n\n\n");
      }
      else if("Delhi".equals(origin) && "Pune".equals(destination))
      {
        int Distance=1472;
        if("General".equals(type))
        {
              Rs=700*adult+350*child; 
        }
        else if("Sleeper".equals(type))
        {
            Rs=900*adult+420*child; 
        }
        else if("3A".equals(type))
        {
            Rs=1800*adult+1000*child; 
        }
        else if("2A".equals(type))
        {
            Rs=2500*adult+1300*child;
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                     ** HAPPY JOURNEY **                               ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("|                                                                            ");
        System.out.println("| TIME:"+a+":"+b +c+"                                 TICKET NO.: "+ticketN   );
        System.out.println("|                                                                            ");
        System.out.println("| ORIGIN : "+origin+" Junction                                               ");
        System.out.println("| DESTINATION : "+destination+" Junction                                     ");
        System.out.println("| ADULT : "+adult+"                                   Distance:"+Distance+"KM");
        System.out.println("| CHILD : "+child+"                                   RS : "+Rs+"/-          "); 
        System.out.println("| Date of Journey :"+date+" Nov 2021                  Type:"+type             );
        System.out.println("| VALID TILL 24 HOURS AS PER TICKET TIME                                     ");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("\n\n\n");
      }
      else 
          System.out.println("SORRY!! You have entered wrong entry");
   }
   public void getUtrain()
   {
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("                      **UPCOMING TRAINS**                                                          ");
        System.out.println("---------------------------------------------------------------------------------------------------------");  
        System.out.println("TRAIN NAME                   ROUTE          TRAIN NO.    ARRIVAL ON     DEPARTS ON     PLATFORM NUMBER   ");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("AZAD HIND EXPRESS           NGP-PUNE          12130       1:00 PM        1:10 PM               3         ");
        System.out.println("DURONTO EXPRESS             NGP-MUMBAI        02190       1:30 PM        1:35 PM               4         ");
        System.out.println("KOLHAPUR EXPRESS            PUNE-MUMBAI       01030       2:00 PM        2:10 PM               1         ");
        System.out.println("PUNE DURONTO EXPRESS        MUMBAI-PUNE       12264       2:17 PM        2:27 PM               6         ");   
        System.out.println("KOLHAPUR GONDIA EXPRESS     PUNE-NGP          01039       2:30 PM        2:45 PM               2         ");
        System.out.println("NAGPUR DURONTO EXPRESS      MUMBAI-NGP        02189       3:15 PM        3:22 PM               3         ");
        System.out.println("RAJDHANI EXPRESS            NGP-DELHI         12433       3:45 PM        3:55 PM               1         ");
        System.out.println("TELANGANA EXPRESS           DELHI-NGP         02724       4:00 PM        4:12 PM               3         ");
        System.out.println("GARIB RATH EXPRESS          MUMBAI-DELHI      12909       4:25 PM        4:30 PM               1         ");
        System.out.println("GOA EXPRESS                 PUNE-DELHI        02779       4:38 PM        4:45 PM               5         ");
        System.out.println("PASCHIM EXPRESS             DELHI-MUMBAI      02926       4:50 PM        5:05 PM               6         ");
        System.out.println("SAMPARK KRANTI EXPRESS      DELHI-PUNE        02630       6:00 PM        6:10 PM               3         ");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("\n\n\n");
   }
}

/**
 *
 * @author dell
 */
public class RailwayTest {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        Ticket T=new Ticket();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("              ** WELCOME TO NAGPUR RAILWAY STATION **                  ");
        System.out.println("-----------------------------------------------------------------------------");
        while(true)
        {
        System.out.println("SELECT THE OPTION WHERE \n 1: Platform ticket \n 2: Train Ticket \n 3: Upcoming Train Status");
        int S=scanner.nextInt();
        if(S==1)
        {
            int ticketN=random.nextInt(899999);
            ticketN=ticketN+100000; 
            System.out.println("Enter origin of your Platform");
            String origin=scanner.next();
            System.out.println("Enter the Number of person want platform ");
            int people=scanner.nextInt(); 
            System.out.println("Enter the Date");
            int date=scanner.nextInt(); 
            System.out.println("Enter Time of your journey in hr");
            int a=scanner.nextInt();
            System.out.println("Enter Time of your journey in minutes");
            int b=scanner.nextInt();
            System.out.println("Enter Either AM or PM");
            String c=scanner.next();
            T.setPlat(ticketN, origin, people, date, a, b, c);
            T.getPlatform();
        }
        else if(S==2)
        {
        System.out.println("Enter Time of your journey in hr");
        int a=scanner.nextInt();
        System.out.println("Enter Time of your journey in minutes");
        int b=scanner.nextInt();
        System.out.println("Enter Either AM or PM");
        String c=scanner.next();
        int ticketN=random.nextInt(899999);
        ticketN=ticketN+100000; 
        System.out.println("Enter the Number of adult for your journey");
        int adult=scanner.nextInt();
        System.out.println("Enter the Number of child for your journey");
        int child=scanner.nextInt();
        System.out.println("Enter the starting point of your journey");
        String origin=scanner.next();
        System.out.println("Enter the destination of your journey");
        String destination=scanner.next();
        System.out.println("Enter the Class of ticket (IN WORDS) where 1:General 2:Sleeper 3:3A 4:2A");
        String type=scanner.next();
        T.SetTicket(a, b, c, a, ticketN, adult, child, origin, destination, type);
        T.getTicket(origin);
        
        }
        else if(S==3)
        {
            T.getUtrain();
        }
        else 
           System.out.println("PLEASE SELECT THE OPTION BETWEEN 1 TO 3 \n\n\n"); 
        }
        
    }
    
    
}

