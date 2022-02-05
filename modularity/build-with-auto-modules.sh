# note: this build not runs because of the presence of a module-info.java

rm -rf output
mkdir -p output/mlib

mkdir -p output/classes
javac -d output/classes `find first -name *.java`
jar -c -f output/mlib/first.jar -C output/classes .
rm -rf output/classes

mkdir -p output/classes
javac -d output/classes -classpath output/mlib/first.jar `find second -name *.java`
jar -c -f output/mlib/second.jar -C output/classes .
rm -rf output/classes

java -p output/mlib -m second/com.agiledeveloper.second.Second