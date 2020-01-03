CC = gcc

build :helloworld.c 1-two-sum.c
	$(CC) helloworld.c -o helloworld.o
	$(CC) 1-two-sum.c -o 1-two-sum.o

clean:
	-rm *.o
