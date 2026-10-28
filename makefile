Guesser.class: Guesser.java
	javac Guesser.java

run: Guesser.class
	java Guesser

clean: 
	rm *.class

debug: useStudent
	gdb useStudent

valgrind: useStudent
	valgrind --leak-check=full --show-leak-kinds=all --track-origins=yes ./useStudent