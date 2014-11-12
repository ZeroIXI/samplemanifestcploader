Sample-Manifest-Classpath-Loader
================================

This project is reproducing an error occuring with open ejb 4.7.

To reproduce the cp inspection error: 
- set open ejb version in main pom to 4.5 
- build project 
- run java -jar client.jar in the target directory 
 - this should go through 

- set the open ejb version back to 4.7 
- build 
- run 
 - exception should be thrown 

Testet with jdk 7 and 8 already and both should behave the same way. 

This problem can be solved by adding the System Property xbean.finder.use.get-resources=true" to the container.
