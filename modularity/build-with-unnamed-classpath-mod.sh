rm -rf output
mkdir -p output/mlib

mkdir -p output/classes
javac -d output/classes `find first -name *.java`
jar -c -f output/mlib/first.jar -C output/classes .
rm -rf output/classes

mkdir -p output/classes
javac -d output/classes -p output/mlib/first.jar `find second -name *.java`
jar -c -f output/mlib/second.jar -C output/classes .
rm -rf output/classes

java -classpath output/mlib/first.jar:output/mlib/second.jar com.agiledeveloper.second.Second