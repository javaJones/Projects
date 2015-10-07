/*********************************************************
*
* 
Module username:    Server Template program                   
*
* 
  File username:    serverTemplate.c	                  
*
* 
    Summary:
    This file contains a template for
         **
                building a server application

*
*
*
********************************************************/


#include <stdio.h>

#include <sys/types.h>

#include <sys/socket.h>

#include <netinet/in.h>

#include <arpa/inet.h>




int main(int argc, char *argv[])

{
    
   int sock;                        /* Socket */
    
   struct sockaddr_in ServAddr;     /* Local address */
    
   struct sockaddr_in ClntAddr;     /* Client address */
    
   unsigned int cliAddrLen;         /* Length of incoming message */
    
   char echoBuffer[2000];           /* Buffer for echo string */
    
   unsigned short PortNo;           /* Server port */
    
   int newsock;
    
   int numread;
    
   int i;

	
   char username[25];
	
   char addcolon[3] = ": ";
	
   char buffer2[750];
	
   char msg[750];
	
   char clearbuffer[750];





    
 
   if (argc != 2)                   /* Test for correct number of parameters */
    {
        printf("Usage:  %s <SERVER PORT>\n", argv[0]);
        
            exit(1);

   }


    
   PortNo = atoi(argv[1]);          /* First arg:  local port */


    
   /* Create socket */
    
   if ((sock = socket(AF_INET, SOCK_STREAM, 0)) < 0)
        
   {
            
      printf("socket() failed");
            
      exit (1);
        
   }

 

   /* Construct local address structure */
    
   memset(&ServAddr, 0, sizeof(ServAddr));       /* Zero out structure */
          ServAddr.sin_family = AF_INET;                /* Internet address family */
     ServAddr.sin_addr.s_addr = htonl(INADDR_ANY); /* Any incoming interface */
      ServAddr.sin_port = htons(PortNo);            /* Local port */

    

   /* Bind to the local address */
    
   printf("About to bind to port %d\n", PortNo);
   if (bind(sock, (struct sockaddr *) &ServAddr, sizeof(ServAddr)) < 0)
 
   {

      printf ("bind() failed");
        
      exit (1);
    
   }
 
 

   
 
   listen(sock, 5);
 
	
   system ("clear");
	
   printf("Enter your username: ");
	
   gets(username);
	
   strcat(username,addcolon);
	
   system ("clear");
	
   printf("Welcome\n\n");
	   

    
   
   for (;;)       /* Run forever */
    
   {
        
      /* Set the size of the in-out parameter */
   
      cliAddrLen = sizeof(ClntAddr);

  
      /* wait for connection */
   
      newsock = accept(sock, (struct sockaddr *) &ClntAddr, &cliAddrLen);
             printf("Handling client %s\n", inet_ntoa(ClntAddr.sin_addr));

		
   
   for (;;) 
   {

        
        
      numread = read(newsock, &echoBuffer, 2000); // check for empty msg

      if (numread <= 0) 
      {
         break;
      }
		

      printf("%s\n", echoBuffer); 
		
      strcpy(echoBuffer,clearbuffer);
		
		
		      strcpy(echoBuffer, username);
		
      printf("%s",username);
		
      gets(msg);
		
      strcat(echoBuffer,msg);
		          
      write(newsock, echoBuffer, strlen(echoBuffer)+1);
		
      strcpy(msg,clearbuffer);
		

		
   }

        

close(newsock);

    
  }
    /* NOT REACHED */


}

