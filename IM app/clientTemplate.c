/*********************************************************
*
* Module username:  Client Template File
*
* File username:    clientTemplate.c
*
* Summary:
*  This file contains a template for creating a
*       TCP client application
*
*
*********************************************************/
#include <stdio.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>


int main(int argc, char *argv[])
{
    int sock;                        /* Socket descriptor */
    struct sockaddr_in ServAddr;     /* Server address */
    unsigned short ServPort;         /* Echo server port */


    if (argc != 3)    /* Test for correct number of arguments */
    {
        printf("Usage: %s <ServerAddress> <ServerPortNumber>\n", argv[0]);
        exit(1);
    }

    /* save the port number */
    ServPort = atoi(argv[2]);

    /* Construct the server address structure */
    memset(&ServAddr, 0, sizeof(ServAddr));    /* Zero out structure */
    ServAddr.sin_family = AF_INET;                 /* Internet addr family */
    ServAddr.sin_addr.s_addr = inet_addr(argv[1]);  /* Server IP address */
    ServAddr.sin_port = htons(ServPort);     /* Server port */

    /* create a socket */
    if ((sock = socket(PF_INET, SOCK_STREAM, 0)) < 0)
    {
        printf("socket() failed\n");
        exit(1);
    }

    /* connect to server */
    if( connect(sock, (struct sockaddr *) &ServAddr, sizeof(ServAddr)) < 0)
    {
        printf("connect() failed\n");
        exit(1);
    }

/****    Application code goes here    ****/

	
char username[25];
	
char msg[750];
	
char addcolon[3] = ": ";
	
char escchar[2] = "#";
	
char clearbuffer[750];
 /**/
	
char buffer1[750];
	
char buffer2[750];


system ("clear");

	
printf("Enter your username:");

	
gets(username);
	
strcat(username,addcolon);

	
system ("clear");
	
printf("Welcome!\n\n");
	

for (;;)
{

	
   strcpy(buffer2, username);

	
   printf("%s",username);

	
   gets(msg);

		
   if( strcmp(msg,escchar) == 0)
		
   {
		
      break;
		
   }

	

strcat(buffer2,msg);
	
write(sock, buffer2, strlen(buffer2)+1);
	
strcpy(buffer2,clearbuffer);


	
int bytecount = read(sock, buffer1, 100);
	
printf ("%s\n", buffer1);
	
strcpy(buffer1,clearbuffer);
	
	
}

	

close(sock);

}



