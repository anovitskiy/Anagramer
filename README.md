# Coding Exercise

Write a Java program that takes as it's input an arbitrarily long sequence of words where each word has arbitrary length and is limited to the 26 characters (a-z).  The output of this program is a boolean value for each input word.  TRUE if the word is an anagram of any of the previous inputs, and FALSE otherwise.  The program should read its input from a file of newline separated words and write its output to standard out.  The program should make efficient use of memory and perform well with large data sets.

Provide some test cases to demonstrate that the code works as expected. Also, please provide a solution that does not use existing Java collections.

Also, please provide a written explanation of your approach to the problem,  your thought process in your choice of data structures and algorithms (including any choices you considered and rejected), design tradeoffs, and why you expect your design to perform well with very large data sets. 

How does the memory footrpint scale with the number of words and the word lengths? How does the response time scale with the number of words and word lengths? The answers to these scalability questions depend not only on the program design, but on the nature of the input sets.  A complete and precise treatment is a major undertaking, but take it as far as you can go.  If you make any simplifying assumptions about the input distributions, call them out.  Can you make empirical measurements to verify your scalability theories?  If you don't have time to make those measurements, explain how you would go about collecting the data.
