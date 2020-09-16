mkdir -p ./junit/4.12/
wget -P ./junit/4.12/ https://repo1.maven.org/maven2/junit/junit/4.12/junit-4.12.jar
mkdir -p ./org/hamcrest/hamcrest-core/1.3/
wget -P ./org/hamcrest/hamcrest-core/1.3/ https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar

mkdir -p target/classes/
javac -d ./target/classes ./src/MyStack.java ./src/MyStackDemo.java

mkdir ./target/test-classes/
javac -d ./target/test-classes/ -cp ./target/classes:./junit/4.12/*:./org/hamcrest/hamcrest-core/1.3/* ./src/MyStackTest.java
java -cp ./target/classes:./junit/4.12/*:./org/hamcrest/hamcrest-core/1.3/*:./target/test-classes org.junit.runner.JUnitCore MyStackTest