CC = gcc

build :helloworld.c 1-two-sum.c
	$(CC) helloworld.c -o helloworld.o
	$(CC) 1-two-sum.c -o 1-two-sum.o
	$(CC) 1281-subtract-the-product-and-sum-of-digits-of-an-integer.c -o 1281-subtract-the-product-and-sum-of-digits-of-an-integer.o
clean:
	-rm *.o
