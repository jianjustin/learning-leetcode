CC = gcc

helloworld :helloworld.c
	$(CC) helloworld.c -o helloworld.o

clean:
	-rm *.o
