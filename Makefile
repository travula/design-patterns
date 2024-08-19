all: run-patterns

compile-sp:
	javac -d classes src/com/dp/sp/*.java

run-sp: compile-sp
	java -classpath ./classes/ com.dp.sp.DuckSimulator

compile-op:
	javac -d classes src/com/dp/op/*.java

run-op: compile-op
	java -classpath ./classes/ com.dp.op.WeatherStation

run-patterns: run-sp run-op



